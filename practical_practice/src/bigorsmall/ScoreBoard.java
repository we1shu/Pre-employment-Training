package bigorsmall;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard {

    private List<Integer> scores;

    public ScoreBoard() {
        this.scores = new ArrayList<>();

    }

    public void addScore(int score){
        scores.add(score);

    }

    public void show(){
        System.out.println("スコアボード");
        int i = 1;
        for (int score : scores) {
            System.out.println("ラウンド" + i + ": " + score);
            i++;
        }
        System.out.println("合計スコア: " + getTotalScore());

    }

    public int getTotalScore(){
        int sumScore = 0;
        for (int score : scores) {
            sumScore += score;
        }
        return sumScore;
    }

}
