package chapter06;

public class Knight extends Character {

    public Knight(String name, int hp, int mp) {
        super(name, hp, mp);
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + "は鋭く切りつけた！");
    }
}