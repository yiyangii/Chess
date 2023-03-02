import java.util.List;

public class Pawn extends Chess{
    private int x;
    private int y;
    private int type;
    private List<String> moves;
    boolean isWhite;
    public Pawn(int x, int y, int type,boolean isWhite) {
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
