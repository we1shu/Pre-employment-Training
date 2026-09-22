package chapter06;

// abstract は「抽象（不完全）クラス」を示し、インスタンス化できないクラスを定義するキーワード
public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    // 抽象メソッド
    public abstract void shout();
}