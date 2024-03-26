import java.util.Scanner;

public class _2D_PlayerBoard {

    public static void printBoard(int[][] board, int pos1, int pos2) {
        int counter = 0;
        board[pos1][pos2] = 1;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + board[i][j] + " ");
                counter++;
                if (counter == 5) {
                    System.out.println("");
                    counter = 0;
                }
            }
        }
        board[pos1][pos2] = 0;
    }


    public static int moveLeftRight(int pos2, boolean isMinus) {
        if (isMinus && pos2 != 4) {
            pos2++;
            return pos2;
        } else if (pos2 != 0 && !isMinus) {
            pos2--;
            return pos2;
        } else
            return pos2;
    }

    public static int moveUpDown(int pos1, boolean isMinus) {
        if (isMinus && pos1 != 4) {
            pos1++;
            return pos1;
        } else if (pos1 != 0 && !isMinus) {
            pos1--;
            return pos1;
        } else
            return pos1;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[5][5];
        int pos1 = 2;
        int pos2 = 2;

        System.out.println("Press 1 to start");
        int start = sc.nextInt();

        if (start == 1) {
            while (true) {
                printBoard(board,pos1,pos2);
                boolean isMinus = true;
                System.out.println("Press W to move up, Press S to move down, Press D to move right, Press A to move left");
                char input = sc.next().charAt(0);
                input = Character.toUpperCase(input);
                switch (input) {
                    case 'S':
                        pos1 = moveUpDown(pos1, isMinus);
                        break;
                    case 'W':
                        isMinus = false;
                        pos1 = moveUpDown(pos1, isMinus);
                        break;
                    case 'A':
                        isMinus = false;
                        pos2 = moveLeftRight(pos2, isMinus);
                        break;
                    case 'D':
                        pos2 = moveLeftRight(pos2, isMinus);
                        break;
                    default:
                        System.out.println("invalid input");
                }


            }
        } else {
            System.out.println("Invalid input");
        }
    }
}