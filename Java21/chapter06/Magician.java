package chapter06;

public class Magician extends Character {
    public Magician(String name, int hp, int mp) {
        super(name, hp, mp);
    }
    @Override
    public void attack() {
        if(this.getMp() >= 10) {
            System.out.println(this.getName() + "は火の玉を投げつけた！");
            this.setMp(this.getMp() - 10);
        } else {
            System.out.println(this.getName() + "はナイフで切りつけた！");
        }
    }

}