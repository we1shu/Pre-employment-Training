package chapter04;

public class CapsuleSample {
    public static void main(String[] args) {
        Television television = new Television(2);
        television.printStatus();

        television.setChannel(13);

        System.out.println("channel の値:" + television.getChannel());

        television.printStatus();
    }
}