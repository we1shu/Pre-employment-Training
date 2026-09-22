package chapter09;

import java.util.ArrayList;
import java.util.List;

public class ArraySample {

    public static void main(String[] args) {
        // ArrayListを生成。その中身はすべて整数を表すクラス Integer
        List<Integer> list = new ArrayList<>(); // 中身はこの時点で「空」要素数の指定は不要
        list.add(3); // 要素を追加
        list.add(6); // 要素を追加
        list.add(1); // 要素を追加

        for (int value : list) {
            System.out.println(value);
        }

        // 追記1 get メソッドで 要素を取り出す
        System.out.println("0番目の要素: " + list.get(0));
        System.out.println("1番目の要素: " + list.get(1));

        list.remove(1);
        System.out.println("1番目の要素を削除後");

        System.out.println("list の要素数: " + list.size());

    }
}
