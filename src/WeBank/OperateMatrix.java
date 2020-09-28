package WeBank;

import java.util.Scanner;

/**
 * @author pandaxubo
 * @description 题目描述：
 * 平面上有一个矩形，大小为n×m，其中，长度为n的边是竖直的，长度为m的边是水平的。将矩形切割成n×m个小正方形，规定左上角的小正方形属性值为（1,1）,左下角的小正方形属性值为（n,1）,右上角的小正方形属性值为（1,m）,右下角的小正方形属性值为（n,m）。我们规定从上往下数第x行，从左往右数第y列的小正方形属性值为(x,y).
 *
 * 现在，我们对这个矩形进行如下操作，将其顺时针旋转90度x次，然后将其水平翻转y次，然后将其逆时针旋转90度z次。
 *
 * 接着，我们将这个操作后的矩形按原始的思路重新标上属性值，每一个小正方形就有一个原来的属性值和新的属性值。
 *
 * 然后有Q个询问，每一次询问一个原来属性值为(x,y)的小正方形的新属性值。你需要对所有询问作出回答。
 *
 *
 *
 * 输入描述
 * 输入第一行包含三个数  x ,y ,z ，代表顺时针旋转，水平翻转，逆时针旋转的次数。
 *
 * 接下来一行两个数，n,m代表原矩形的大小。
 *
 * 接下来一行一个数，Q代表询问次数。
 *
 * 接下来Q行，每行两个数 x,y 代表一次询问，询问原矩形中属性值为（x,y）的小正方形现在的新属性值。
 *
 * 1≤x,y,z≤10^6；1≤n,m,Q≤1000；1≤x≤n；1≤y≤m
 *
 * 输出描述
 * 输出包含Q行，每一行一个答案。
 *
 *
 * 样例输入
 * 1 1 1
 * 4 5
 * 3
 * 1 1
 * 3 4
 * 2 5
 * 样例输出
 * 4 1
 * 2 4
 * 3 5
 *
 * 提示
 * 样例解释：
 * （1,1）->（1,4）->（1,1）->（4,1）
 * （3,4）->（4,2）->（4,3）->（2,4）
 * （2,5）->（5,3）->（5,2）->（3,5）
 */
public class OperateMatrix {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int q = in.nextInt();

        for(int i =0 ;i<q;i++){
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int[] ints = tox(n, m, x1, y1, x);
            int[] ints1 = toy(n, m, ints[0], ints[1], y);
            int[] ints2;
            if(x % 2==0){
                ints2= toz(n, m, ints1[0], ints1[1], z);
            }
            else{
                ints2= toz(m,n, ints1[0], ints1[1], z);
            }
            System.out.println(ints2[0]+" "+ints2[1]);
        }
    }

    private static int[] tox(int n, int m, int x1, int y1, int x){
        if(x %4 == 0){
            return new int[] {x1,y1};
        }
        else if(x %4  == 3){
            return new int[] {m-y1 + 1,x1};
        }
        else if(x %4  == 2){
            return new int[] {m-y1 + 1,n-x1+1};
        }
        else {
            return new int[] {y1, n-x1 +1};
        }
    }

    private static int[] toy(int n, int m, int x1, int y1, int y){
        if(y % 2 == 0){
            return new int[] {x1,y1};
        }
        else {
            return new int[] {x1, n-y1 +1};
        }
    }

    private static int[] toz(int n, int m, int x1, int y1, int z){
        if(z %4 == 0){
            return new int[] {x1,y1};
        }
        else if(z %4  == 1){
            return new int[] {m-y1 + 1,x1};
        }
        else if(z %4  == 2){
            return new int[] {n-x1 + 1,m-y1+1};
        }
        else {
            return new int[] {y1, n-x1 +1};
        }
    }
}
