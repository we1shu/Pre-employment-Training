package chapter09;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

    public static void main(String[] args) {
        Set<String> ipAddresses = new HashSet<>();

        String[] accessLog = { // 1日分のアクセスログ
                "202.4.x.x", "202.4.x.x", "49.33.x.x", "202.4.x.x", "49.33.x.x", "222.34.x.x", "180.8.x.x", "202.4.x.x",
                "222.34.x.x", "83.217.x.x", "222.34.x.x", "49.33.x.x" };

        for (String ipAddress : accessLog) {
            // セットに全てのアクセスログを1つずつaddする。
            ipAddresses.add(ipAddress);
        }

        System.out.println(ipAddresses);

    }
}
