import java.util.Scanner;

public class _2D_PlayerBoard {

    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.println(board[i][j]);
            }
        }
    }


    public static int moveLeftRight(int pos2, int minus) {
        if (minus == 0 && pos2 != 4) {
            pos2++;
            return pos2;
        } else if (pos2 != 0) {
            pos2--;
            return pos2;
        } else {
            return pos2;
        }

    }

    public static int moveUpDown(int pos1, int minus) {
        if (minus == 0 && pos1 != 4) {
            pos1++;
            return pos1;
        } else if (pos1 != 0) {
            pos1++;
            return pos1;
        } else {
            return pos1;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
        int pos1 = 0;
        int pos2 = 0;
        int minus = 0;

        System.out.println("Press 1 to start");
        int start = sc.nextInt();

        if (start == 1) {
            while (true) {
                System.out.println("Press W to move up, Press S to move down, Press D to move right, Press A to move left");
                char input = sc.next().charAt(0);
                switch (input) {
                    case 'W':
                        pos1 = moveUpDown(pos1, minus);
                        break;
                    case 'S':
                        minus++;
                        pos1 = moveUpDown(pos1, minus);
                        break;
                    case 'D':
                        minus++;
                        pos2 = moveLeftRight(pos2, minus);
                        break;
                    case 'A':
                        pos2 = moveLeftRight(pos2, minus);
                        break;
                    default:
                        System.out.println("invalid input");
                }
                printBoard(board);
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}