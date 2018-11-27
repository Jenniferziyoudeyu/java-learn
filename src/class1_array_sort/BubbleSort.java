package class1_array_sort;
/*
https://blog.csdn.net/yushiyi6453/article/details/76407640
动图
把最大的先排序好放在最后的位置
 */

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    //array[]是待排序数组， n是array长度
    void BubbleSort (int array[]) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j , j+1);
                }

            }
        }

    }
    public void swap (int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}

