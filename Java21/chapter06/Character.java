package chapter06;

public class Character {
    private String name;
    private int hp;
    private int mp;

    public Character(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public void attack() {
        System.out.println(this.getName() + "は体当たりした！");
    }

    public String getName(){
        return this.name;
    }

    public int getMp(){
        return this.mp;
    }

    public void setMp(int mp){
        this.mp = mp;
    }
}