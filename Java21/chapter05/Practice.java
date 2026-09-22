package chapter05;

import chapter03.Dog;

public class Practice {

    public static void main(String[] args) {
        // Dog クラスのインスタンスを生成
        Dog taro = new Dog("太郎", 20, 80);
        // Bulldog クラスのインスタンスを生成
        Bulldog jiro = new Bulldog("次郎", 30, 100);

        // Dog クラスの introduce メソッドを呼び出す
        taro.introduce();
        // Bulldog クラスの introduce メソッドを呼び出す
        jiro.introduce();

    }

}