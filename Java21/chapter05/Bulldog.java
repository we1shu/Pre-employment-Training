package chapter05;

import chapter03.Dog;

public class Bulldog extends Dog {

    public Bulldog(String name, int weight, int height) {
        super(name, weight, height);
    }

    @Override
    public void introduce() {
        System.out.println("ブルルルル...");
        super.introduce();
        System.out.println("ブルルルル...");

    }
}
