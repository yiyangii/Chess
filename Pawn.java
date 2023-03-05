import java.util.ArrayList;
import java.util.List;

public class Pawn extends Chess {
    private int x;
    private int y;
    private int type;
    private List<String> moves = new ArrayList<>();
    boolean isWhite;

    public Pawn(int x, int y, boolean isWhite) {
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


        int dir = isWhite ? -1 : 1;

        if (board[x + dir][y] == null){
            char charX = (char) (x + 1 + 96);
            String move = x + dir + "" + y;
            moves.add(move);
            if (board[x + (2 * dir)][y] == null && ((dir == -1 && x == 6) || (dir == 1 && x == 1))){
                charX = (char) (x + 96);
                move = x + (2 * dir) + "" + y;
                moves.add(move);
            }
        }

        if (y - 1 >= 0 && board[x + dir][y - 1] != null && board[x + dir][y - 1].getWhite() != isWhite){
            char charX = (char) (x + 1 + 96);
            String move = (x + dir) + "" + (y - 1);
            moves.add(move);
        }
        if (y + 1 < 8 && board[x + dir][y + 1] != null && board[x + dir][y + 1].getWhite() != isWhite) {

            char charX = (char) (x + 1 + 96);
            String move = (x + dir) + "" + (y + 1);
            moves.add(move);
        }



    }
}

