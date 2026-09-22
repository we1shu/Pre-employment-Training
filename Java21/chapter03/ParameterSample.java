package chapter03;

import chapter02.Cat;

public class ParameterSample {
    public static void main(String[] args){
//        Cat taro = new Cat();
//        taro.name = "Taro";
//        taro.age = 3;
//        taro.introduce();

        Cat taro = new Cat("Taro", 3);

        System.out.println("名前: " + taro.name);
    }
}
