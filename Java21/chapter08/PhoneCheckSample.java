package chapter08;

public class PhoneCheckSample {
    public static void main(String[] args) {
        String phoneNumber = "03-1234-5678";
        if (phoneNumber.matches("03-\\d{4}-\\d{4}")) {
            System.out.println("東京都の番号です");
        } else {
            System.out.println("東京都の番号ではありません");
        }
    }
}
