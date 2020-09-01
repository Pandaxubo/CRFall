package FiveEight;

/**
 * @author pandaxubo
 * @description 判断是否为完全平方数，以及是否为质数。
 */
public class OddOrSqrt {
    public static boolean isSquare(int num) {
        double a ;
        try {//防止负数
            a = Math.sqrt(num);
        } catch (Exception e) {
            return false;
        }
        int b = (int) a;
        return a - b == 0;
    }

    public static boolean lowIsSquare(int num) {
        if (num < 0)
            return false;
        for (int i = 0; i <= num / 2; i++) {
            if (i * i == num)
                return true;
        }
        return false;
    }


    public static boolean advancedIsSquare(int num) {//n^2 = 1+3+5+...+2n-1
        if (num < 0)
            return false;
        for (int i = 1; num > 0; i += 2)
            num -= i;
        return 0 == num;
    }
}
