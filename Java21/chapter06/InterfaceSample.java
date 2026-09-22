package chapter06;

public class InterfaceSample {

    public static void main(String[] args) {
        // Bird bird = new Bird("カモメ");
        // Airplane airplane = new Airplane("ジャンボジェット");
        // Bee bee = new Bee("ミツバチ");

        // bird.fly();
        // airplane.fly();
        // bee.fly();

        // Flyable インターフェースを実装したものの配列
        Flyable[] flyables = {
                new Bird("カモメ"),
                new Airplane("ジャンボジェット"),
                new Bee("ミツバチ")
        };

        for(Flyable flyable : flyables){
            flyable.fly();
        }

    }

}