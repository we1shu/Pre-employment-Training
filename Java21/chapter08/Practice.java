package chapter08;

public class Practice {
    public static void main(String[] args) {
        String str = "CodeCamp is a great place to learn programming!";

        System.out.println("文字列の長さ: " + str.length());

        System.out.println("great が含まれている: " + str.contains("great"));

        System.out.println("Good が含まれている: " + str.contains("Good"));

        System.out.println("excellent に置換: " + str.replace("great", "excellent"));

        System.out.println("@ に置換: " + str.replace("a", "@"));


    }
}
