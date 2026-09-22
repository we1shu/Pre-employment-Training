package chapter03;

public class NonObjectSample {
    public static void main(String[] args) {
        introduce("太郎", 3);

    }

    public static void shout() {
        System.out.println("にゃー!");
    }

    public static void introduce(String name, int age) {
        System.out.println("名前は" + name + "、" + age + "才です。");
        shout();
    }


}
