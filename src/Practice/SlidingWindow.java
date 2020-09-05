package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author pandaxubo
 *
 * @description 滑动窗口框架。时间复杂度为O(n)
 * 算法思路：
 * int left = 0, right = 0;
 *
 * while (right < s.size()) {
 *     // 增大窗口
 *     window.add(s[right]);
 *     right++;
 *
 *     while (window needs shrink) {
 *         // 缩小窗口
 *         window.remove(s[left]);
 *         left++;
 *     }
 * }
 *
 * 此处以leetcode 76为例。
 */
public class SlidingWindow {

    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return input.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);
            line = in.readLine();
            String t = stringToString(line);

            String ret = minWindow(s, t);

            String out = (ret);

            System.out.print(out);
        }
    }

    public static String minWindow(String s, String t) {
            Map<Character, Integer> need =new HashMap<>();
            Map<Character, Integer> window =new HashMap<>();
            for(int i = 0; i< t.length();i++){
                need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
            }
            int left = 0;
            int right = 0;
            int valid = 0;
            int start = 0;
            int len = Integer.MAX_VALUE;//最小覆盖字串的起始索引和长度
            while(right < s.length()){
                char c = s.charAt(right);
                right++;
                if(need.containsKey(c)){
                    window.put(c,window.getOrDefault(c,0)+1);
                    if(window.get(c).equals(need.get(c))){
                        valid++;
                    }
                }
                //System.out.println("window:"+"["+left+","+right+")");
                while(valid == need.size()){
                    char d = s.charAt(left);
                    left++;
                    if(right - left < len){
                        start = left;
                        len = right - left;
                    }
                    if(need.containsKey(d)){
                        if(window.get(d).equals(need.get(d))){
                            valid--;
                        }
                        window.put(d,window.getOrDefault(d,0)-1);
                    }
                }
            }
            return len == Integer.MAX_VALUE? "" : s.substring(start-1,start+len);
        }




}