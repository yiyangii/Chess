import java.util.ArrayList;
import java.util.List;

public class King extends Chess{
    private int x;
    private int y;
    private List<String> moves = new ArrayList<>();

    private boolean isWhite;
    public King(int x, int y,boolean isWhite) {
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
    }

    @Override
    public List<String> getMoves(Chess[][] board) {
        validMove(board);
        return moves;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public boolean getWhite() {
        return isWhite;
    }

    @Override
    public void validMove(Chess[][] board) {
        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1},           {0, 1},
                {1, -1},  {1, 0},  {1, 1}
        };

        for (int[] dir : directions){
            int row = x + dir[0];
            int col = y + dir[1];



            if(row < 0 || row > 7 || col < 0 || col > 7){
                continue;
            }


            if (board[row][col] != null && board[row][col].getWhite() == isWhite){
                continue;
            }

            char charX = (char) (row + 96);
            String move = row + "" + col;
            moves.add(move);
        }

    }
}
