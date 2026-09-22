package chapter09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {
        List<Map<String, List<String>>> userList = new ArrayList<>();

        Map<String, String> user1 = new HashMap<>();

        user1.put("userId", "1");
        user1.put("userName", "田中太郎");
        user1.put("age", "25");
        user1.put("gender", "男性");

        Map<String, String> user2 = new HashMap<>();

        user2.put("userId", "2");
        user2.put("userName", "山田花子");
        user2.put("age", "30");
        user2.put("gender", "女性");

        Map<String, String> user3 = new HashMap<>();

        user3.put("userId", "3");
        user3.put("userName", "鈴木次郎");
        user3.put("age", "35");
        user3.put("gender", "男性");

        Map<String, String> user4 = new HashMap<>();

        user4.put("userId", "4");
        user4.put("userName", "佐藤三郎");
        user4.put("age", "40");
        user4.put("gender", "男性");

        List<Map<String, String>> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        for(Map<String, String> user : users) {
            System.out.println(user.get("userName") + "さんのユーザー情報");
            System.out.println("ユーザーID:　" + user.get("userId"));
            System.out.println("年齢: " + user.get("age"));
            System.out.println("性別: " + user.get("gender"));
            System.out.println("");
        }








    }

}
