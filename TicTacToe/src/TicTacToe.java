import java.util.Random;
import java.util.Scanner;
//stopped at timestamp 17:30 link:https://www.youtube.com/watch?v=gQb3dE-y1S4
public class TicTacToe {
    public static void main(String[] args){
        char [][] gameboard = { {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}};
        printGameBoard(gameboard);
        System.out.println("Enter your placements (1-9):");
        while(true) {
            Scanner scan = new Scanner(System.in);
            int playerPosition = scan.nextInt();
            System.out.println(playerPosition);
            placePiece(gameboard, playerPosition, "player");
            printGameBoard(gameboard);

            Random rand = new Random();
            int cpuPosition = rand.nextInt(9) + 1;
            System.out.println(cpuPosition);
            placePiece(gameboard, cpuPosition, "cpu");
            printGameBoard(gameboard);
        }
    }
    public static void printGameBoard(char[][] gameBoard){

        for(char[] row : gameBoard){
            for(char c :row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void placePiece(char[][] gameboard,int position,String user){
        char symbols=' ';
        if(user.equals("player")){
            symbols = 'X';
        }else if(user.equals("cpu")){
            symbols='O';
        }

        switch(position){
            case 1:
                gameboard[4][0] = symbols;
                break;
            case 2:
                gameboard[4][2] = symbols;
                break;
            case 3:
                gameboard[4][4] = symbols;
                break;
            case 4:
                gameboard[2][0] = symbols;
                break;
            case 5:
                gameboard[2][2] = symbols;
                break;
            case 6:
                gameboard[2][4] = symbols;
                break;
            case 7:
                gameboard[0][0] = symbols;
                break;
            case 8:
                gameboard[0][2] = symbols;
                break;
            case 9:
                gameboard[0][4] = symbols;
                break;
            default:
                break;
        }
    }
    public static String checkWinner(){
       //stopped here
        return"";
    }
}
