package chapter06;

public class Sheep extends Animal {
    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void shout() {
        System.out.println("メーメー");
    }
}
