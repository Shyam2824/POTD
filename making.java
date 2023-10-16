import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class making {
    class Solution {
    public int largestIsland(int N, int[][] grid) {
        HashMap<Integer, Integer> record = new HashMap<>();
        int m = grid.length;
        int n = grid[0].length;
        int max = Integer.MIN_VALUE;
        int id = 2;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int count = putId(i, j, grid, m, n, 0, id);
                    record.put(id, count);
                    max = Math.max(max, count);
                    id++;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> s = new HashSet<>();
                    int sum = 1;

                    if (isValid(i - 1, j, m, n) && grid[i - 1][j] > 1 && s.add(grid[i - 1][j])) {
                        int c = record.get(grid[i - 1][j]);
                        sum += c;
                    }

                    if (isValid(i + 1, j, m, n) && grid[i + 1][j] > 1 && s.add(grid[i + 1][j])) {
                        int c = record.get(grid[i + 1][j]);
                        sum += c;
                    }

                    if (isValid(i, j - 1, m, n) && grid[i][j - 1] > 1 && s.add(grid[i][j - 1])) {
                        int c = record.get(grid[i][j - 1]);
                        sum += c;
                    }

                    if (isValid(i, j + 1, m, n) && grid[i][j + 1] > 1 && s.add(grid[i][j + 1])) {
                        int c = record.get(grid[i][j + 1]);
                        sum += c;
                    }

                    max = Math.max(max, sum);
                }
            }
        }
        return (max == Integer.MIN_VALUE) ? m * n : max;
    }

    public int putId(int i, int j, int[][] grid, int m, int n, int count, int id) {
        if (i < 0 || j < 0 || i >= m || j >= n) return count;
        if (grid[i][j] > 1 || grid[i][j] == 0) return count;
        else {
            grid[i][j] = id;
            count++;
            count = putId(i + 1, j, grid, m, n, count, id);
            count = putId(i - 1, j, grid, m, n, count, id);
            count = putId(i, j + 1, grid, m, n, count, id);
            count = putId(i, j - 1, grid, m, n, count, id);
            return count;
        }
    }

    public boolean isValid(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}
}
