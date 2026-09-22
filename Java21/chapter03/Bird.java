package chapter03;

public class Bird {
    public String name;
    private int age;

    public Bird(String name, int age){
        this.name = name;
        this.age = age;
    }

    private void shout() {
        System.out.println("ピー!");
    }

    private void introduceName() {
        System.out.println("私の名前は" + this.name + "です。");
    }

    private void introduceAge() {
        System.out.println("私の年齢は" + this.age + "才です。");
    }

    public void introduce() {
        this.introduceName();
        this.shout();
        this.introduceAge();
        this.shout();
    }
}