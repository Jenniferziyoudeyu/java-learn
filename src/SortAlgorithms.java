public class SortAlgorithms {

    /*
    1. bubble sort
    2. selection sort
    3. insertion sort
    4. merge sort
    5. quick sort

//    6. index sort
     */
    //TODO:grgthyh
    void func1(int n) {
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

    void func2(int m) {
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j <= m; j++) {

            }
        }
    }
    /*
    for for loop:
    i == 0: j: 1 , 2 , 3... m-1;  ----- m - 1次
    i == 1: j: 2 , 3 , 4 ... m-1; ----- m - 2次
    i == 2: j: 3 , 4 , 5 ... m-1; ----- m - 3次
    .
    .
    .
    i = m - 1: j: m - 1 ----- 1次

    时间复杂度是 m - 1 + m - 2 + m - 3 +...+ 1 = n(n - 1) / 2
    = n^2/2 + n/2
    =n^2

    空间复杂度是 i和j 同时存在 = 2 = O(1);
     */
    // comment sort: selection sort an array[]
    //function signiture 分三部分： function名字：bubbleSort，return type：void， input argument/primtor:int[] array
    void bubbleSort(int[] array) {
        //outer loop: how many iterations 遍历。规定要run多少个iteration
        for (int i = array.length - 1; i >= 0; i--) {
            // inner loop: find the max from the rest elements 找没排好序的元素中最小值是谁
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) { //选择范围。 {1，2，3} i = 0时从"1"开始。i = 1时，从"2"开始。。。
             /*
             把左节点当成最小数。在for循环里不存在array为空的情况，如果为空，不进行for循环。
             如果在for循环外设置int min，需要考虑array为空的情况。
             此时min设置成最大值，这样和array里的数字比较一次 最小值就成为array里的数值
             int min = Integer.MAX_VALUE;
              */
            int min = array[i];
            //设置最小值的角标 minIndex
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            //在j loop 外面 ！！！ 在 i loop 里面 ！！！
            swap(array, i, minIndex);
        }
    }
    /*
    时间复杂度分析：
    for (int i = 0; i < array.length; i++)
    for (int j = i; j < array.length; j++)
    iteration i = 0： inner （0，1...array.length - 1）= array.length
    iteration i = 1： inner （1，2...array.length - 1）= array.length - 1
    iteration i = 2： inner （2，3...array.length - 1）= array.length - 2
    .
    .
    .
    iteration i = array.length - 2： inner （array.length - 2,array.length - 1）= 2
    iteration i = array.length - 1： inner （array.length - 1）= 1

    1+2+3+...+array.length
    也就是
    1+2+3+...+n
    = n(n+1)/2   --> n^2 --> O(n^2)

     */

    void insertSort(int[] array) {
        //corner case。array为空，null.length会崩溃
        if (array == null) return;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int index = i;
            for (int j = i; j > 0; j--) {
                if (temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    index = j - 1;
                }
             }
            array[index] = temp;
        }
    }

    //把没排好序的元素中最小值与没排好序array的最左端第i个数 互换位置。
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
