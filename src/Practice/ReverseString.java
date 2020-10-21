package Practice;

/**
 *
 * @author pandaxubo
 *
 * @description 字符串逆序
 */
public class ReverseString {
    public static void main(String[] args) {
        String s = "课慕有唯，忧解以何";
            //方法一 将字符串转换为字符数组
        char[] arr = s.toCharArray();
            //逆序输出字符数组
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println("\n-----------------");
            //方法二 将字符串转换为字符数组
        char[] arr2 = s.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char temp;
            temp = arr2[i];
            arr2[i] = arr2[arr.length - i - 1];
            arr2[arr.length - i - 1] = temp;
        }
        System.out.println(new String(arr2));
        System.out.println("----------------");
            //方法三 利用StringBuffer实现翻转
        System.out.println(new StringBuffer(s).reverse().toString());
    }
}
