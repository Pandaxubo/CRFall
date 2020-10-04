package Weibo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author pandaxubo
 *
 * @description Leetcode 1268
 *
 * 给你一个产品数组products和一个字符串searchWord，products数组中每个产品都是一个字符串。
 *
 * 请你设计一个推荐系统，在依次输入单词searchWord 的每一个字母后，推荐products 数组中前缀与searchWord 相同的最多三个产品。如果前缀相同的可推荐产品超过三个，请按字典序返回最小的三个。
 *
 * 请你以二维列表的形式，返回在输入searchWord每个字母后相应的推荐产品的列表。
 *
 *
 * 示例 1：
 *
 * 输入：products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
 * 输出：[
 * ["mobile","moneypot","monitor"],
 * ["mobile","moneypot","monitor"],
 * ["mouse","mousepad"],
 * ["mouse","mousepad"],
 * ["mouse","mousepad"]
 * ]
 * 解释：按字典序排序后的产品列表是 ["mobile","moneypot","monitor","mouse","mousepad"]
 * 输入 m 和 mo，由于所有产品的前缀都相同，所以系统返回字典序最小的三个产品 ["mobile","moneypot","monitor"]
 * 输入 mou， mous 和 mouse 后系统都返回 ["mouse","mousepad"]
 *
 * 本题可以不使用算法直接解题，思路如下：
 *
 * 对数组排序
 * 对于searchWord的前k位（简记为s）：
 * 遍历products：
 * 若tempList的大小为3，跳出循环
 * 若products[i]的前min(k, products[i].length)位与s相同，加入tempList
 * 将tempList加入list
 * 返回list
 *
 */
public class recommendProducts {
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> list = new ArrayList<>();
        // 排序
        Arrays.sort(products);
        for(int i = 1; i <= searchWord.length(); i ++){
            List<String> tempList = new ArrayList<>();
            // 获得前i位
            String s = searchWord.substring(0, i);
            int size = 0;
            for(String product : products){
                // 判断列表大小
                if(size == 3){
                    break;
                }
                // 判断前缀匹配
                if(product.substring(0, Math.min(i, product.length())).equals(s)){
                    tempList.add(product);
                    size ++;
                }
            }
            list.add(tempList);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String line = in.nextLine();
            String temp = line.substring(2,line.length() -2);
            String[] products = temp.split("\",\"");
            String searchWord = in.next();
            //for(String i : products )System.out.println(i);
            //System.out.println(searchWord);
            System.out.println(suggestedProducts(products, searchWord));
        }
    }
}
