package FiveEight;


/**
 * @author pandaxubo
 *
 * @description 破译密码。0代表a，25代表z，input一个数字，output最多有几种破译方式。
 * 例：input：12158 output：5
 * 可能为：bcbfi，mbfi，bvfi，bcpi，mpi
 */
public class discoverNum {
    public static void main(String[] args) {
        System.out.println(translateNum(12158));
        System.out.println(translateNum2(12158));
    }

    public static int translateNum(int num) {//只有两种情况：只是最后一位数，就只有dp[i-1]，如果能和前面一位数拼起来，就可以加上dp[i-2]种
        String s = String.valueOf(num);
        int[] dp = new int[s.length()];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i<s.length();i++){
            dp[ i ] = dp[i-1];
            if(Integer.parseInt(s.substring(i-2,i)) >=10 &&Integer.parseInt(s.substring(i-2,i)) <=25 ){
                dp[i] += dp[i-2];
            }
        }
        return dp[s.length()-1];
    }

    public static int translateNum2(int num) {
        String s = String.valueOf(num);
        int a = 1, b = 1;
        for(int i = 2; i <= s.length(); i++) {
            String tmp = s.substring(i - 2, i);
            int c = tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0 ? a + b : a;
            b = a;
            a = c;
        }
        return a;
    }



}
