package chapter03;

public class VisibilitySample {

    public static void main(String[] args) {

        Bird akasuke = new Bird("ピーちゃん", 3);
        System.out.println(akasuke.name + "に自己紹介をしてもらいます。");
        // System.out.println(akasuke.age);
        akasuke.introduce();
        // akasuke.shout();

    }

}