package chapter08;

public class ManyParameterSample {
    public static void main(String[] args) {
        int hour = 7;
        int minute = 15;
        int second = 0;
        int milliSecond = 150;
        //String message = "現在の時刻は" + hour + "時" + minute + "分" + second + "秒" + milliSecond + "です";
        // 書式文字列に追記
        String message = String.format("現在の時刻は%02d時%03d分%04d秒%05dです", hour, minute, second, milliSecond);
        System.out.println(message);
    }
}
