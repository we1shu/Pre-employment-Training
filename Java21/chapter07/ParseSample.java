
package chapter07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseSample {

    public static void main(String[] args) {
        System.out.println("年-月-日T時:分:秒 の形式からパース");
        var dateTime7 = LocalDateTime.parse("2024-03-15T10:02:30");
        System.out.println(dateTime7);

        var formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        var dateTime8 = LocalDateTime.parse("2024/03/15 10:02:30", formatter);
        var dateTime9 = LocalDateTime.now().format(formatter);
        System.out.println(dateTime8);
        System.out.println(dateTime9);

    }

}