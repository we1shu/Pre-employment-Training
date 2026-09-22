package chapter07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeFormatterSample {

    public static void main(String[] args) {

        System.out.println("1: 現在時刻を指定のフォーマットで表示させる");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 H時m分s秒");
        LocalDateTime now = LocalDateTime.now();
        // 現在時刻を指定のフォーマットで表示
        System.out.println(now.format(formatter));

        System.out.println();
        System.out.println("2: 指定のフォーマットで書かれた日時文字列を LocalDateTime インスタンスにパース");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        // 指定したフォーマットで書かれた日時文字列を LocalDateTime インスタンスにパース
        LocalDateTime parsedDateTime = LocalDateTime.parse("2024/03/15 10:02", formatter2);
        System.out.println(parsedDateTime);

        System.out.println();
        System.out.println("3: 入力された文字列を LocalDateTime インスタンスにパースしてのフォーマットで出力するサンプル");
        Scanner scanner = new Scanner(System.in);
        // 入力を読み取るためのフォーマッター
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        System.out.print("日時を入力してください（例：2024/03/15 10:02）");
        String inputDateTime = scanner.nextLine();
        LocalDateTime parsedDateTime2 = LocalDateTime.parse(inputDateTime, inputFormatter);

        // 出力形式を指定するフォーマッター
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy年M月d日 H時m分");
        System.out.println(parsedDateTime2.format(outputFormatter));

    }

}