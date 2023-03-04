import java.util.List;

public class Knight extends Chess{
    private int x;
    private int y;
    private List<String> moves;
    private int type;
    private boolean isWhite;
    public Knight(int x, int y,boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public List<String> getMoves(Chess[][] board) {
        return null;
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

    }
}