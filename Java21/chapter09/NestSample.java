package chapter09;

import java.util.ArrayList;
import java.util.List;

public class NestSample {
    public static void main(String[] args) {
        // ArrayListのネスト
        // ArrayListの中にArrayListが入っているイメージ
        List<List<Integer>> twoDimensionArray = new ArrayList<>();

        List<Integer> row0 = new ArrayList<>();
        row0.add(10);
        row0.add(20);
        row0.add(30);

        List<Integer> row1 = new ArrayList<>();
        row1.add(100);
        row1.add(200);
        row1.add(300);

        twoDimensionArray.add(row0);
        twoDimensionArray.add(row1);

        System.out.println(twoDimensionArray);

        // 拡張 for 文で取り出し
        for (List<Integer> arrayList : twoDimensionArray) {
            for (Integer integer : arrayList) {
                System.out.println(integer);
            }
        }
    }
}
