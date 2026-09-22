package chapter09;

import java.util.Scanner;

public class NonOptionalSample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        // str の中身は null か 「OK」
        String str = null;
        if (input.equals("abc")) {
            str = "OK";
        }

        // null チェック
        if (str == null) {
            // もし null だった場合、以降の処理がエラーにならないように代わりの文字列を入れる
            str = "null";
        }
        //str.toUpperCase()　小文字から大文字変更
        System.out.println(str.toUpperCase());

    }

}