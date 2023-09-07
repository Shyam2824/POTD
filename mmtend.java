import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class mmtend {
    int minimumMultiplications(int[] arr, int start, int end) {
 int maxLimit = 100001;
        int[] steps = new int[maxLimit];
        Arrays.fill(steps, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        steps[start] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == end) {
                return steps[current];
            }

            for (int number : arr) {
                int newStart = (current * number) % 100000;
                if (steps[newStart] == -1) {
                    steps[newStart] = steps[current] + 1;
                    queue.offer(newStart);
                }
            }
        }

        return -1; 

    }
}
