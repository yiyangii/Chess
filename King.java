import java.util.List;

public class King extends Chess{
    private int x;
    private int y;
    private List<String> moves;

    private boolean isWhite;
    public King(int x, int y, int type, boolean isWhite) {
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
