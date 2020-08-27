package Practice;

/**
 * @author pandaxubo
 * @description  现有一特殊数组A[]，它是循环递增的，如A[]={ 17 19 20 25 1 4 7 9}，试在这样的数组中找一元素x，看看是否存在。
 * 请写出你的算法，必要时可写伪代码，并分析其空间、时间复杂度。
 * （*）循环递增数组的性质：以数组中间元素将循环递增数组划分为两部分，则一部分为一个严格递增数组，而另一部分为一个更小的循环递增数组。
 * 当中间元素大于首元素时，前半部分为严格递增数组，后半部分为循环递增数组；当中间元素小于首元素时，前半部分为循环递增数组；后半部分为严格递增数组。
 */
public class ExtendedBinarySearch {
    public static void main(String[] args){
        int[] arr = {17,19,20,25,1,4,7,9};
        int x = 20;
        System.out.println(modifiedBS(arr,x));
    }
    public static int modifiedBS(int[] arr, int tar){
        int low = 0;
        int high = arr.length-1;
        int mid;
        while(low<=high){
            mid = low+(high-low)/2;
            if(arr[mid] == tar){
                return mid;
            }
            if(arr[mid]>=arr[low] ){//前面严格递增，后面小的循环递增
               if(tar < arr[mid] && tar>= arr[low]){
                    high = mid -1;
                }
                else{
                    low = mid +1;
                }
            }
            else{//前面小的循环递增，后面严格递增
                if(arr[mid] < tar && arr[mid]< arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
