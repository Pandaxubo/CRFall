
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            int[][] g = new int[num][3];
            for (int i=0;i< num;i++){
                g[i][0] = in.nextInt();
                g[i][1] = in.nextInt();
                g[i][2] = in.nextInt();

            }
            for (int i=0;i< num;i++){
                int avg = (g[i][0]+g[i][1]+g[i][2])%3;
                if(avg == 0){
                    System.out.println((g[i][0]+g[i][1]+g[i][2])/3);
                }
                else if(avg == 1){
                    System.out.println((g[i][0]+g[i][1]+g[i][2])/3+1);
                }
                else if(avg == 2){
                    System.out.println((g[i][0]+g[i][1]+g[i][2])/3+1);
                }
            }


        }
    }

}











///////////////////////////////////////////////////////////////////////
//import java.util.Scanner;
//
//public class Main {
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
//public class Main {
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

