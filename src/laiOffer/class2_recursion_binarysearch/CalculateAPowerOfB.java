package laiOffer.class2_recursion_binarysearch;
/**
 * Description
 * Evaluate a to the power of b, assuming both a and b are integers and b is non-negative.
 *
 * Examples
 *
 * power(2, 0) = 1
 * power(2, 3) = 8
 * power(0, 10) = 0
 * power(-2, 5) = -32
 * Corner Cases
 *
 * What if the result is overflowed? We can assume the result will not be overflowed when we solve this problem on this online judge.
 *               a^7
 *            /     \
 *         a^4       a^3
 *        /  \      /  \
 *     a^2  a^2   a^2   a
 *     /\   /\    /\   /
 *    a a  a a   a a  1
 *   / /  / /   / /
 *  1 1  1 1   1 1
 *
 */

public class CalculateAPowerOfB {
    public long power(int a, int b) {
        if (b == 0) return 1;
        long temp = power(a, b/2);
        if (b % 2 == 0)
            temp = temp * temp;
        if (b % 2 != 0)
            temp = temp * temp * a;
        return temp;
    }
}