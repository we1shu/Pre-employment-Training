package chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOSample {
    public static void main(String[] args) {
        // 書き込み用ファイル名
        String fileName = "example.txt";

        // 書き込む内容
        String content = "こんにちは、Java IO の世界！";

        // ファイルへの書き込み
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(content);
            writer.newLine(); // 改行
            System.out.println("ファイルに書き込みました: " + fileName);
        } catch (IOException e) {
            System.err.println("書き込みエラー: " + e.getMessage());
        }

        // ファイルからの読み込み
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("ファイルから読み込んだ内容:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("読み込みエラー: " + e.getMessage());
        }
    }
}