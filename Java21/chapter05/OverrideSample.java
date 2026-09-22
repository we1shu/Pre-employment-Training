package chapter05;

public class OverrideSample {

    public static void main(String[] args) {
        BattleRobot ann = new BattleRobot(100, "アン");
        ann.introduce();

        CleanerRobot samba = new CleanerRobot(100, "サンバ");
        samba.introduce();
    }
}
