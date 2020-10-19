package Practice;

import java.util.Scanner;

/**
 *
 * @author pandaxubo
 *
 * @description 一个数组是由一个递减数列左移若干位形成的，比如{4，3，2，1，6，5}是由{6，5，4，3，2，1}左移两位形成的，在这种数组中查找某一个数。
 *
 * 思路：任意将这个数组从中间分开，分成两个数组，则至少有一个数组单调递减，另一个数组则可以由递减数组左移若干位得到。
 * 所以我们在二分之后确定界限的时候必须考虑所有情况，即需要查找的数组在哪一个分区里。
 * 首先我们需要判断哪一个分区是单调递减的分区，这可以通过比较arr[l]和arr[mid]来得到，如果是大于等于，则左分区是单调递减，否则是右分区；
 * 再通过判断要查找的值是否夹在递减分区中间来最终确定选择哪一个分区。
 */
public class SearchFromArray {
    public static void main(String[] args){
        int[] arr = {4,3,2,1,6,5};
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            System.out.println(new SearchFromArray().FindData(arr, in.nextInt(),0,5));
        }

    }

    int FindData(int[] arr,int value,int l,int r)
    {
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==value)
                return mid;
            else
            {
                if(arr[l]>=arr[mid])
                {
                    if(value>arr[mid] && value<=arr[l])
                        r=mid-1;
                    else
                        l=mid+1;
                }
                else
                {
                    if(value<arr[mid] && value>=arr[r])
                        l=mid+1;
                    else
                        r=mid-1;
                }
            }
        }
        return -1;
    }
}
