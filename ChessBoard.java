import java.util.HashMap;

public class ChessBoard {
    // Input : WHITE: Rf1, Kg1, Pf2, Ph2, Pg3
    //BLACK: Kb8, Ne8, Pa7, Pb7, Pc7, Ra5
    //PIECE TO MOVE: Rf1

    public ChessBoard(String white,String black,String pieceToMove){


    }

    private String[] stringParser(String toParse){
        String[] result = toParse.split(" ,");
        return result;
    }

    private Chess chessConvert(String chess,Boolean isWhite){
        int x = chess.charAt(1) - 'a';
        int y = (int)chess.charAt(2);
        char type = chess.charAt(0);


    }

    private



}
