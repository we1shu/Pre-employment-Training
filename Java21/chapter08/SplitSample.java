package chapter08;

public class SplitSample {
    public static void main(String[] args) {
        String testText = "Lorem ipsum dolor sit amet,aliquip malorum omnesque sea at.";
        String[] split = testText.split("\\W"); // 英単語を構成する文字(a~z, A~Z, _) 以外の文字で分割する
        for (String string : split) {
            System.out.println(string);
        }
    }
}
