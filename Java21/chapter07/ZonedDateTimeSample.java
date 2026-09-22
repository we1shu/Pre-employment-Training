package chapter07;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeSample {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("# サンプル1: ZoneId の取得");
        ZoneId zoneIdDefault = ZoneId.systemDefault();
        System.out.println(zoneIdDefault);

        System.out.println();
        System.out.println("# サンプル2: of メソッドによる ZoneId の生成");
        ZoneId zoneId1 = ZoneId.of("Europe/Paris");
        System.out.println(zoneId1);
        ZoneId zoneId2 = ZoneId.of("JST", ZoneId.SHORT_IDS);
        System.out.println(zoneId2);

        System.out.println();
        System.out.println("# サンプル3: ZonedDateTime のさまざまな生成方法");
        // デフォルトのタイムゾーンで現在時刻を取得
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println(zonedDateTime1);
        // 指定したタイムゾーンで現在時刻を取得
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zonedDateTime2);
        // LocalDateTimeとZoneIdから作成
        LocalDateTime localDateTime = LocalDateTime.of(2024, 8, 24, 10, 0, 0);
        ZoneId zoneId = ZoneId.of("Europe/London");
        ZonedDateTime zonedDateTime3 = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime3);
        // 年月日時分秒とZoneIdから作成
        ZonedDateTime zonedDateTime4 = ZonedDateTime.of(2024, 8, 24, 10, 0, 0, 0, ZoneId.of("Asia/Tokyo"));
        System.out.println(zonedDateTime4);
        // 文字列から作成
        ZonedDateTime zonedDateTime5 = ZonedDateTime.parse("2024-08-24T10:00:00+09:00[Asia/Tokyo]");
        System.out.println(zonedDateTime5);
        // DateTimeFormatterを使って文字列から作成
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss VV");
        ZonedDateTime zonedDateTime6 = ZonedDateTime.parse("2024/08/24 10:00:00 Europe/Paris", formatter1);
        System.out.println(zonedDateTime6);

        System.out.println();
        System.out.println("# サンプル4: タイムゾーンの異なる ZonedDateTime の比較");
        ZonedDateTime japanDateTime = ZonedDateTime.of(2024, 3, 15, 10, 0, 0, 0, ZoneId.of("Asia/Tokyo"));
        ZonedDateTime americaDateTime = ZonedDateTime.of(2024, 3, 14, 22, 0, 0, 0, ZoneId.of("America/New_York"));
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss VV");
        System.out.println("日本の日時: " + japanDateTime.format(formatter2));
        System.out.println("アメリカの日時: " + americaDateTime.format(formatter2));
        System.out.println("アメリカの日時は日本の日時より過去か: " + americaDateTime.isBefore(japanDateTime));
        System.out.println("日本の日時はアメリカの日時より過去か: " + japanDateTime.isBefore(americaDateTime));

        System.out.println();
        System.out.println("# サンプル5: UTCに変換");
        ZonedDateTime japanDateTimeUTC = japanDateTime.withZoneSameInstant(ZoneId.of("UTC"));
        ZonedDateTime americaDateTimeUTC = americaDateTime.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("日本の日時(UTC): " + japanDateTimeUTC.format(formatter2));
        System.out.println("アメリカの日時(UTC): " + americaDateTimeUTC.format(formatter2));
    }

}