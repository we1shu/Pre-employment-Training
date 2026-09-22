package chapter10;

public class NotCatchSample {

    public static void main(String[] args) {
        try{
            sample2();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void sample() throws Exception{
        throw new Exception();
    }

    public static void sample2() throws Exception{
        sample();
    }

}