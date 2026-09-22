package chapter04;

public class Cat {

    private static int count = 0;

    public static void sayCount() {
        System.out.println("現在のCatインスタンスは" + Cat.count + "体です");
    }

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.age = 0;
        this.name = name;
        if (age >= 0 && age <= 10) {
            this.age = age;
        }
        Cat.count++;
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 10) {
            this.age = age;
        }
    }



    public void shout() {
        System.out.println("にゃー!");
    }

    public void introduce() {
        System.out.println("名前は" + this.name + "、" + this.age + "才です。");
        this.shout();
        Cat.sayCount();
    }

    public void introduce(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("名前は" + this.name + "、" + this.age + "才です。");
            this.shout();
        }
    }
}