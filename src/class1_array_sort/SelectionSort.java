package class1_array_sort;

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
SelectionSort 选择排序
思想：选出最小的与没有排好序中最左端的值替换
{3，9，5，1}
1. for循环找出最小的1和未排序的最左端相换
           1，{3，9，5}
2. 在未排序数中找出最小的放在括号最左端的位置
          1，3，{9，5}
                   。
                   。
3. 得到排序好的数组
          1，3，5，9
     */

    public int[] selectionSort(int[] array) {
        if (array == null || array.length ==0)
            return null;
        for (int i = 0; i <array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j=i; i <array.length - 1; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }

            }
            Swap.swap(array, i, minIndex); // swap方法是static的话 编译时候确定的内存，
           /*
            Swap swapObj = new Swap();
            swapObj.swap();// 运行时候确定内存
             */
        }
        return array;
    }


}
