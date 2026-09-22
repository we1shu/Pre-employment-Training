package chapter09;

import java.util.Optional;
import java.util.Scanner;

public class OptionalSample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("文字を入力してください: ");
        String input = scanner.next();

        String str = null;
        if ("abc".equals(input)) {
            str = "ok";
        }

        //

        // str を Optional<String> 型の変数に格納
        Optional<String> nullableStr = Optional.ofNullable(str);
        // 1. orElse メソッドで、文字列が設定されていればその文字列、null ならば引数の「null」という文字列を戻り値とする
        // 2. メソッドチェーンで戻り値に対して toUpperCase メソッドを実行
        System.out.println(nullableStr.orElse("null").toUpperCase());

    }

}