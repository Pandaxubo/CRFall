package Shopee;

import java.util.*;

/**
 * @author pandaxubo
 *
 * @description 找出一句英文中出现第二多的单词
 *
 * input：
 * You cannot improve your past, but you  can improve your future. Once time is wasted, life is wasted wasted !'
 *
 * output:
 * improve
 */
public class FindSecondWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            String s1 = s.replaceAll("[\\pP\\p{Punct}]", "");
            String[] arr = s1.split(" ");
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return (o2.getValue() - o1.getValue()) == 0 ? o1.getKey().compareTo(o2.getKey()): o2.getValue() - o1.getValue();
                }
            });
            List<String> res = new ArrayList<>();
            for (Map.Entry<String, Integer> t : list) {
                res.add(t.getKey());
                System.out.println("Key:"+t.getKey()+","+"Value:"+t.getValue());
            }
            System.out.println(res.get(1));
        }
    }
}
