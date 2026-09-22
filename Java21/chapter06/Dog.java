package chapter06;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    // 抽象メソッドをオーバーライド
    @Override
    public void shout() {
        System.out.println("ワンワン");
    }
}