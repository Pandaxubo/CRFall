package Futu;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pandaxubo
 *
 * @description 已知一个字符数组，其中存储有R、G、B字符，要求将所有的字符按照RGB的顺序进行排序。比如给定一个数组为char s[] = "RGBBRGGBGB"，则排序后应该为RRGGGGBBBB。
 */
public class RGBString {
    public static void main(String[] args) {
        String s = "RGBBRGGBGB";
        System.out.println(RGBSort1(s));
        System.out.println(RGBSort2(s));
        System.out.println(RGBSort3(s));
    }

    private static String RGBSort1(String s) {
        if (s.length() == 0) {
            return "null";
        }
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            switch (c) {
                case 'R':
                    map.put('R', map.getOrDefault('R', 0) + 1);
                    break;
                case 'G':
                    map.put('G', map.getOrDefault('G', 0) + 1);
                    break;
                case 'B':
                    map.put('B', map.getOrDefault('B', 0) + 1);
                    break;
            }
        }
        int rlen = map.get('R');
        int glen = map.get('G');
        for (int j = 0; j < arr.length; j++) {
            if (j < rlen) {
                arr[j] = 'R';
            } else if (j < rlen + glen) {
                arr[j] = 'G';
            } else {
                arr[j] = 'B';
            }
        }
        return String.valueOf(arr);
    }

    private static String RGBSort2(String s) {
        if (s.length() == 0) {
            return "null";
        }
        char[] arr = s.toCharArray();
        int low = 0;
        int high = arr.length;
        int r = -1;
        int g = -1;
        for(int i = low;i <= high;i++){

        }
        return String.valueOf(arr);
    }

    private static String RGBSort3(String s) {
        if (s.length() == 0) {
            return "null";
        }
        int[] res = {0, 0, 0};
        char[] arr = s.toCharArray();
        for (char c : arr) {
            switch (c) {
                case 'R':
                    res[0]++;
                    break;
                case 'G':
                    res[1]++;
                    break;
                case 'B':
                    res[2]++;
                    break;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (j < res[0]) {
                arr[j] = 'R';
            } else if (j < res[0] + res[1]) {
                arr[j] = 'G';
            } else {
                arr[j] = 'B';
            }
        }
        return String.valueOf(arr);
    }
}
