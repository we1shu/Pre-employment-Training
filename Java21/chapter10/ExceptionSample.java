package chapter10;

import java.util.Scanner;

public class ExceptionSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("割り勘計算プログラム");
        try {
            System.out.print("金額を入力してください: ");
            int price = Integer.parseInt(scanner.next());
            System.out.print("人数を入力してください: ");
            int number = Integer.parseInt(scanner.next());
            System.out.println("一人当たり" + (price / number) + "円です。");
        } catch(NumberFormatException e) {
            System.out.println("異常な値が入力されました。処理を終了します。");
            // 例外の情報（スタックトレース）を表示
            e.printStackTrace();
        } catch(ArithmeticException e) {
            System.out.println("0で割り算を行おうとしてエラーが発生しました。処理を終了します。");
            // 例外の情報（スタックトレース）を表示
            e.printStackTrace();
        }

    }
}
