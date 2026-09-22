package chapter05;

public class CleanerRobot extends Robot {

    public CleanerRobot(int energy, String name) {
        super(energy, name);
    }

    public boolean clean(){
        if(this.getEnergy() < 5){
            System.out.println("...エネルギー切れで掃除ができません。");
            return false;
        }
        System.out.println("きれいにお掃除しました。");
        this.setEnergy(this.getEnergy() - 5);
        return true;
    }
}