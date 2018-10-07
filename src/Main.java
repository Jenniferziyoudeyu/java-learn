import laiOffer.class_2_recursion_binarysearch.*;
import test.Home;

public class Main {
    public static void main(String[]args) {
//        Home home = new Home();
//        System.out.println(home.toString());

//        int[] array = new int[]{1, 2, 3, 4, 5};
////
////        System.out.println("This is original array: ");
////        for (int num: array) {
////            System.out.print(num);
////            System.out.print(",");
////        }
////        System.out.println();
////        swap1(array[0], array[1]);
////
////        System.out.println("This is new array: ");
////        for (int num: array) {
////            System.out.print(num);
////            System.out.print(",");
////        }
////        System.out.println();
////
////        swap2(array, 0, 1);
////
////        System.out.println("This is new array2: ");
////        for (int num: array) {
////            System.out.print(num);
////            System.out.print(",");
////        }
////        System.out.println();

        SortAlgorithms sort = new SortAlgorithms();
        int[] array = new int[]{2, 1, 0, 5, 7, 9, 3, 4};
//        sort.insertSort(array);
//        sort.selectionSort(array);
        mergeSort(array);
        printArray(array);

        int[] arr = new int[2];
        int index = arr.length + 100;
//        System.out.println(arr[index]);


//        BinarySearch binarySearch = new BinarySearch();
//        int[] binarySearchArray = {1,3,4,5,5,5,5,7,8,9,0};
//        int target = binarySearch.binarySearch(binarySearchArray,5);
//            System.out.println(target);
//
//        CalculateAPowerOfB aPowerOfB = new CalculateAPowerOfB();
//        long res = aPowerOfB.power(2,10);
//        System.out.println(res);
//
//        SearchInSortMatrix1 findTwoDIndex = new SearchInSortMatrix1();
//        int[][] twoDArray = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
//        int[] targetOfTwoD = findTwoDIndex.search(twoDArray,6);
//        for (int i = 0; i < targetOfTwoD.length; i++){
//            System.out.print(targetOfTwoD[i] + " "); //打印数组的时候要用for loop
//        }
//
//        FirstOccurance findFirstOccurIndex = new FirstOccurance();
          int[] occurArray = {0,1,4,6,6,6,6,6,6,6,6,6,6,6,6,7,8,8,8,8,9};
//        int firstOccurIndex = findFirstOccurIndex.firstOccur(occurArray,6);
//        System.out.println(firstOccurIndex);

        LastOccurance findLastOccurIndex = new LastOccurance();
        int lastOccurIndex = findLastOccurIndex.lastOccur(occurArray,6);
        System.out.println(lastOccurIndex);

    }

     static void swap1(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    static void swap2(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    static void printArray(int[] array) {
        System.out.println("This is array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    static void mergeSort(int[] array) {
        mergeSortHelper(array, 0, array.length - 1, new int[array.length]);
    }

    private static void mergeSortHelper(int[] array, int start, int end, int[] temp) {
        if (start >= end) return; //设置终止条件。如果没有这句，就是一直执行下去。
        //找到中点，平均分成两个部分。以下三行执行完，就把
        int mid = start + (end - start)/2;
        //以下两行是两个recursion，就是递归
        mergeSortHelper(array, start, mid, temp);
        /*
        在start = end之前一直执行前两句代码。直到start = end 代码return到上一层
        执行 mergeSortHelper(array, start, mid, temp);
        之后开始执行下面一句 所以都是先把靠左的路线走完再返回去走右边的
         */
        mergeSortHelper(array, mid + 1, end, temp);
        //此时已经是排好序的两组array。以下是两个array中的角标
        int i = start, j = mid + 1, index = start;
        while (i <= mid || j <= end) {
            int num1 = i <= mid ? array[i] : Integer.MAX_VALUE;
            int num2 = j <= end ? array[j] : Integer.MAX_VALUE;
            if (num1 < num2) {
                /*
                以下一句是这两行代码的简写
                temp[index] = num1;
                index++；
                 */
                temp[index++] = num1;
                i++;
            } else {
                temp[index++] = num2;
                j++;
            }
        }
        for (int k = start; k <= end; k++) {
            array[k] = temp[k];
        }


    }




}

