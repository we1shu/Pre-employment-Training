package chapter08;

public class StringCheckSample {
    public static void main(String[] args) {
        String a = "CodeCamp";
        String b = "codecamp";

        //文字列同士の内容が同じか調べる
        if(a.equals(b)){
            System.out.println("equals true");
        }else{
            System.out.println("equals false");
        }

        //大文字小文字を区別せずに、文字列同士の内容が同じか調べる
        if(a.equalsIgnoreCase(b)){
            System.out.println("equalsIgnoreCase true");
        }else{
            System.out.println("equalsIgnoreCase false");
        }

        //文字列の長さを調べる
        System.out.println("変数aは" + a.length() + "文字です。");

        //空文字列か調べる
        //下記のコメントを外して、どんな動きをするかも体験してみましょう。
        //a = "";
        //a = null; // nullを代入するとisEmpty()の呼び出しでNullPointerExceptionが発生します
        if(a.isEmpty()){
            System.out.println("isEmpty true");
        }else{
            System.out.println("isEmpty false");
        }

    }
}
