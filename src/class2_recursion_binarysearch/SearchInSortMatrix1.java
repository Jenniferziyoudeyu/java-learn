package class2_recursion_binarysearch;

/**
 * Description
 * Given a 2D matrix that contains integers only, which each row is sorted in an ascending order. The first element of next row is larger than (or equal to) the last element of previous row.
 *
 * Given a target number, returning the position that the target locates within the matrix. If the target number does not exist in the matrix, return {-1, -1}.
 *
 * Assumptions:
 *
 * The given matrix is not null, and has size of N * M, where N >= 0 and M >= 0.
 * Examples:
 * col = 3 , row = 4
 * matrix = { {1, 2, 3}, {4, 5, 7}, {8, 9, 10} , {11 , 12 , 15} }
 *
 * target = 7, return {1, 2}
 *
 * target = 6, return {-1, -1} to represent the target number does not exist in the matrix.
 *
 * 关于array
 * int[] array = new int[5];   表示array是长度为5的数组 这是初始化
 * array[2] = 6; 表示array中第2个数是6
 */

public class SearchInSortMatrix1 {
//    public int[] search(int[][] matrix, int target) {
//        if (matrix.length == 0 || matrix[0].length == 0) return new int[] {-1,-1};
//        int row = matrix[0].length; int col = matrix.length;
//        int start = 0; int end = row * col - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            int r = mid % col;
//            int c = mid / col;
//            if (matrix[r][c] == target) return new int[] {r,c};
//            else if (matrix[r][c] > target) end = mid - 1;
//            else start = mid + 1;
//        }
//        return new int[] {-1, -1};
//    }

}