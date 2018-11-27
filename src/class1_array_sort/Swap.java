package class1_array_sort;

public class Swap {
    public static void swap (int[] array, int i, int j) {
        int temp = array[i]; //本地变量
        array[i] = array[j];
        array[j] = temp;
    }

}
