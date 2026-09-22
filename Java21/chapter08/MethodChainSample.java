package chapter08;

public class MethodChainSample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a").append("b").append("c").append("d");
        System.out.println(sb.toString());
    }
}
