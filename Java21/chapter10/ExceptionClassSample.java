package chapter10;

public class ExceptionClassSample {

    public static void main(String[] args) {
        try {
            // 1. 例外クラスのコンストラクタにメッセージ文字列を渡す。
            throw new SelfMadeException("メッセージだよ！");
        } catch (SelfMadeException e) {
            // 2. 渡されたメッセージを getMessage メソッドで取得して出力する
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}