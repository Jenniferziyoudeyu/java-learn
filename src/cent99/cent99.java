package cent99;

import java.util.ArrayList;
import java.util.List;

public class cent99 {
    public static void main(String args[]) {
        List<int[]> res = allCombinations(new int[]{25, 15}, 300);
        //下面是for （int i = 0 ; i < count.length - 1; i++)的另一种写法。 好处是直接loop数字，而不是index
        for (int[] count: res) {
            for (Integer curCount: count) {
                System.out.print(curCount);
                System.out.print(",");
            }
            System.out.print("\n");
        }
    }

    static private List<int[]> allCombinations(int[] coins, int total) {
        List<int[]> res = new ArrayList<>();
        if (coins == null) return res;
        AllCombinationsHelper(res, new int[coins.length], coins, 0, total);
        return res;
    }

    static private void AllCombinationsHelper(List<int[]> res, int[] count,
                                              int[] coins, int index, int total) {
        if (index >= coins.length || total <= 0) {
            if (total == 0) {
                res.add(count.clone());
            }
            return;
        }
        for (int i = 0; i <= total/coins[index]; i++) {
            count[index] = i;
            AllCombinationsHelper(res, count, coins, index + 1, total - coins[index] * i);
            count[index] = 0;
        }
    }

}
