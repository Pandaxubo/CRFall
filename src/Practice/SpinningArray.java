package Practice;

/**
 * @author pandaxubo
 * @description 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个排好序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3, 4, 5, 1, 2}为{1, 2, 3, 4, 5}的一个旋转，该数组的最小值为1。
 *
 * 思路：我们得到处在数组中间的元素。如果该中间元素位于前面的递增子数组，那么它应该大于或者等于第一个指针指向的元素。
 * 此时数组中最小的元素应该位于该中间元素的后面。
 * 我们可以把第一指针指向该中间元素，这样可以缩小寻找的范围。
 * 同样，如果中间元素位于后面的递增子数组，那么它应该小于或者等于第二个指针指向的元素。
 * 此时该数组中最小的元素应该位于该中间元素的前面。
 * 我们可以把第二个指针指向该中间元素，这样同样可以缩小寻找的范围。
 * 我们接着再用更新之后的两个指针，去得到和比较新的中间元素，循环下去。
 */
public class SpinningArray {
    public static void main(String[] args) {
        int[] arr = {17, 19, 20, 25, 1, 4, 7, 9};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        if (arr.length == 1) {
            return arr[0];
        }
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (high - low == 1) {
                return Math.min(arr[low], arr[high]);
            }//边界条件：只剩最后一个数
            else if (arr[mid] >= arr[low]) {
                low = mid;
            }//不可以跳过mid，因为并没有返回
            else if (arr[mid] < arr[low]) {
                high = mid;
            }
        }
        return -1;
    }
}
