package chapter02;

public class ClassSample {
    public static void main(String[] args) {
        // Catクラスを利用して、Catインスタンス（猫型ロボット）を作る
//        Cat taro = new Cat();
//
//        // 名前を設定する
//        taro.name = "太郎";
//        // 年齢を設定する
//        taro.age = 3;
        Cat taro = new Cat("太郎", 3);

        // 猫型ロボットに鳴き声を上げさせる
        taro.shout();
        // 猫型ロボットに自己紹介をさせる
        taro.introduce();

        taro.introduce(3);
//
//        // ここから追記
//        // 2体目の Cat インスタンスを作る
//        Cat mike = new Cat();
//        mike.name = "ミケ";
//        mike.age = 5;
//        mike.introduce();

        Cat mike = new Cat("ミケ", 5);

        mike.introduce();

//        // 3体目の Cat インスタンスを作る
//        Cat tama = new Cat();
//        tama.name = "タマ";
//        tama.age = 4;
//        tama.introduce();

        Cat tama = new Cat("タマ", 4);
        tama.introduce();

        // 追記・static 変数の利用
        // System.out.println("今までに作成したCatインスタンスの数: " + Cat.count);
        // static メソッドの利用
        Cat.sayCount();
    }
}
