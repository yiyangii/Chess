public class main {
    public static void main(String[] args) {

        String white = "Rf1, Kg1, Pf2, Ph2, Pg3";
        String black = "Kb8, Ne8, Pa7, Pb7, Pc7, Ra5";
        String toMove = "";
        ChessBoard chessBoard = new ChessBoard(white,black,toMove);
        for (int j = 0;j < 8;j++){

            for(int i = 0;i < 8;i++){
                System.out.print(chessBoard.chessBoard[i][j]);
                System.out.print(", ");
            }
            System.out.println();
        }

        Chess c = new Bishop(3,3,true);
        System.out.println();

        System.out.println(c.getMoves(chessBoard.chessBoard));


    }



}
