package chapter06;

public class Bird implements Flyable{
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println(this.name + "は翼をはためかせた。");
    }
}