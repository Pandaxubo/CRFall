package GiByte;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class One {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
                String str  = in.next();
                String a = in.next();
                String b = in.next();
                char c1 = Character.toLowerCase(a.charAt(0));
                char c2 = Character.toLowerCase(b.charAt(0));
                List<Integer> aq = new ArrayList<>();
                int a1 = str.indexOf(c1);
                int astart = a1;
                aq.add(a1);
                System.out.println(astart);

                while(a1 != -1){
                    a1 = str.indexOf(c1,a1+1);
                    aq.add(a1);
                }
                int aend = -1;
                if(aq.size()>=2){
                    aend = aq.get(aq.size()-2);
                }

                System.out.println(aend);

                List<Integer> bq = new ArrayList<>();
                int b1 = str.indexOf(c2);
                int bstart = b1;
                bq.add(b1);
                System.out.println(bstart);
                while(b1 != -1){
                    b1 = str.indexOf(c2,b1+1);
                    bq.add(b1);
                }
                int bend = -1;
                if(bq.size()>=2){
                    bend = bq.get(bq.size()-2);
                }
                System.out.println(bend);
                int res = 0;
                if(astart == -1 && aend == -1 && bstart == -1 && bend == -1){
                    res = -1;
                }
                else{
                    res = Math.max(Math.abs(bend - astart), Math.abs(aend - bstart));
                }

                System.out.println(res);
            }
        }


}
