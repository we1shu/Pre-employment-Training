package chapter06;

public class Priest extends Character {

    public Priest(String name, int hp, int mp) {
        super(name, hp, mp);
    }
    @Override
    public void attack() {
        System.out.println(this.getName() + "は杖で殴った！");
    }

}