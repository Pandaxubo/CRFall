package Meituan;

import java.util.Scanner;

/**
 * @author pandaxubo
 * @description 题目描述：
 * 小团有一个序列a，下标从1开始直到n，分别为a1 , a2 ...  an 。现在，小团定义了以下式子：
 *bi = ai^^(j =1...n)(i%j) = ai ^(i%1)^(i%2)^...^(i%n)
 *
 *
 *
 * 现在小团想让小美回答的值 ^(i = 1...n)bi = bi^b2^...^bn
 *请你帮助小美。

 *
 * 输入描述
 * 输入第一行包含一个整数n，表示序列 a 的长度。
 *
 * 接下来一行 n 个数，空格隔开，第 i 个数表示ai
 *
 * n≤100000 , 0≤ai≤n
 *
 * 输出描述
 * 输出包含一个数，即题干中所求的值
 *
 *
 * 样例输入
 * 2
 * 3 2
 * 样例输出
 * 0
 */
public class CalcValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int a = 0;
            int[] b = new int[n+1];
            int res = 0;
            for (int i = 1; i < n+1; i++) {
                a= in.nextInt();
                for(int j =1; j< n+1;j++){
                    b[i] = a ^ (i % j);
                }
                if(i == 1){
                    res = b[1];
                }
                else{
                    res = res ^ b[i];
                }
            }
            System.out.println(res);
        }
    }

}
/***************************************************
给出一个c++版本：
思路：


 列出a和b的异或表后我们发现，对于某个j，它这列是循环的0到j-1，完整循环了n/j次，剩余n%j个没求。
 我们可以用前缀和pre数组来保存0到j的异或和，然后对每个j，如果n/j是偶数，那么互相抵消掉，不需要计算，如果为奇数次，则ans异或一次pre[j-1]。另外需要加上剩下的pre[n%j]。
 最后加上异或a1到an即可。
 int n;
 int pre[100001];

 void solve() {
 cin >> n;
 pre[0] = 0;
 for (int i = 1; i <= n; i++) {
 pre[i] = pre[i - 1] ^ i;
 }
 int ans = 0;
 for (int i = 1; i <= n; i++) {
 ans ^= pre[n % i];
 if ((n / i) % 2) {
 ans ^= pre[i - 1];
 }
 }
 for (int i = 0; i < n; i++) {
 int x;
 cin >> x;
 ans ^= x;
 }
 cout << ans << endl;
 }
****************************************************/