package chapter07;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeSample {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 追記1
        System.out.println("# サンプル1");
        LocalDateTime dateTime1 = LocalDateTime.of(2024, 3, 15, 10, 2);
        System.out.println(dateTime1);
        LocalDateTime dateTime2= LocalDateTime.of(2024, 3, 15, 10, 2, 30);
        System.out.println(dateTime2);
        LocalDateTime dateTime3 = LocalDateTime.of(2024, 3, 15, 10, 2, 30, 560);
        System.out.println(dateTime3);

        System.out.println();
        System.out.println("# サンプル2");
        LocalDateTime dateTime4 = LocalDateTime.of(2024, Month.MAY, 15, 10, 2);
        System.out.println(dateTime4);
        LocalDateTime dateTime5= LocalDateTime.of(2024, Month.APRIL, 15, 10, 2, 30);
        System.out.println(dateTime5);
        LocalDateTime dateTime6 = LocalDateTime.of(2024, Month.AUGUST, 15, 10, 2, 30, 560);
        System.out.println(dateTime6);

        // 追記2
        System.out.println();
        System.out.println("# サンプル3");
        System.out.println(now);
        System.out.println("年: " + now.getYear());
        System.out.println("月: " + now.getMonthValue());
        System.out.println("月の列挙型: " + now.getMonth());
        System.out.println("月の日: " + now.getDayOfMonth());
        System.out.println("年の日: " + now.getDayOfYear());
        System.out.println("曜日の列挙型: " + now.getDayOfWeek());
        System.out.println("時: " + now.getHour());
        System.out.println("分: " + now.getMinute());
        System.out.println("秒: " + now.getSecond());

    }

}