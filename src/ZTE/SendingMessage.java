package ZTE;

import java.util.Scanner;

/**
 * @author pandaxubo
 *
 */
public class SendingMessage {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            int count = 0;
            for(int i =0;i<m;i++){
                int[] data = new int[n];
                for(int j = 0;j<n;j++){
                    data[j] = in.nextInt();
                }
            }
            if(n % 2 == 0){
                System.out.println(n/2);
            }
            else if(n %2 == 1){
                System.out.println(n/2+1);
            }

        }
    }
}
