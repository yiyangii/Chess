import java.util.ArrayList;
import java.util.List;

public class Knight extends Chess{
    private int x;
    private int y;
    private List<String> moves;
    private int type;
    private boolean isWhite;
    public Knight(int x, int y,boolean isWhite) {
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
        moves = new ArrayList<>();
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
        int[] dx = {2, 2, 1, 1, -1, -1, -2, -2};
        int[] dy = {1, -1, 2, -2, 2, -2, 1, -1};
        for(int i = 0;i < 8;i++){
            int row = x + dx[i];
            int col = y + dy[i];


            if (row >= 0 && row < 8 && col >= 0 && col < 8){
                if (board[row][col] == null){
                    char charX = (char) (row + 96);
                    String move = row + "" + col;
                    moves.add(move);
                }else if(board[row][col].getWhite() != isWhite){
                    char charX = (char) (row + 96);
                    String move = row + "" + col;
                    moves.add(move);
                }


            }
        }
    }
}