import java.util.List;

public class Rook extends Chess{
    private int x;
    private int y;
    private List<String> moves;
    private int type;
    private boolean isWhite;
    public Rook(int x, int y,boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public List<String> getMoves() {
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
    public void validMove(char[][] board) {

    }
}