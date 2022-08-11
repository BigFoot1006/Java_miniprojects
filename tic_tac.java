package section_six;
import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class tic_tac {
    public static void main(String[] args) {
        String[][] board = new String[3][3];
        createBoard(board);
        printBoard(board);

        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

            for(int k = 0; k < 9; k++) {
                if (k%2 == 0) {
                    System.out.print("X chooses the square: x: ");
                    int x = scanner.nextInt();
                    System.out.print("X chooses the square: y: ");
                    int y = scanner.nextInt();
                
                    for(int i = 0; i < board.length; i++) {
                        for(int j = 0; j < board[i].length; j++) {
                            if(i==x && j==y && board[i][j].equals("_")) {
                            board[i][j] = "X";
                            } else if (i==x && j==y && board[i][j].equals("X")) {
                                System.out.println("You choosed wrong square. You lose!");
                                System.exit(0);
                            } else if (i==x && j==y && board[i][j].equals("0")) {
                                System.out.println("You choosed wrong square. You lose!");
                                System.exit(0);
                            }
                        }
                    }
                    printBoard(board);
                }
                if(k%2 == 1) {
                    System.out.print("0 chooses the square: x: ");
                    int x = scanner.nextInt();
                    System.out.print("0 chooses the square: y: ");
                    int y = scanner.nextInt();

                    for(int i = 0; i < board.length; i++) {
                        for(int j = 0; j < board[i].length; j++) {
                            if(i==x && j==y && board[i][j].equals("_")) {
                            board[i][j] = "0";
                            } else if (i==x && j==y && board[i][j].equals("X")) {
                                System.out.println("You choosed wrong square. You lose!");
                                System.exit(0);
                            } else if (i==x && j==y && board[i][j].equals("0")) {
                                System.out.println("You choosed wrong square. You lose!");
                                System.exit(0);
                            }
                        }
                    }
                    printBoard(board);
                }
            }
            scanner.close();
        
            for(int i = 0; i < 3; i++) {
                if(board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]) && "X".equals(board[i][0])) {
                    System.out.println("X wins the game");
                }
            }
            if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && "X".equals(board[0][0])) {
                System.out.println("X wins the game");
            }
            if (board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]) && "X".equals(board[2][0])) {
                System.out.println("X wins the game");
            }

            for(int i = 0; i < 3; i++) {
                if(board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]) && "Y".equals(board[i][0])) {
                    System.out.println("Y wins the game");
                }
            }
            if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && "Y".equals(board[0][0])) {
                System.out.println("Y wins the game");
            }
            if (board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]) && "Y".equals(board[2][0])) {
                System.out.println("Y wins the game");
            }
    }
    /**
     * function name: createBoard
     * return void
     * @param string
     * Inside the function:
     * 1. create a string TD (two dimensions)
     * 
     */
    public static void createBoard (String[][] string) {
        for(int i = 0; i < string.length; i++) {
            for(int j = 0; j < string[i].length; j++) {
                string[i][j] = "_";
            }
        }
    }
    /**
     * function name: printBoard
     * return void
     * @param string
     * Inside the function:
     * 1. print a string TD (two dimensions)
     * 
     */
    public static void printBoard (String[][] string) {
        System.out.print("\t");
        for(int i = 0; i < string.length; i++) {
        System.out.print("\t" + i);
        }
        System.out.println("\n");
        for(int i = 0; i < string.length; i++) {
            System.out.print("\t" + i + ". ");
            for(int j = 0; j < string[i].length; j++) {
                System.out.print("\t" + string[i][j]);
            }
            System.out.println("\n");
        }
    }
}
