package chapter03;

public class Dog {

    public String name;

    public int weight;

    public int height;

    public Dog (String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    private void introduceName() {
        System.out.println("私の名前は" + this.name + "です。");
    }

    private void introduceWeight() {
        if (this.weight < 10) {
            System.out.println("私の体重は" + this.weight + "です。小型犬です。");
        }
        else if (10 <= this.weight && this.weight < 25) {
            System.out.println("私の体重は" + this.weight + "です。中型犬です。");
        }
        else {
            System.out.println("私の体重は" + this.weight + "です。大型犬です。");
        }
    }

    private void introduceHeight() {
        System.out.println("私の体長は" + this.height + "cmです。");
    }

    public void bark() {
        System.out.println("ワン！");
    }
    public void introduce() {
        this.introduceName();
        this.introduceWeight();
        this.introduceHeight();
        this.bark();
    }

}
