package chapter07;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCalcSample {
    public static void main(String[] args) {
        System.out.println("# サンプル1");
        LocalDateTime base = LocalDateTime.parse("2024-03-15T10:02:30");
        System.out.println("基準の日時： " + base);

        LocalDateTime oneDayLater = base.plusDays(1);
        System.out.println("1日後： " + oneDayLater);

        LocalDateTime twoWeeksAgo = base.minusWeeks(2);
        System.out.println("2週間前： " + twoWeeksAgo);

        LocalDateTime tenMonthsLater = base.plus(10, ChronoUnit.MONTHS);
        System.out.println("10ヶ月後： " + tenMonthsLater);

        LocalDateTime threeHoursAgo = base.minus(3, ChronoUnit.HOURS);
        System.out.println("3時間前： " + threeHoursAgo);
        System.out.println("元の日時： " + base);

        System.out.println();
        System.out.println("# サンプル2");
        LocalDateTime dateTimeA = LocalDateTime.parse("2024-03-15T10:02:30");
        System.out.println("dateTimeA： " + dateTimeA);
        LocalDateTime dateTimeB = LocalDateTime.parse("2024-03-16T10:02:30");
        System.out.println("dateTimeB： " + dateTimeB);
        LocalDateTime dateTimeC = dateTimeA.plusDays(1);
        System.out.println("dateTimeC： " + dateTimeC);
        System.out.println("dateTimeAはdateTimeBより後か： " + dateTimeA.isAfter(dateTimeB));
        System.out.println("dateTimeAはdateTimeBより前か： " + dateTimeA.isBefore(dateTimeB));
        System.out.println("dateTimeBとdateTimeCは等価か： " + dateTimeB.isEqual(dateTimeC));

        System.out.println();
        System.out.println("# サンプル3");
        LocalDateTime startDateTime = LocalDateTime.parse("2024-03-15T10:02:30");
        LocalDateTime endDateTime = LocalDateTime.parse("2025-08-24T15:00:00");
        Duration duration = Duration.between(startDateTime, endDateTime);
        System.out.println(duration);
        System.out.println(duration.toHours());
        System.out.println(duration.toHoursPart());
        System.out.println(duration.toDays());
        System.out.println(duration.toDaysPart());
    }

}