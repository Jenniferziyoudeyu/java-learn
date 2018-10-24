package laiOffer.class1_array_sort;

public class SelectionSort {

    /**
     * Given an array of integers, sort the elements in the array in ascending order. The selection sort algorithm should be used to solve this problem.
     *
     * Examples
     *
     * {1} is sorted to {1}
     * {1, 2, 3} is sorted to {1, 2, 3}
     * {3, 2, 1} is sorted to {1, 2, 3}
     * {4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}
     * Corner Cases
     *
     * What if the given array is null? In this case, we do not need to do anything.
     * What if the given array is of length zero? In this case, we do not need to do anything.
     */

    /*
    Solution:
    selection sort 是怎么sort的
    i代表什么
    j代表什么

     */

    public int[] solve(int[] array) {
        if (array == null || array.length ==0)
            return null;
        for (int i = 0; i <array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j=i; i <array.length; j++) {

            }
        }
        return array;
    }

}
