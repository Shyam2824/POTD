import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class SequentialDigitsl {
    class Solution {
  public List<Integer> sequentialDigits(int low, int high) {
    List<Integer> ans = new ArrayList<>();
    Queue<Integer> q = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

    while (!q.isEmpty()) {
      final int num = q.poll();
      if (num > high)
        return ans;
      if (low <= num && num <= high)
        ans.add(num);
      final int lastDigit = num % 10;
      if (lastDigit < 9)
        q.offer(num * 10 + lastDigit + 1);
    }

    return ans;
  }
}
}
