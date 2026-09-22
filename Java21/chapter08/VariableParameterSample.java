package chapter08;

public class VariableParameterSample {
    public static void main(String[] args) {
        hoge("a", "b", "c", "d");
        hoge("a", "b");
        hoge("a", "b", "c", "d", "e", "f");
    }
//Object... args、引数に「...」とありますね、こらは可変長引数 という特別な引数
    public static void hoge(Object... args) {
        System.out.println(args.length); // 渡された引数の数を出力する
    }
}
