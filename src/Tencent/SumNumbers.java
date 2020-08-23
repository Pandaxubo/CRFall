package Tencent;
import java.util.Scanner;

/**
 * @author pandaxubo
 *
 * @description 拆分一个整数，使其数位和最大。
 *第一行t为整数个数(1-100)
 *接着是数据n（1-10^12）
 *input:
 * 1
 * 35
 * output:17
 * 说明：35=19+16
 * 1+9+1+6=17
 */
public class SumNumbers {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while (in.hasNext()) {
                int t = in.nextInt();
                int[] arr = new int[t];
                for(int i=0;i<t;i++){
                    arr[i] = in.nextInt();
                }
            }
        }
}
