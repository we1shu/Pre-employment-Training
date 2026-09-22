package chapter02;

//猫型ロボットの製造機械、Catクラスを作る
public class Cat {

    // private に変更
    private static int count = 0;

    // static メソッド
    public static void sayCount() {
        System.out.println("現在のCatインスタンスは" + Cat.count + "体です");
    }

    // 猫型ロボットは名前を設定できる
    public String name;

    // 猫型ロボットは年齢を設定できる
    public int age;

    // コンストラクタを追記
    public Cat(String name, int age){
        // 第1引数を name に代入
        this.name = name;
        // 第2引数を age に代入
        this.age = age;
        // 新しいインスタンスが作成されるたびにカウントを増やす。
        Cat.count++;
    }

    // 猫型ロボットは鳴き声を上げることができる
    public void shout() {
        System.out.println("にゃー!");
    }

    // 猫型ロボットは自己紹介ができる
    public void introduce() {
        System.out.println("名前は" + this.name + "、" + this.age + "才です。");
        this.shout();
    }

    // 追加するメソッド(引数: 整数型1つ)
    public void introduce(int count) {
        for (int i = 0; i < count; i++){
            System.out.println("名前は" + this.name + "、" + this.age + "才です。");
            this.shout();
        }
    }
}