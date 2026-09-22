package chapter09;

import java.util.Map;
import java.util.HashMap;

public class HashMapSample {
    public static void main(String args[]) {
        Map<String, String> johnDoe = new HashMap<>();
        johnDoe.put("name", "John Doe");
        johnDoe.put("gender", "male");
        johnDoe.put("hobby", "programming");
        johnDoe.put("favorite_food", "apple");

        System.out.println(johnDoe.toString());
        // get メソッドで要素の取り出し
        System.out.println("名前: " + johnDoe.get("name"));

        // 要素の上書き
        johnDoe.put("name", "Updated");
        System.out.println("名前: " + johnDoe.get("name"));

        // 拡張 for文で各要素を取り出し
        for(Map.Entry<String, String> entry : johnDoe.entrySet()) {
            System.out.println(entry.getKey() + "：" + entry.getValue() );
        }

        johnDoe.remove("hobby");
        System.out.println("hobby削除後");

    }
}

