package ques27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに文字を入力してください");

        String input = scanner.nextLine().trim();

        Map<String, String> scientificNames = new HashMap<>();
        scientificNames.put("ライオン", "パンテラ レオ");
        scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
        scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
        scientificNames.put("チンパンジー", "パン・トゥログロディテス");
        scientificNames.put("シマウマ", "チャップマンシマウマ");
        scientificNames.put("インコ", "不明");

        String[] animals = input.split(",");

        for (String a : animals) {
            a = a.trim();
            String[] data = a.split(":");

            if (data.length != 3) {
                continue;
            }

            String name = data[0];
            String height = data[1];
            String speed = data[2];

            String scientific = scientificNames.getOrDefault(name, "不明");

            System.out.println();
            System.out.println("動物名：" + name);
            System.out.println("体長：" + height + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + scientific);
        }

        scanner.close();
    }
}
