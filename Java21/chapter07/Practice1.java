package chapter07;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("誕生日の月を入力してください（1〜12）: ");
        int mouth = scanner.nextInt();
        System.out.print("誕生日の日を入力してください（1〜31）: ");
        int day = scanner.nextInt();
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(today.getYear(), mouth, day);
        if (today.equals(birthday)) {
            System.out.println("今日は誕生日です");
        } else if (today.isAfter(birthday)) {
            birthday = birthday.plusYears(1);
            long days = ChronoUnit.DAYS.between(today, birthday);
            System.out.println("誕生日まであと " + days);
        }else {
            long days = ChronoUnit.DAYS.between(today, birthday);
            System.out.println("誕生日まであと " + days);
        }
    }
}
