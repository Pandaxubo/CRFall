package Shopee;

import java.util.*;
public class OperateString {
    public static void main(String[] args) {
        String s1 = "aeasaeseaseasesasesa";
        Queue<Character> q = new PriorityQueue<>((o1,o2)->Character.compare(o2,o1));
        for(int i =0; i<s1.length();i++){
            char c = s1.charAt(i);
            if(!q.contains(c)){
                q.offer(c);
            }
        }
        for(int j =0; j<q.size();j++){
            System.out.print(q.poll());
        }
    }
}