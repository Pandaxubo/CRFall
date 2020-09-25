package Shopee;

import java.util.*;
public class OperateString {
    public static void main(String[] args) {
        String s1 = "aeasaeseaseasesasesa";
        Queue<Character> q = new PriorityQueue<>((o1,o2)->Character.compare(o2,o1));
        Stack<Character> res = new Stack<>();
        for(int i =0; i<s1.length();i++){
            char c = s1.charAt(i);
            if(!q.contains(c)){
                q.offer(c);
                res.push(c);
            }
        }
        for(int j =0; j<q.size();j++){
            System.out.print(res.pop());
        }
    }
}