package Qianxin;

import java.util.*;

/**
 * @author pandaxubo
 * @description 输入一个字符串，空格隔开，遇见undo删除前面一个单词，redo撤销删除，最后输出。
 * 例如 输入 hello undo redo world. 输出 hello world.
 */
public class Two{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            List<String> s = Arrays.asList(in.nextLine().split(" "));
            List<String> copy = new ArrayList<>();
            String temp = null;
            int num = 0;
            for(int i = 0;i< s.size();i++){
                if(s.get(i).equals("undo")){
                    temp = s.get(i-1);
                    num = i-1;
                    //copy.add(s.get(i));
                    System.out.println(copy);
                    System.out.println(i-1);
                    copy.remove(i-1);
                    //System.out.println(temp);
                    //System.out.println(num);

                }
                else if(s.get(i).equals("redo")){
                    //System.out.println(s.get(i));
                    copy.add(num,temp);
                }
                else{
                    copy.add(s.get(i));
                }
            }
            for(int j = 0;j< copy.size();j++){
                if( j == copy.size()-1){
                    System.out.println(copy.get(j));
                }
                else{
                    System.out.print(copy.get(j)+" ");
                }
            }
        }
    }
}







