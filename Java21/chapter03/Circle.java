package chapter03;

public class Circle {

    public double radius;

    //定义一个全局共享、永远不能修改的常量。
    public static final double PI = 3.14;

    public double calculateCircumference(){
        return 2 * PI * radius;
    }

    public double calculateArea(){
        return PI * radius * radius;
    }

    public void printDescription(){
        System.out.println("半径" + radius + "の円について");
        System.out.println("円周の長さは" + this.calculateCircumference() + "です。");
        System.out.println("面積は" + this.calculateArea() + "です。");
    }
}
