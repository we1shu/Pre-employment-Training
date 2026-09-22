
import java.util.*;

public class BigOrSmall {
    public static void main(String[] args){
        int playCount = 0;
        while (playCount < 3){
            int playAgain = play(playCount);
            if (playAgain == 0) {
                System.out.println("終了します。");
                break;
            }
            else {
                playCount++;
            }
        }

    }
    public static int play(int playCount){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num;
        int nextNum;

        num = random.nextInt(7) + 2;
        nextNum = random.nextInt(9) + 1;

        System.out.println("コンピュータが選んだ数字： " + num);
        System.out.print("次に出る数字がこれより小さいか大きいか当ててください（0:小さい、1:大きい）： " );
        int choseNum = sc.nextInt();
        System.out.printf("次の数字は%dでした。\n", nextNum);
        if (num == nextNum){
            System.out.println("Draw");
        }
        else{
            if (choseNum == 0){
                if (num > nextNum ){
                    System.out.println("Win!");
                }
                else{
                    System.out.println("Lose..");
                }
            }
            else{
                if (num < nextNum ){
                    System.out.println("Win!");
                }
                else{
                    System.out.println("Lose..");
                }
            }
        }
        if (playCount == 2) {
            System.out.println("プレイ回数が上限に達したので終了します。");
            return -1;
        }
        else {
            System.out.print("もう一度プレイしますか？（0:いいえ、1:はい）： ");
            int playAgain = sc.nextInt();
            return playAgain;
        }

    }
}