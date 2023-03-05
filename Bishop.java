import java.util.ArrayList;
import java.util.List;

public class Bishop extends Chess{
    private int x;
    private int y;
    private List<String> moves = new ArrayList<>();
    private int type;
    private boolean isWhite;

    public Bishop(int x, int y, boolean isWhite) {
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

        if(board[x][y] != null){
            return;
        }
        //Check top-left;
        int locationX = x - 1;
        int locationY = y - 1;

        while(locationX >= 0 && locationY >= 0){
            if(board[locationX][locationY] == null){
                char charX = (char) (locationX + 96);
                String move = locationX + "" + locationY;
                moves.add(move);
            }else if(board[locationX][locationY].getWhite() != isWhite){
                char charX = (char) (locationX + 96);
                String move = locationX + "" + locationY;
                moves.add(move);
                break;
            }else{
                break;
            }
            locationX--;
            locationY--;
        }
        //Check top-right
        locationX = x + 1;
        locationY = y - 1;
        while(locationX < 8 && locationY >= 0){
            if(board[locationX][locationY] == null){
                char charX = (char) (locationX + 96);
                String move = locationX + "" + locationY;
                moves.add(move);
            }else if(board[locationX][locationY].getWhite() != isWhite){
                char charX = (char) (locationX + 96);
                String move = locationX + "" + locationY;
                moves.add(move);
            }else{
                break;
            }
            locationX++;
            locationY--;
        }

        //Check bottom-left
        locationX = x - 1;
        locationY = y + 1;
        while(locationX >= 0 && locationY < 8){
            if(board[locationX][locationY] == null){
                char charX = (char) (locationX + 96);
                String move = locationX + "" + locationY;
                moves.add(move);
            }else if(board[locationX][locationY].getWhite() != isWhite){
                char charX = (char) (locationX + 96);
                String move = locationX + "" + locationY;
                moves.add(move);
            }else{
                break;
            }
            locationX--;
            locationY++;
        }

        //Check bottom-right
        locationX = x + 1;
        locationY = y + 1;
        while(locationX < 8 && locationY < 8){
            if(board[locationX][locationY] == null){
                char charX = (char) (locationX + 96);
                String move = locationX + "" + locationY;
                moves.add(move);
            }else if(board[locationX][locationY].getWhite() != isWhite){
                char charX = (char) (locationX + 96);
                String move = locationX + "" + locationY;
                moves.add(move);
            }else{
                break;
            }
            locationX++;
            locationY++;
        }

    }
}
