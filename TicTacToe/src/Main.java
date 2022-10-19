import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        char[][] board = {
                {'_', '_', '_' },
                {'_', '_', '_' },
                {'_', '_', '_' },

        };
        printBoard(board);
        for (int i = 0; i < 9; i++) {

            if (i % 2 == 0) {
                System.out.println("Turn: X");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'X';
                printBoard(board);

            } else {
                System.out.println("Turn: O");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'O';
                printBoard(board);
            }

            if (checkWin(board) == 3) {
                System.out.println("X wins!!");
                break;
            } else if (checkWin(board) == -3) {
                System.out.println("O wins!!");
                break;
            } else if (i == 8) {
                System.out.println("It's a tie!");
            }

        }

    }


    public static void printBoard(char[][] board) {
        System.out.print("\n");
        for (int i = 0; i < board.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n\n");
        }
    }

    public static int[] askUser(char[][] board) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" - pick a row and column number: ");

        int row = scan.nextInt();
        int column = scan.nextInt();

        while (board[row][column] != ('_')) {
            System.out.print("Spot taken, try again: ");
            row = scan.nextInt();
            column = scan.nextInt();
        }


        int[] spot = {row, column};
        return spot;
    }

        public static int checkWin(char[][] board) {

            //Check each of 3 rows
            int count = 0;

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == 'X') {
                        count++; //count each X as +1
                    } else if (board[i][j] == 'O') {
                        count--; //count each O as -1.
                    }
                }
                if (count == 3 || count == -3) {
                    return count;
                } else {
                    count = 0;
                }

            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    if (board[j][i] == 'X') {
                        count++; //count each X as +1
                    } else if (board[j][i] == 'O') {
                        count--; //count each O as -1.
                    }
                }
                if (count == 3 || count == -3) {
                    return count;
                } else {
                    count = 0;
                }
            }

            for (int i = 0; i < 3; i++) {
                if (board[i][i] == 'X') {
                    count++; //count each X as +1
                } else if (board[i][i] == 'O') {
                    count--; //count each O as -1.
                }
            }

            if (count == 3 || count == -3) {
                return count;
            } else {
                count = 0;
            }

            for (int i = 0; i < 3; i++) {
                if (board[i][2-i] == 'X') {
                    count++; //count each X as +1
                } else if (board[i][2-i] == 'O') {
                    count--; //count each O as -1.
                }
            }

            return count;
        }
    }

