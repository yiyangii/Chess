import java.util.ArrayList;
import java.util.List;

public class Rook extends Chess{
    private int x;
    private int y;
    private List<String> moves = new ArrayList<>();
    private int type;
    private boolean isWhite;
    public Rook(int x, int y,boolean isWhite) {
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


        //Check Horizontal


        for(int i = x - 1;i >= 0;i--){
            if(board[i][y] == null){
                char charX = (char) (i + 96);
                String move = i + "" + y;
                moves.add(move);
            }else if(board[i][y].getWhite() != isWhite){
                char charX = (char) (i + 96);
                String move = i + "" + y;
                moves.add(move);
                break;
            }else{
                break;
            }
        }

        for(int i = x + 1; i < 8;i++){
            if(board[i][y] == null){
                char charX = (char) (i + 96);
                String move = i + "" + y;
                moves.add(move);
            }else if(board[i][y].getWhite() != isWhite){
                char charX = (char) (i + 96);
                String move = i + "" + y;
                moves.add(move);
                break;
            }else{
                break;
            }
        }

        for(int i = y - 1;i >= 0;i--){
            if(board[x][i] == null){
                char charX = (char) (i + 96);
                String move = x + "" + i;
                moves.add(move);
            }else if(board[x][i].getWhite() != isWhite){
                char charX = (char) (i + 96);
                String move = x + "" + i;
                moves.add(move);
                break;
            }else{
                break;
            }
        }
        for(int i = y + 1;i < 8;i++){
            if(board[x][i] == null){
                char charX = (char) (i + 96);
                String move = x + "" + i;
                moves.add(move);
            }else if(board[x][i].getWhite() != isWhite){
                char charX = (char) (i + 96);
                String move = x + "" + i;
                moves.add(move);
                break;
            }else{
                break;
            }
        }
    }

}