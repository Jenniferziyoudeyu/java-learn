public class SortAlgorithms {

    /*
    1. bubble sort
    2. selection sort
    3. insertion sort
    4. merge sort
    5. quick sort

//    6. index sort
     */

    void func1(int m, int n) {
        //时间复杂度详解
        for (int i = 0; i < n; i++) {
        }
        for (int j = 0; j < n; j++) {
        }

        //数组的赋值
        int[] array = new int[20];
        int num = array[10];
        num = 17;
        //array[10] != 17 array[10] 没有变 array[10] == 0;
        int num2 = 17;
        array[10] = num2;
        //array[10] == 17 必须直接赋值，不能某个int代表array[10]
    }

    void bubbleSort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                swap(array, j, j + 1);
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
