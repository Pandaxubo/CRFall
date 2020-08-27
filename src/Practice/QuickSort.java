package Practice;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[]{2,7,4,5,10,1,9,3,8,6};
        int[] b = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] c = new int[]{10,9,8,7,6,5,4,3,2,1};
        int[] d = new int[]{1,10,2,9,3,2,4,7,5,6};

        sort(a, 0, a.length-1);

        System.out.println("排序后的结果：");
        for(int x : a){
            System.out.print(x+" ");
        }

    }
    public static int partition(int[] arr,int start,int end){
        int pivot = arr[end];//pivot
        while(start < end){
            while(start < end && arr[start] <= pivot){
                start++;
            }
            if(start < end){
                int temp= 0;
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                end--;//pivot占位
            }
            while(start< end && arr[end] >= pivot){
                end--;
            }
            if(start < end){
                int tem= 0;
                tem = arr[start];
                arr[start] = arr[end];
                arr[end] = tem;
                start++;//pivot占位
            }
        }
        return end;
    }

    public static void sort(int[] arr,int start, int end){
        if(start > end){return;}
        int pivot = partition(arr,start,end);
        sort(arr, start, pivot-1);
        sort(arr, pivot+1,end);
    }
}
