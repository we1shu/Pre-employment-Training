package chapter03;

public class CircleSample {

    public static void main(String[] args) {
        // 半径5の円を表すインスタンスを作成
        Circle circle_a = new Circle();
        circle_a.radius = 5;

        // 半径10の円を表すインスタンスを作成
        Circle circle_b = new Circle();
        circle_b.radius = 10;

        circle_a.printDescription();
        circle_b.printDescription();
    }
}
