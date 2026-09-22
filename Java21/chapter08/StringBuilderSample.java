package chapter08;

public class StringBuilderSample {

    public static void main(String[] args) {
        // 1. 基本の使い方
        StringBuilder builder = new StringBuilder(); // (1)
        builder.append("abc"); // (2)
        builder.append("def"); // (3)
        String testString = builder.toString(); // (4)
        System.out.println(testString);

        // 2. 処理速度の違いを確認する
        final int LOOP_NUM = 200000;
        /* +演算子で連結する ----------------- */
        System.out.println("+演算子で連結します");
        String string = "";
        // 現在時刻をミリ秒で取得
        long start = System.currentTimeMillis();
        for (int i = 0; i < LOOP_NUM; i++) {
            string += "a";
            printIndicator(i);
        }
        // 現在時刻をミリ秒で取得
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        /* StringBuilderで連結する ----------------- */
        System.out.println("StringBuilderで連結します");
        StringBuilder sb = new StringBuilder();
        // 現在時刻をミリ秒で取得
        start = System.currentTimeMillis();
        for (int i = 0; i < LOOP_NUM; i++) {
            sb.append("a");
            printIndicator(i);
        }
        // 現在時刻をミリ秒で取得
        end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

    }

    /**
     * 時間がかかる処理のため、10000ループごとに「|」をprintして進捗を表示する。
     * @param i ループ変数
     */
    private static void printIndicator(int i) {
        if (i % 10000 == 0) {
            System.out.print("|");
        }
    }

}