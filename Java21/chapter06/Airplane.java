package chapter06;

public class Airplane implements Flyable{
    private String name;

    public Airplane(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println(this.name + "はエンジンを点火した。");
    }
}