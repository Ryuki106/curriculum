package Ques29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import map.MapData;

public class main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MapData[] data = {
            new MapData("北海道", "札幌市", 83424),
            new MapData("青森県", "青森市", 9646),
            new MapData("岩手県", "盛岡市", 15275),
            new MapData("宮城県", "仙台市", 7282),
            new MapData("秋田県", "秋田市", 11638),
            new MapData("山形県", "山形市", 9323),
            new MapData("福島県", "福島市", 13784),
            new MapData("茨城県", "水戸市", 6097),
            new MapData("栃木県", "宇都宮市", 6408),
            new MapData("群馬県", "前橋市", 6362),
            new MapData("埼玉県", "さいたま市", 3798)
        };

        String input = sc.nextLine();
        String[] parts = input.split(",");

        List<MapData> pickedList = new ArrayList<>();
        for (String s : parts) {
            try {
                int index = Integer.parseInt(s.trim());
                if (index >= 0 && index < data.length) {
                    pickedList.add(data[index]);
                }
            } catch (Exception e) {}
        }

        if (pickedList.isEmpty()) return;

        int order = 1;
        try {
            order = Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {}

        if (order == 1) {
            pickedList.sort((a, b) -> Double.compare(b.getArea(), a.getArea())); // 昇順：小→大
        } else if (order == 2) {
            pickedList.sort((a, b) -> Double.compare(a.getArea(), b.getArea())); // 降順：大→小
        }

        for (MapData p : pickedList) {
            p.printInfo();
        }

        sc.close();
    }
}