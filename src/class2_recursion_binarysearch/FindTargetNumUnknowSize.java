package class2_recursion_binarysearch;



public class FindTargetNumUnknowSize {
    public int FindTargetNumInUnknowSize (Dictionary dict, int target) {
        if (dict == null) return 0;
        int left = 0, right = 1;
        while (right < dict.get(right)) {
            left = right;
            right *= 2;
        }

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (mid == target) return mid;
            if (mid > target) return right = mid - 1;
            if (mid < target) return left = mid + 1;
        }
        return -1;
    }

}

interface Dictionary {
    public Integer get(int index);
}