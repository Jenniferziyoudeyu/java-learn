package class1_array_sort;

public class Day1Array {
    //打印int array里的所有元素
    public void print(int[] array) {
        if (array == null || array.length == 0)
            return;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
