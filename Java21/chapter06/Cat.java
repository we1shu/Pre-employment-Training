package chapter06;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    // 抽象メソッドをオーバーライド
    @Override
    public void shout() {
        System.out.println("ニャーニャー");
    }
}