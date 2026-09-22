package chapter08;

public class RegExpDefinedSample {
    public static void main(String[] args) {
        // チェック対象の文字列.matches(正規表現);
        //Java源码"
        // \\d"
        //        ↓ Java解析字符串
        //  \d
        //        ↓ 交给Regex
        //一个数字
        Boolean result1 = "1".matches("\\d"); // true
        System.out.println("1は数字か：" + result1);
        Boolean result2 = "あ".matches("\\w"); // true
        System.out.println("あは英単語を構成する文字か：" + result2);
        Boolean result3 = "あ".matches("\\W"); // false
        System.out.println("あは英単語を構成する文字以外か：" + result3);
        Boolean result4 = "Javあ".matches("Jav."); // true
        System.out.println("JavあはJavの後に任意の１文字か：" + result4);
        Boolean result5 = "Jav".matches("Jav."); // false
        System.out.println("JavはJavの後に任意の１文字か：" + result5);
    }
}
