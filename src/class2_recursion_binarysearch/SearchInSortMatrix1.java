package class2_recursion_binarysearch;

/**
 * /**
 *  * Description
 *  * Given a 2D matrix that contains integers only, which each row is sorted in an ascending order. The first element of next row is larger than (or equal to) the last element of previous row.
 *  *
 *  * Given a target number, returning the position that the target locates within the matrix. If the target number does not exist in the matrix, return {-1, -1}.
 *  *
 *  * Assumptions:
 *  *
 *  * The given matrix is not null, and has size of N * M, where N >= 0 and M >= 0.
 *  * Examples:
 *  * col = 3 , row = 4
 *  * matrix = { {1, 2, 3}, {4, 5, 7}, {8, 9, 10} , {11 , 12 , 15} }
 *  *
 *  * target = 7, return {1, 2}
 *  *
 *  * target = 6, return {-1, -1} to represent the target number does not exist in the matrix.
 *  *
 *  * 关于array
 *  * int[] array = new int[5];   表示array是长度为5的数组 这是初始化
 *  * array[2] = 6; 表示array中第2个数是6
 *  */

/*
   Apple binary search in 2D space
   Variant(变种)1.0 application： 2D matrix, sorted on each row, first element
   of next row is larger (or equal) to the last element of previous row, now giving a target number,
   returning hte position that the target locates within the matrix
   二维数组找target
   1    2    3    4
   5    6    7    8
   9    10   11   12

   target == 6？？？？
    */
    /*
    method 1
    Step 1: 先竖着找列，在m列中找到最接近target的num。确定行数 O(log(n))
    Step 2: 确定了target所在列数,再在n行里找target所在的列 O(log(m))
    Time = O(log(m) + log(n)) = O(log(mn))
     */

/*
method 3 run binary search only once
时间复杂度
把二维的数组化成平面，每次分成两部分
一共是m*n个数
一共有几层就是时间复杂度
m * n            2^k
m * n / 2        ...
m * n / 4        ...
...              ...
4                2^2
2                2^1
1                2^0
2^k = m*n => k = log(m*n)
Time = O(logmn)；
 */
public class SearchInSortMatrix1 {
    public boolean ifFind(int[][] matrix, int target) {
        //matrix.length竖着的行数（有几行），matrix[0].length第一行有几个数也就是有几列
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int row = matrix.length;
        int col = matrix[0].length;
        //i是左上角（第一个数），j是右下角（最后一个数）-1是因为第一个数角标是0，所以最后一个数也要向前移一位
        int i = 0;
        int j = row * col - 1;
        while (i <= j) {
            int mid = i + (j - i)/2;
            //找mid坐标 r在第几行，c是在第几个数（列）
            int r = mid / col;
            int c = mid % col;
            if (matrix[r][c] == target)
                return true;
            else if (matrix[r][c] > target)
                j = mid - 1;
            else
                i = mid + 1;
        }
        return false;

    }
}
