package chapter03;

public class NonObjectCircleSample {

    public static void main(String[] args) {

        // 元の記述は削除

        printDescription(5.0);
        printDescription(10.0);

    }

    // 円周の長さを求める関数
    public static double calculateCircumference(double radius){
        // radiusは「半径」
        return 2 * 3.14 * radius;
    }

    // 面積を求める関数
    public static double calculateArea(double radius){
        return 3.14 * radius * radius;
    }

    // 説明を出力する関数
    public static void printDescription(double radius){
        System.out.println("半径" + radius + "の円について");
        System.out.println("円周の長さは" + calculateCircumference(radius) + "です。");
        System.out.println("面積は" + calculateArea(radius) + "です。");
    }
}