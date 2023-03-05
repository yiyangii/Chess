import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //WHITE: Rf1, Kg1, Pf2, Ph2, Pg3
        //BLACK: Kb8, Ne8, Pa7, Pb7, Pc7, Ra5
        //Rf1
        System.out.print(" Please Enter Your board configuration For ||WHITE|| eg. WHITE: Rf1, Kg1：" );
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine().trim();


        String colorWhite = userInput.substring(0,5);
        String white = userInput.substring(7);
        System.out.print(" Please Enter Your board configuration For ||BLACK|| eg. BLACK: Rf1, Kg1：" );
        scanner = new Scanner(System.in);
        userInput = scanner.nextLine().trim();
        String colorBlack = userInput.substring(0,5);
        String black = userInput.substring(7);

        System.out.println(" Please Enter PIECE TO MOVE: eg. Rf1, Kg1 : ");
        scanner = new Scanner(System.in);
        String toMove = scanner.nextLine().trim();
        scanner.close();

        if (colorWhite.equals("WHITE") && colorBlack.equals("BLACK")){
            ChessBoard board = new ChessBoard(white,black,toMove);
            System.out.println(board.getOutput());
        }








    }



}
