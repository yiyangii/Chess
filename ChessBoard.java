import java.util.HashMap;

public class ChessBoard {
    // Input : WHITE: Rf1, Kg1, Pf2, Ph2, Pg3
    //BLACK: Kb8, Ne8, Pa7, Pb7, Pc7, Ra5
    //PIECE TO MOVE: Rf1
    Chess[][] chessBoard;
    public ChessBoard(String white,String black,String pieceToMove){
        chessBoard = new Chess[8][8];
        addToChessBoard(white,true);
        addToChessBoard(black,false);
    }

    public void addToChessBoard(String inputString,boolean isWhite){
        String[] input = stringParser(inputString);

        for(String s : input){
            int x = s.charAt(1) - 'a' ;
            int y = 7 - (s.charAt(2) - 49);
            char type = s.charAt(0);

            Chess result = createChess(x,y,type,isWhite);

            chessBoard[x][y] = result;
        }
    }

    private String[] stringParser(String toParse){
        toParse = toParse.replaceAll("[,\\s]+", ""); // 去除逗号和空格
        String[] output = toParse.split("(?<=\\G.{3})");
        return output;
    }

    private Chess createChess(int x,int y,char type,boolean isWhite){
        Chess result;
        switch (type){
            case 'R':
                result = new Rook(x,y,isWhite);
                break;
            case 'K':
                result = new King(x,y,isWhite);
                break;
            case 'P':
                result = new Pawn(x,y,isWhite);
                break;
            case 'N':
                result = new Knight(x,y,isWhite);
                break;
            case 'Q':
                result = new Queen(x,y,isWhite);
                break;
            default:
                result = null;
                break;
        }
        return result;
    }



}
