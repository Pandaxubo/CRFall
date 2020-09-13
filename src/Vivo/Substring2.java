package Vivo;

import java.util.Scanner;

/**
 * @author pandaxubo
 *
 * @description leetcode 680
 * 要求返回删除后的字符串或者false
 *
 */
public class Substring2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.next();
            System.out.println(isVaild(s));
        }
    }

    private static String isVaild(String s){
        char[] arr = s.toCharArray();
        int low = 0;
        int high = s.length()-1;
        while(low<high){
            if(arr[low] != arr[high]){
                return isnext(s, arr, low, high);
            }
            low++;
            high--;
        }
        return s;
    }

    private static String isnext(String s,char[] arr, int low, int high){
        int i = low+1;
        int j = high;
        int start = i;
        int end = j;
        while(i<j){
            if(arr[i] != arr[j]){
                return "false";
            }
            i++;
            j--;
        }
        return s.substring(start,end);
    }
}
