package bigorsmall;
import java.util.Scanner;

public class Round {
    private int roundNumber;

    private int maxRounds;

    private int currentNumber;

    private int nextNumber;

    private String prediction;

    private static final String BIG = "b";
    private static final String SMALL = "s";
    private static final int MAX_NUMBER = 9;

    Scanner scanner = new Scanner(System.in);

    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(MAX_NUMBER);

    public Round(int roundNumber, int currentNumber, int maxRounds) {
        this.roundNumber = roundNumber;
        this.currentNumber = currentNumber;
        this.maxRounds = maxRounds;
    }

    private void inputPrediction() {

        while (true) {
            System.out.print("あなたの予測: [b/s]: ");
            prediction = scanner.next();
            if (prediction.equals(BIG) || prediction.equals(SMALL)) {
                break;
            }
        }
        nextNumber = randomNumberGenerator.generate();
        System.out.println("次の数値: " + nextNumber);
    }

    public int play() {

        System.out.println("[ラウンド" + roundNumber + " - 残り" + (maxRounds - roundNumber) + "回]");
        System.out.println("現在の数値: " + currentNumber);
        inputPrediction();
        while (currentNumber == nextNumber) {
            System.out.println("Draw");
            System.out.println("現在の数値: " + currentNumber);
            inputPrediction();
        }

        if (isCorrect()) {
            System.out.println("正解！");
        } else {
            System.out.println("不正解");
        }

        return nextNumber;
    }

    public boolean isCorrect(){
        return prediction.equals(BIG) && currentNumber < nextNumber || prediction.equals(SMALL) && currentNumber > nextNumber;
    }
}
