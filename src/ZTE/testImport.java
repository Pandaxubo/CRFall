package ZTE;
import Practice.QuickSort;

import java.util.Arrays;

public class testImport {
    public static void main(String[] args){
        int[] arr = {33,44,12,574,232};
        QuickSort.quickSort(arr,0,arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
}
