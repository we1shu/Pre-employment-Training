package chapter05;

public class Robot {
    private int energy;
    private String name;

    public Robot(int energy, String name) {
        this.energy = energy;
        this.name = name;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getName() {
        return this.name;
    }

    public void introduce() {
        System.out.println("私の名前は" + this.name + "です。");
    }
}