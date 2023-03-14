package org.example;

import java.io.*;
import java.util.HashMap;
public class Dictionary {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("./words.txt"))) {
            System.out.println("파일 스캔 완료");
            BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
            HashMap<String, String> map = new HashMap<>();

            while (true) {
                System.out.print("검색할 단어를 입력하세요 >> ");
                String serach = scanner.readLine();

                if (serach.equals("exit()")) {
                    System.out.println("시스템 종료.... ");
                    break;
                }

                String line = null;

                while ((line = reader.readLine()) != null) {
                    String[] words = line.split("\t");
                    String[] words2 = words[0].split(" ");
                    map.put(words2[1].trim(), words[1]);

                }

                System.out.println("--------------------------");

                for (String key : map.keySet()) {
                    if (serach.equals(key)) {
                        System.out.println(map.get(serach));
                        break;
                    }
                }

            }

        } catch (IOException e) {
            System.out.println("스캔오류");
            e.printStackTrace();
        }
    }
}