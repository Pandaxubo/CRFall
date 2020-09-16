package Shopee;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;

/**
 * @author pandaxubo
 *
 * @description 在无序数组中找到中位数
 *
 * input：
 * 3, 2, 5, 3, 7, 19, 20
 *
 * output：
 * 5
 */
public class ReturnMidNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            String[] arr = s.split(", ");
            int[] tar = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
//            int size = tar.length /2 +1;
//            Queue<Integer> q = new PriorityQueue<>(size);
//            for(int i =0;i<size;i++){
//                q.offer(tar[i]);
//            }
//            for(int j = size;j<tar.length;j++){
//                if(q.peek()<tar[j]){
//                    q.remove();
//                    q.offer(tar[j]);
//                }
//            }
//            if(tar.length %2 ==1 ){
//                System.out.print(q.peek());
//            }
//            else{
//                System.out.print(q.remove()+q.peek()/2);
//            }
            if(tar.length == 0) System.out.println("0");
            Arrays.sort(tar);
            int mid = tar.length/2;
            if(tar.length % 2 == 0){
                System.out.println((double)(tar[mid -1]+tar[mid])/2);
            }
            else{
                System.out.println(tar[mid]);
            }
        }
    }
}
