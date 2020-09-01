package FiveEight;

import java.util.ArrayList;

/**
 * @author pandaxubo
 *
 * @description 找出一个ArrayList<ArrayList<String>>中的重复项并输出，输出结果为ArrayList<String>
 */
public class findCommonString {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> values = new ArrayList<>();
        values.add(new ArrayList<String>() {{
            add("a");
            add("adb");
            add("gae");
            add("ddd");
            add("you");
            add("better");
            add("aaaaa");
        }});
        values.add(new ArrayList<String>() {{
            add("a1");
            add("adb");
            add("g2ae");
            add("dd1d");
            add("you");
            add("better");
            add("aaabaa");
        }});
        values.add(new ArrayList<String>() {{
            add("2a1");
            add("adb2");
            add("g2ae");
            add("ddd");
            add("you");
            add("better");
            add("aacba");
        }});
        System.out.println("Targeted List:");
        System.out.println(values);
        System.out.println("Common Substring:");
        System.out.println(find(values));
    }



    public static ArrayList<String> find(ArrayList<ArrayList<String>> values) {
        // write code here
        if (values.size() == 0) {
            return new ArrayList<>();
        }
        ArrayList<String> ans = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            ArrayList<String> temp = values.get(i);
            ans = fun(temp, ans);
        }
        return ans;
    }

    public static ArrayList<String> fun(ArrayList<String> l1, ArrayList<String> l2) {
        ArrayList<String> ans = new ArrayList<>();
        for (String s : l2) {
            if (l1.contains(s) && !ans.contains(s)) {
                ans.add(s);
            }
        }
        return ans;
    }
}
