package chapter05;

public class BattleRobot extends Robot {
    // 継承により、共通部分の実装は不要になる。
    // private int energy;
    // private String name;

    // コンストラクタの書き方を変更
    public BattleRobot(int energy, String name) {
        // 親クラスのコンストラクタ(Robot(int energy, String name)を呼び出す)
        super(energy, name);
    }

    // public void introduce() {
    // System.out.println("私の名前は" + this.name + "です。");
    // }

    public boolean punch() {
        if(this.getEnergy() < 10) {
            System.out.println("...エネルギー切れでパンチが打てません。");
            return false;
        }
        System.out.println(this.getName() + "パーンチ!");
        this.setEnergy(this.getEnergy() - 10);
        return true;
    }

    // オーバーライド
    @Override
    public void introduce() {
        // 親クラスの introduce メソッドを呼び出す
        super.introduce();
        // 独自の処理
        System.out.println(this.getName() + "は戦闘型ロボットだよ！");
    }
}