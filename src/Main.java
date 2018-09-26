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
        sort.insertSort(array);
//        sort.selectionSort(array);
        printArray(array);

        int[] arr = new int[2];
        int index = arr.length + 100;
//        System.out.println(arr[index]);

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
}

