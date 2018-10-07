package laiOffer.class_2_recursion_binarysearch;

/**
 * Description
 * Given a target integer T, a non-negative integer K and an integer array A sorted in ascending order, find the K closest numbers to T in A.
 *
 * Assumptions
 *
 * A is not null
 * K is guranteed to be >= 0 and K is guranteed to be <= A.length
 * Return
 *
 * A size K integer array containing the K closest numbers(not indices) in A, sorted in ascending order by the difference between the number and T.
 * Examples
 *
 * A = {1, 2, 3}, T = 2, K = 3, return {2, 1, 3} or {2, 3, 1}
 * A = {1, 4, 6, 8}, T = 3, K = 3, return {4, 1, 6}
 */

public class KCloestInSortedArray {
    public int[] kClosest(int[] array, int target, int k) {
        if (array == null || array.length == 0) return new int[]{};
        int left = 0; int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (array[mid] >= target) right = mid;
            else if (array[mid] < target) left = mid + 1;
        }
        int res[] = new int[k];
        for(int i = 0; i < k ; i++) {
            if (left < 0 && right < array.length) {
                res[i] = array[right++];
            } else if (right > array.length && left >= 0) {
                res[i] = array[left--];
            } else if ( Math.abs(array[left] - target) < Math.abs(array[right] - target)) {
                res[i] = array[left--];
            } else {
                res[i] = array[right++];
            }
        }
        return res;
    }
}
