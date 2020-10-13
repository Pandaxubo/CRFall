package Practice;

/**
 * @author pandaxubo
 * @description Leetcode14
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串""。
 *
 * 示例1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母a-z。
 *
 *一种偷懒做法：对strs排序，之后返回第一个和最后一个的前缀
 */
public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] test = {"carrr","coshf"};
        LongestCommonPrefix l = new LongestCommonPrefix();
        System.out.println(l.longestCommonPrefix1(test));
        System.out.println(l.longestCommonPrefix2(test));
    }

    /**
     * 方法一：横向比较,比较每两个元素之间的前缀并不断更新
     * @param strs 输入字符串
     * @return Longest Common Prefix of strs
     */
    String longestCommonPrefix1 (String[] strs) {
        if(strs == null || strs.length == 0 )   return "";
        String sub = strs[0];
        for(int i = 1;i< strs.length;i++){
            sub = update(sub, strs[i]);
        }
        return sub;
    }

    String update(String s1, String s2){
        int len = Math.min(s1.length(),s2.length());
        int index = 0;
        while(index < len && s1.charAt(index) == s2.charAt(index))    index++;
        return s1.substring(0,index);
    }

    /**
     * 方法二：纵向比较，按照每一个char开始对每个String的每一位进行查找
     * @param strs 输入字符串
     * @return Longest Common Prefix of strs
     */
    String longestCommonPrefix2 (String[] strs){
        if(strs == null || strs.length == 0 )   return "";
        for(int i = 0;i< strs[0].length();i++){
            char c = strs[0].charAt(i);
            for(String s : strs){
                if(i == s.length() || s.charAt(i) != c )    return s.substring(0,i);
            }
        }
        return strs[0];
    }
}
