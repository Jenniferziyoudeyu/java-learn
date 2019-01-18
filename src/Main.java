import test.pythonText;

public class Main {
    public static void main(String[]args) {

        pythonText account = new pythonText(1122,20000,4.5f);
        account.withdraw(2500);
        account.deposit(3000f);
        System.out.println(account.getId() + " " + account.getBalance() + " " + account.getMonthlyInterestRate() + " " + account.getMonthlyInterest());


//
//        int a = 0, b = 1, c = 2;
//        a = b;
//        b = c;
//
//        System.out.println(a);
//
//        String str = "asdasdas";
//        char c = str.charAt(1);
//    }
//
//     static void swap1(int num1, int num2) {
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
//    }
//
//    static void swap2(int[] array, int index1, int index2) {
//        int temp = array[index1];
//        array[index1] = array[index2];
//        array[index2] = temp;
//    }
//
//    static void printArray(int[] array) {
//        System.out.println("This is array");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ",");
//        }
//        System.out.println();
//    }
//
//    static void mergeSort(int[] array) {
//        mergeSortHelper(array, 0, array.length - 1, new int[array.length]);
//    }
//
//    private static void mergeSortHelper(int[] array, int start, int end, int[] temp) {
//        if (start >= end) return; //设置终止条件。如果没有这句，就是一直执行下去。
//        //找到中点，平均分成两个部分。以下三行执行完，就把
//        int mid = start + (end - start)/2;
//        //以下两行是两个recursion，就是递归
//        mergeSortHelper(array, start, mid, temp);
//        /*
//        在start = end之前一直执行前两句代码。直到start = end 代码return到上一层
//        执行 mergeSortHelper(array, start, mid, temp);
//        之后开始执行下面一句 所以都是先把靠左的路线走完再返回去走右边的
//         */
//        mergeSortHelper(array, mid + 1, end, temp);
//        //此时已经是排好序的两组array。以下是两个array中的角标
//        int i = start, j = mid + 1, index = start;
//        while (i <= mid || j <= end) {
//            int num1 = i <= mid ? array[i] : Integer.MAX_VALUE;
//            int num2 = j <= end ? array[j] : Integer.MAX_VALUE;
//            if (num1 < num2) {
//                /*
//                以下一句是这两行代码的简写
//                temp[index] = num1;
//                index++；
//                 */
//                temp[index++] = num1;
//                i++;
//            } else {
//                temp[index++] = num2;
//                j++;
//            }
//        }
//        for (int k = start; k <= end; k++) {
//            array[k] = temp[k];
//        }
//
//
    }




}

