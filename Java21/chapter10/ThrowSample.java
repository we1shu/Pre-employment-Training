package chapter10;

public class ThrowSample {
    public static void main(String args[]) {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
