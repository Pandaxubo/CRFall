package Meituan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author pandaxubo
 * @description
 * 题目描述：
 * 在小团的公司中，有n位员工。除了最高领导——小团外，每位员工有且仅有一位直接领导。所以，公司内从属关系可以看成一棵树。
 *
 * 现在，公司接到一个项目，需要重新划分这n位员工的从属关系。新的划分描述如下：
 *
 * 1.每个人要么没有下属，要么有至少两个直接下属（即至少有两人的直接领导为这个人）
 *
 * 2.第 i 个人的下属（包括自己）有恰好 ai 个。
 *
 * 请注意，直接下属和下属（包括自己）可分别看做树上点的"儿子"和"子树"。
 *
 * 请问是否存在这么一种关系？注意，输入不会给出最高领导的编号。
 *
 *
 *
 * 输入描述
 * 输入包含多组数据。
 *
 * 对于每组数据，第一行一个整数n，表示公司有n个人。
 *
 * 接下来一行n个数，第 i 个数为ai，含义如题面所示。
 *
 * （n≤24，数据组数在10以内）
 *
 * 输出描述
 * 对每组数据，输出一行"YES"或"NO"，代表是否存在这一种从属关系。
 *
 *
 * 样例输入
 * 3
 * 1 1 3
 * 2
 * 1 2
 * 样例输出
 * YES
 * NO
 *
 * 提示
 * 对于第一组样例，1和2的直接领导均为3即可
 * 对于第二组样例，无法构造出符合题目要求的关系。注意每个有下属的人至少有2个直接下属。
 */
public class RedesignStructure {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            boolean flag = false;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int empcnt = 0;
            for (int a : arr) {
                if (a == 1) {
                    empcnt++;
                } else {
                    if (a == empcnt + 1 && a > 2 && a == n) {
                        flag = true;
                    }
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
/***************************************
 * c++版本：
 *
 * n=24明显提示我们是dfs+剪枝，先把输入从大到小排序。
 * 首先预检查：1. arr[0]必须等于n 2. arr[i]不能等于2
 * 然后dfs：
 * 1. arr[i]表示i剩下多少总子节点未分配。child[i]表示i目前分配了多少子节点。set<int> can （candidate）存有子节点未分配的节点（即arr[i]大于1的所有i）。
 * 2. 从x=1开始dfs，每轮dfs去找can中的节点i，如果arr[i] > arr[x]，（ 且不满足（arr[i] - arr[x] == 1 && child[i]==0)，不然i就只能分配x一个子节点，这是不超时的关键。），则把x当成i的字节点，然后去试dfs(x+1).
 * 3. 直到x=n，检查是否所有arr[i]==1 && child[i] != 1，arr[i]=1因为最后只剩下自己没分配出去。
 *
 * int n;
 * int arr[25];
 * int child[25];
 *
 * bool dfs(int x, set<int>& can) {
 *   if (x == n) {
 *     for (int i = 0; i < n; i++) {
 *       if (arr[i] != 1 || child[i] == 1) return false;
 *     }
 *     return true;
 *   }
 *   set<int> new_can = can;
 *   if (arr[x] != 1) new_can.insert(x);
 *   for (int i : can) {
 *     if (arr[i] > arr[x]) {
 *       if (arr[i] == arr[x] + 1 && child[i] == 0) continue;
 *       arr[i] -= arr[x];
 *       child[i]++;
 *       if (arr[i] == 1) new_can.erase(i);
 *       if (dfs(x + 1, new_can)) return true;
 *       if (arr[i] == 1) new_can.insert(i);
 *       arr[i] += arr[x];
 *       child[i]--;
 *     }
 *   }
 *   return false;
 * }
 *
 * void solve() {
 *   bool flag = true;
 *   REP(i, n) {
 *     cin >> arr[i];
 *     if (arr[i] == 2) {
 *       flag = false;
 *     }
 *   }
 *   if (!flag) {
 *     cout << "NO" << endl;
 *     return;
 *   }
 *
 *   sort(arr, arr + n, greater<int>());
 *
 *   if (arr[0] != n) {
 *     cout << "NO" << endl;
 *     return;
 *   }
 *
 *   set<int> can;
 *   can.insert(0);
 *   memset(child, 0, sizeof(child));
 *   if (dfs(1, can)) {
 *     cout << "YES" << endl;
 *   } else {
 *     cout << "NO" << endl;
 *   }
 * }
 */
