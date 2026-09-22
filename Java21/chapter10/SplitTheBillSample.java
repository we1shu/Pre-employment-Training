package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SplitTheBillSample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("割り勘計算プログラム");
        try {
            System.out.print("金額を入力してください(1-100000): ");
            int price = scanner.nextInt();
            if(price < 1 || price > 100000) {
                throw new NumberOutOfRangeException("金額は1-100000円の範囲で入力してください");
            }
            System.out.print("人数を入力してください(1-10): ");
            int number = scanner.nextInt();
            if(number < 1 || number > 10) {
                throw new NumberOutOfRangeException("人数は1-10人の範囲で入力してください");
            }
            System.out.println("一人当たり" + (price / number) + "円です。");

        } catch(InputMismatchException e) {
            System.out.println("不正な入力が行われました。");
        } catch(NumberOutOfRangeException e) {
            System.out.println("値の範囲が不正です。" + e.getMessage());
        }

    }
}
