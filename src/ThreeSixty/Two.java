package ThreeSixty;
import java.util.Scanner;

/**
 * @author pandaxubo
 * @description
 * 调整排列
 * 题目描述：
 * 给定一个1到N的排列P1到PN（N为偶数），初始时Pi=i（1≤i≤N），现在要对排列进行M次操作，每次操作为以下两种中一种：
 *
 * ①将排列的第1个数移到末尾；
 *
 * ②交换排列的第1个数与第2个数、第3个数与第4个数、...、第N-1个数与第N个数。
 *
 * 求经过这M次操作后得到的排列。
 *
 *
 *
 * 输入描述
 * 第一行包含两个整数N和M，2≤N，M≤105。
 *
 * 第二行包含M个空格隔开的整数t1到tM，1≤ti≤2。若ti=1，则表示第i次操作为操作①；若ti=2，则表示第i次操作为操作②。
 *
 * 输出描述
 * 输出N个空格隔开的整数，即经过M次操作后得到的排列。
 *
 *
 * 样例输入
 * 4 3
 * 1 2 1
 * 样例输出
 * 2 1 4 3
 *
 * 提示
 * 排列变化过程为：{1 2 3 4}->{2 3 4 1}->{3 2 1 4}->{2 1 4 3}。
 */
public class Two {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] arr = new int[n];
            for(int q= 0;q<n;q++){
                arr[q] = q+1;
            }
            int t =0;
            int temp =0;
            for(int w= 0;w<m;w++){
                int oper = in.nextInt();
                if(oper == 1){
                    t = arr[0];
                    System.arraycopy(arr,1,arr,0,n-1);
                    arr[n-1] = t;
                }
                else if(oper == 2){
                    for(int r = 0;r< n;r++){
                        if(r%2 == 1){
                            temp = arr[r];
                            arr[r] = arr[r-1];
                            arr[r-1] = temp;
                        }
                    }
                }
            }
            for(int e = 0;e < n -1 ;e++){
                System.out.print(arr[e]+" ");
            }
            System.out.println(arr[n-1]);
        }
    }

}
