package chapter06;

public class Bee implements Flyable{
    private String name;

    public Bee(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println(this.name + "はブンブンと飛び回った。");
    }
}