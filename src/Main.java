
/////////////////////////////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//A和B号码包都是亿级的号码包文件,  文件A和文件B中的号码全为QQ号，号码包文件一行一个QQ号， A和B号码包是有重叠的，请找出A，B两个号码包中重叠的QQ号。
//int GetTheSameQQ(final List<String> vecA, final List<String> vecB,  List<String> vecRes)
//{}
public class Main {
    public static int GetTheSameQQ(final List<String> vecA, final List<String> vecB, List<String> vecRes)
    {
        Set<String> one = new HashSet<String>(vecA);
        Set<String> two = new HashSet<String>(vecB);
        Set<String> result = new HashSet<>();
        result.addAll(one);
        result.retainAll(two);
        vecRes = new ArrayList<>(result);
        String res = vecRes.get(0);
        return Integer.parseInt(res);
    }
    public static void main(String[] args) {
        ;
    }

}











///////////////////////////////////////////////////////////////////////
//import java.util.Scanner;
//
//public class Qianxin.Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            int nexti = in.nextInt();
//            int count = 0;
//            while(Integer.parseInt(Integer.toBinaryString(count)) <= nexti){
//                count++;
//            }
//            System.out.println(count);
//        }
//    }
//
//
//}





///////////////////////////////////////////////////////////////////////////////////


//import java.util.Scanner;
//public class Qianxin.Main {
//    public static void main(String[] args) {
//        int num,count;
//        Scanner input = new Scanner(System.in);
//        while (input.hasNext()){
//            count = 1;
//            num = input.nextInt();
//            while (Integer.valueOf(Integer.toBinaryString(count)) <= num){
//                count++;
//            }
//            System.out.println(count-1);
//        }
//    }
//}

///////////////////////////////////////////////////////////////////////////////////////
//        int count=0;
//        for (int i = m; i <= n; i++) {
//            boolean flag =false;
//            if (i<10)
//                continue;
//            for (int j = 0; j < String.valueOf(i).length(); j++) {
//                StringBuilder s = new StringBuilder(String.valueOf(i));
//                int newi = Integer.parseInt(s.deleteCharAt(j).toString());
//                System.out.println(newi);
//                if (isReverse(newi)&&isPrime(newi))
//                {
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag)
//                count++;
//        }
//        System.out.println(count);
//
//    }
//
//    private static boolean isReverse(int i) {
//        String s = String.valueOf(i);
//        for (int j = 0; j < s.length()/2; j++) {
//            if (s.charAt(j)!=s.charAt(s.length()-1-j))
//                return false;
//        }
//        return true;
//    }
//
//    private static boolean isPrime(int i) {
//        if (i<2) return false;
//        for (int j = 2; j <= Math.sqrt(i) ; j++) {
//            if (i%j==0)
//                return false;
//        }
//        return true;
//    }
//
//    public static int reverse(int a ){
//        String verse = a+"";
//        StringBuilder sb = new StringBuilder();
//        for(int k = verse.length()-1;k >=0;k--){
//            sb.append(verse.charAt(k));
//        }
//        int res = Integer.parseInt(sb.toString());
//        return res;
//    }
//
//    public static boolean prime(int a){
//        if(a <=3){return false;}
//        double ss = Math.sqrt(a);
//        for(int h = 0; h <= ss;h++){
//            if(h % a == 0 ){
//                return false;
//            }
//        }
//        return true;
//    }



//    boolean isForward = false;
//            boolean isBackward = false;
//            boolean isBoth = false;
//            boolean isInvalid = false;
//            if(total.length()<=p1.length() || total.length()<=p2.length()){
//                isInvalid = true;
//            }
//            else if(isok(total,p1,p2)){ isForward = true; }
//            String totalr = new StringBuilder(total).reverse().toString();
//            if(isok(totalr,p1,p2)){ isBackward = true; }
//
//            if(isForward && isBackward){
//                System.out.println("both");
//            }
//            else if(isForward && !isBackward) {
//                System.out.println("forward");
//            }
//            else if(!isForward && isBackward) {
//                System.out.println("backward");
//            }
//            else if(!isForward && !isBackward){
//                System.out.println("invalid");
//            }
//private static boolean isok(String total, String p1, String p2){
//    boolean isokk = false;
//    int target = total.indexOf(p1);
//    if (target != -1) {
//        target += p1.length();
//        if (total.substring(target, total.length()).contains(p2)) {
//            isokk = true;
//        }
//    }
//    return isokk;
//}
