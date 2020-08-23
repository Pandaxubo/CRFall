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
//        //每次都以最右边的元素作为基准值
//        int base = arr[end];
//        //start一旦等于end，就说明左右两个指针合并到了同一位置，可以结束此轮循环。
//        while(start < end){
//            while(start < end && arr[start] <= base)
//                //从左边开始遍历，如果比基准值小，就继续向右走
//                start++;
//            //上面的while循环结束时，就说明当前的a[start]的值比基准值大，应与基准值进行交换
//            if(start < end){
//                //交换
//                int temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
//                //交换后，此时的那个被调换的值也同时调到了正确的位置(基准值右边)，因此右边也要同时向前移动一位
//                end--;
//            }
//            while(start < end && arr[end] >= base)
//                //从右边开始遍历，如果比基准值大，就继续向左走
//                end--;
//            //上面的while循环结束时，就说明当前的a[end]的值比基准值小，应与基准值进行交换
//            if(start < end){
//                //交换
//                int temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
//                //交换后，此时的那个被调换的值也同时调到了正确的位置(基准值左边)，因此左边也要同时向后移动一位
//                start++;
//            }
//
//        }
//        return end;}
        //这里返回start或者end皆可，此时的start和end都为基准值所在的位置
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
