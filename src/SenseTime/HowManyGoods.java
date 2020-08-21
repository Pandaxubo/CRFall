package SenseTime;
import java.util.Scanner;
/**
 * @author pandaxubo
 *
 * @description 给定一个字符串序列，包括大小写，空格，问能形成多少个"Good"。区分大小写，每个字符使用一次。
 * 输入：每行一个小于100000字符串
 * 输出：Good个数
 *
 * 例：
 * ggoodood
 * 0
 *
 * Goo23good Gooddd
 * 2
 *
 * 123 GoodoodGGoooddjfhjdGGooo3dkdggggGoood0123\n
 * 5
 *
 */
public class HowManyGoods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String tar = in.nextLine();
            System.out.println(findGood(tar));
        }
    }

    public static int findGood(String tar) {
        String[] op = tar.split("");
        int res = 0;
        int cur = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= op.length - 1; i++) {
           if(op[i].equals("G") && sb.toString().charAt(0) != 'G' ){
               cur = i;
               sb.append("G");
               System.out.println(sb);
           }
           if(op[i].equals("o")&& sb.toString().length() <= 2 ){
               sb.append("o");
               System.out.println(sb);
           }
            if(op[i].equals("d")&& sb.toString().length() <= 3){
                sb.append("d");
                System.out.println(sb);
            }
            if(sb.toString().equals("Good")){
                res++;
                i = cur +1;
                System.out.println(i);
                sb.setLength(0);
            }
        }
        return res;
    }
}
