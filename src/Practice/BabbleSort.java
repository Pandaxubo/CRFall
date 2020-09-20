package Practice;

/**
 * @author pandaxubo
 *
 * @description 设数组的长度为N：
 * （1）比较前后相邻的二个数据，如果前面数据大于后面的数据，就将这二个数据交换。
 *
 * （2）这样对数组的第0个数据到N-1个数据进行一次遍历后，最大的一个数据就“沉”到数组第N-1个位置。
 *
 * （3）N=N-1，如果N不为0就重复前面二步，否则排序完成。
 */
public class BabbleSort {
    public static void BS(int[] arr){
        int n = arr.length;
        if(n == 0)  return;
        boolean isSort;
        for(int i=0;i<n;i++){
            isSort = true;
            for(int j = 1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSort = false;
                }
            }
            if(isSort)  break;
        }
    }
    public static void aBS(int[] arr){
        int n = arr.length;
        if(n == 0)  return;
        int flag = n;
        while(flag>0){
            int k = flag;
            flag = 0;
            for(int i = 1;i<k;i++){
                if(arr[i-1]>arr[i]){
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    flag = i;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,37,23,56,48,112,24,37};
        int[] arr2 = {1,37,23,56,48,112,24,37};
        BS(arr);
        aBS(arr2);
        for (int j : arr) {
            System.out.print(j+" ");
        }
        System.out.println(" ");
        for (int k : arr2) {
            System.out.print(k+" ");
        }
    }
}
