import java.util.ArrayList;
import java.util.List;

public abstract class Chess {
    private int x;
    private int y;
    private List<String> moves;
    private int type;
    private boolean isWhite;

    public Chess(int x,int y,boolean isWhite){
        this.x = x;
        this.y = y;

        this.isWhite = isWhite;
        moves = new ArrayList<>();
    }

    protected Chess() {
    }

    public abstract List<String> getMoves(Chess[][] board);

    public abstract int getX();

    public abstract int getY();

    public abstract boolean getWhite();

    public abstract void validMove(Chess[][] board);

}
