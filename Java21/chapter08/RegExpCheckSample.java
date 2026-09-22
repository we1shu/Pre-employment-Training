package chapter08;

public class RegExpCheckSample {
    public static void main(String[] args) {
        String string = "CodeCamp"; //チェック対象の文字列

        //matchesメソッドの引数が正規表現
        System.out.println(string.matches("CodeCamp")); // true：stringの中身は「CodeCamp」である
        System.out.println(string.matches("CodeCampGATE")); // false：stringの中身は「CodeCamp」ではない
        System.out.println(string.matches("codecamp")); // false：stringの中身は「CodeCamp」ではない
    }

}
