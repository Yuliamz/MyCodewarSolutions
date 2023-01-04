import java.util.ArrayList;
import java.util.List;

public class ShortestKnightPath {
    public static void main(String[] args) {
        System.out.println(knightMovesBetween("a1", "f7"));
    }
    /**Given two different positions on a chess board, find the least number of moves it would take a knight to get from one to the other.
     *  The positions will be passed as two arguments in algebraic notation.
     *  For example, knight("a3", "b5") should return 1.
     * The knight is not allowed to move off the board. The board is 8x8.
     * <p>
     * <a href="https://www.codewars.com/kata/549ee8b47111a81214000941">Shortest Knight Path</a>
     * <p>
     * */
    public static int knightMovesBetween (String start, String finish) {
        int[][] board = new int[8][8];
        int x1 = start.charAt(0) - 'a';
        int y1 = start.charAt(1) - '1';
        int x2 = finish.charAt(0) - 'a';
        int y2 = finish.charAt(1) - '1';
        int[] initial = {x1, y1};
        int[] end = {x2, y2};
        int[] knightMoves = {-2, -1, 1, 2};
        List<int[]> queue = new ArrayList<>();
        queue.add(initial);
        int moves = 0;
        while (!queue.isEmpty()) {
            List<int[]> nextQueue = new ArrayList<>();
            for (int[] pos : queue) {
                if (pos[0] == end[0] && pos[1] == end[1]) {
                    return moves;
                }
                for (int x : knightMoves) {
                    for (int y : knightMoves) {
                        if (Math.abs(x) != Math.abs(y)) {
                            int[] nextPos = {pos[0] + x, pos[1] + y};
                            if (nextPos[0] >= 0 && nextPos[0] < 8 && nextPos[1] >= 0 && nextPos[1] < 8 && board[nextPos[0]][nextPos[1]] == 0) {
                                board[nextPos[0]][nextPos[1]] = 1;
                                nextQueue.add(nextPos);
                            }
                        }
                    }
                }
            }
            queue = nextQueue;
            moves++;
        }
        return moves;
    }
}





