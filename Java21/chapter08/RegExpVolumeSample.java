package chapter08;

public class RegExpVolumeSample {
    public static void main(String[] args) {
        Boolean result1 = "Java".matches("Java*"); // true
        System.out.println("JavaaaaはJav の後に a の0回以上の繰り返し*か：" + result1);
        Boolean result2 = "Java".matches("Java*"); // true
        System.out.println("JavaはJav の後に a の0回以上の繰り返し*か：" + result2);
        Boolean result3 = "Jav".matches("Java*"); // true
        System.out.println("JavはJav の後に a の0回以上の繰り返し*か：" + result3);
        Boolean result4 = "aaaaa".matches("a{5}"); // true
        System.out.println("aaaaaはaの5回の繰り返しか：" + result4);
        Boolean result5 = "03-1234-5678".matches("\\d{2}-\\d{4}-\\d{4}"); // true
        System.out.println("03-1234-5678は数字2回、ハイフン、数字4回、ハイフン、数字が4回か：" + result5);
    }
}