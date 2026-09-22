package chapter06;

public class AbstractSample {

    public static void main(String[] args) {
        Cat mike = new Cat("ミケ", 3);
        Dog taro = new Dog("太郎", 2);
        Sheep shawn = new Sheep("ショーン", 5);

        mike.shout();
        taro.shout();
        shawn.shout();

    }

}