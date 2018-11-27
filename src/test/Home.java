package test;

public class Home {
    String kitchen = "Kitchen have food in it";
    String livingRoom = "You can watch movie in the living room";
    String bedroom = "Bed is in the bedroom";

    @Override
    public String toString() {
        String myHome = kitchen + "," + livingRoom + "," + bedroom;
        return  myHome;
    }

    void bubbleSort(int[]array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1])
                swap(array, j, j+1);

            }
        }

    }
    /*
    void selectionSort(int[]array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if(array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            Swap(array, i, minIndex);
        }
    }
    */

    void insertSort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int index = i;
            for (int j = i; j < array.length; j++) {
                if ( temp < array[j - 1]) {
                    array[j - 1] = array[j];
                    index = j - 1;
                }
            }
            array[index] = temp;
        }
    }



    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] =temp;
    }

    class SingleNode{
        int val;
        SingleNode next;
        SingleNode(int val) {
            this.val = val;
        }
    }

    class DoubleNode{
        int val;
        DoubleNode next;
        DoubleNode pre;
        DoubleNode(int val) {
            this.val = val;
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    SingleNode lastNode(SingleNode head) {
        while(head != null && head.next != null) {
            head = head.next;
        }
        return head;
    }

    SingleNode last2Node(SingleNode head) {
        while(head != null && head.next != null && head.next.next != null) {
            head = head.next;
        }
        return head;
    }

    SingleNode delete2Node(SingleNode head) {
        SingleNode last2 = last2Node(head);
        if (last2 == null || last2.next == null) return null;
        head.next = null;
        return head;
    }

    SingleNode delete1stNode(SingleNode head) {
        if (head ==null || head.next == null) return null;
        return head.next;
    }

    SingleNode delete2ndNode(SingleNode head) {
        if(head == null || head.next == null) return null;
        head.next = head.next.next;
        return head;
    }

    void selectionSort(int[]array) {

    }


}

interface space {
    void putFurniture(); //interface里的方法一定不可实现。



}









