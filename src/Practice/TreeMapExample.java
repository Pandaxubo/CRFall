package Practice;

import java.util.*;

/**
 * @author pandaxubo
 *
 * @description 实现按照key或者value对map的排序。
 * 这里我们采用TreeMap，其特点是默认升序排序。
 * map1是对key进行降序排序，map2是对value进行升序排序。
 */
public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, String> map1 = new TreeMap<>(Comparator.reverseOrder());
        map1.put("b", "ccccc");
        map1.put("d", "aaaaa");
        map1.put("c", "bbbbb");
        map1.put("a", "ddddd");

        Set<String> keySet1 = map1.keySet();
        for (String key : keySet1) {
            System.out.println(key + ":" + map1.get(key));
        }
        System.out.println("--------------------------------------");

        Map<String, String> map2 = new TreeMap<>();
        map2.put("b", "ccccc");
        map2.put("d", "aaaaa");
        map2.put("c", "bbbbb");
        map2.put("a", "ddddd");

        //这里将map.entrySet()转换成list
        List<Map.Entry<String,String>> list = new ArrayList<>(map2.entrySet());
        //然后通过比较器来实现排序
        //升序排序
        list.sort(Map.Entry.comparingByValue());

        for(Map.Entry<String,String> mapping:list){
            System.out.println(mapping.getKey()+":"+mapping.getValue());
        }
    }
}
