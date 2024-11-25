import java.util.*;
import java.util.*;

public class Solution {
    public int slidingPuzzle(int[][] board) {
        String target = "123450";
        String start = toString(board);

        if (start.equals(target)) return 0;

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int s = 0; s < size; s++) {
                String current = queue.poll();

                if (current.equals(target)) return steps;

                int zeroIndex = current.indexOf('0');
                int row = zeroIndex / 3, col = zeroIndex % 3;

                for (int[] dir : directions) {
                    int newRow = row + dir[0], newCol = col + dir[1];

                    if (newRow >= 0 && newRow < 2 && newCol >= 0 && newCol < 3) {
                        int newZeroIndex = newRow * 3 + newCol;
                        String nextState = swap(current, zeroIndex, newZeroIndex);

                        if (!visited.contains(nextState)) {
                            visited.add(nextState);
                            queue.add(nextState);
                        }
                    }
                }
            }
            steps++;
        }

        return -1; // If no solution exists
    }

    private String swap(String state, int i, int j) {
        char[] chars = state.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }

    private String toString(int[][] board) {
        StringBuilder sb = new StringBuilder();
        for (int[] row : board) {
            for (int num : row) {
                sb.append(num);
            }
        }
        return sb.toString();
    }
}
