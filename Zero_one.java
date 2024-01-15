import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Zero_one {
    class Solution {
  public List<List<Integer>> findWinners(int[][] matches) {
    List<List<Integer>> ans = Arrays.asList(new ArrayList<>(), new ArrayList<>());
    Map<Integer, Integer> lossesCount = new TreeMap<>();

    for (int[] m : matches) {
      final int winner = m[0];
      final int loser = m[1];
      if (!lossesCount.containsKey(winner))
        lossesCount.put(winner, 0);
      lossesCount.merge(loser, 1, Integer::sum);
    }

    for (final int player : lossesCount.keySet()) {
      final int nLosses = lossesCount.get(player);
      if (nLosses < 2)
        ans.get(nLosses).add(player);
    }

    return ans;
  }
}
}
