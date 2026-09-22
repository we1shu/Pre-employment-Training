package bigorsmall;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BigOrSmall {

    private ScoreBoard scoreBoard;
    private int maxRounds;
    private int consecutiveCorrectCount;

    private static final int BASIC_SCORE = 100;
    private static final int MAX_NUMBER = 9;

    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(MAX_NUMBER);


    public BigOrSmall(int maxRounds) {
        this.maxRounds = maxRounds;
    }

    public void play() {
        consecutiveCorrectCount = 0;
        scoreBoard = new ScoreBoard();
        int nextNumber = randomNumberGenerator.generate();
        for (int i = 1; i <= maxRounds; i++) {
            Round round = new Round(i, nextNumber, maxRounds);
            nextNumber = round.play();
            if (round.isCorrect()) {
                scoreBoard.addScore(BASIC_SCORE + BASIC_SCORE * consecutiveCorrectCount);
                consecutiveCorrectCount++;
            } else {
                scoreBoard.addScore(0);
                consecutiveCorrectCount = 0;
            }

        }

        scoreBoard.show();
        System.out.println();
        showResult();
        System.out.println();
        saveScore();


    }
    public void showResult(){
        System.out.println("GAME OVER");
        System.out.println("最終スコア: " + scoreBoard.getTotalScore());
    }

    public void saveScore() {

        int score = scoreBoard.getTotalScore();

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        String result =
                "Score: " + score +
                        ", Date: " + now.format(formatter);

        try (FileWriter writer = new FileWriter("scores.csv", true)) {

            writer.write(result);
            writer.write(System.lineSeparator());

        } catch (IOException e) {

            e.printStackTrace();

        }
    }


}
