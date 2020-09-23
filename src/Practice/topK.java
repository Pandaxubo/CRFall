package Practice;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author pandaxubo
 *
 * @description 找出最小的k个数
 */
public class topK {
    public static void findK(int low, int high, int[] arr, int k) {
        int pivot = partition(low, high, arr);
        if (pivot == k) return ;
        else if (pivot > arr[k]) {
            findK(low, pivot - 1, arr, k);
        } else if (pivot < arr[k]) {
            findK(pivot + 1, high, arr, k);
        }
    }

    public static int partition(int low, int high, int[] arr) {
        Random r = new Random();
        int pivot = r.nextInt(high-low)+low;
        swap(arr,low, pivot);
        pivot = low;
        int index = pivot + 1;
        for (int i = index; i <= high; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] findKQ(int[] arr,int k){
        if(k == 0)    return new int[0];
        Queue<Integer> q = new PriorityQueue<>(k,(o1,o2)->Integer.compare(o2,o1));
        for(int i : arr){
            if(q.isEmpty() || q.peek() > i || q.size()<k){
                q.offer(i);
            }
            if(q.size()>k){
                q.poll();
            }
        }
        int[] res = new int[q.size()];
        int w = 0;
        for(int j : q){
            res[w++] = j;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49};
        int k = 2;
        findK(0, a.length - 1, a, k);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = a[i];
        }
        for(int j = 0;j< k ;j++){
            System.out.println(res[j]);
        }
        int[] ans = findKQ(a,k);
        for(int q = 0;q< k ;q++){
            System.out.println(ans[q]);
        }
    }
}
