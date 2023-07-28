import java.util.*;

public class ticTacToe {
    public static void main(String[] args) {
        char[][] box = new char[3][3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                box[i][j] = ' ';
            }
        }
        int win = 0;
        int count = 1;

        boolean playAgain = false;

        int tossWin = 0;

        char p1Ch = ' ';
        char p2Ch = ' ';
        do {
            System.out.println("Let's Toss!");
            System.out.println("player 1 choose head or tail!");
            System.out.println("if head 'h' else 't'");
            boolean a = true;
            while (a) {
                char ch = in.next().charAt(0);
                Random rand = new Random();
                int toss = rand.nextInt(10);
                if (toss % 2 == 0 && ch == 'h' || toss % 2 == 1 && ch == 't') {
                    System.out.println("Player 1 won which one you want 'x' or 'o'");
                    tossWin = 1;
                    while (true) {
                        char p1 = in.next().charAt(0);
                        if (p1 == 'x') {
                            System.out.println("player 1 'x' and player 2 'o'");
                            p1Ch = 'x';
                            p2Ch = 'o';
                            printBoard(count, win, tossWin, box, p1Ch, p2Ch);
                            playAgain = wantToPlayAgain(box);
                            a = false;
                            break;

                        } else if (p1 == 'o') {
                            System.out.println("player 1 'o' and player 2 'x'");
                            p2Ch = 'x';
                            p1Ch = 'o';
                            printBoard(count, win, tossWin, box, p1Ch, p2Ch);
                            playAgain = wantToPlayAgain(box);
                            a = false;
                            break;

                        } else {
                            System.out.println("enter valid symbol!");
                        }
                    }

                } else if (toss % 2 == 1 && ch == 'h' || toss % 2 == 0 && ch == 't') {
                    System.out.println("Player 2 won which one you want 'x' or 'o'");
                    tossWin = 2;
                    while (true) {
                        char p1 = in.next().charAt(0);
                        p2Ch = p1;
                        if (p1 == 'x') {
                            System.out.println("player 2 'x' and player 1 'o'");
                            p1Ch = 'o';
                            p2Ch = 'x';
                            printBoard(count, win, tossWin, box, p1Ch, p2Ch);
                            playAgain = wantToPlayAgain(box);
                            a = false;
                            break;

                        } else if (p1 == 'o') {
                            System.out.println("player 2 'o' and player 1 'x'");
                            p1Ch = 'x';
                            p2Ch = 'o';
                            printBoard(count, win, tossWin, box, p1Ch, p2Ch);
                            playAgain = wantToPlayAgain(box);
                            a = false;
                            break;

                        } else {
                            System.out.println("enter valid input!");
                        }
                    }

                } else {
                    System.out.println("Enter valid input!");
                }
            }
        } while (playAgain);
       
    }

    // ------------------------------------------------------------------------------------------------------------------------------------------
    public static void printBoard(int count, int win, int tossWin, char[][] box, char p1Ch, char p2Ch) {
        while (count <= 9) {
            if (tossWin == 1) {
                if (count % 2 == 1) {
                    player1Choice(box, p1Ch);
                    if (checkWinner(box, p1Ch)) {
                        print(box);
                        System.out.println("\nPlayer 1 is the winner!");
                        break;
                    }
                } else {
                    player2Choice(box, p2Ch);
                    if (checkWinner(box, p2Ch)) {
                        print(box);
                        System.out.println("\nPlayer 2 is the winner!");
                        break;
                    }
                }

            } else if (tossWin == 2) {
                if (count % 2 == 0) {
                    player1Choice(box, p1Ch);
                    if (checkWinner(box, p1Ch)) {
                        print(box);
                        System.out.println("\nPlayer 1 is the winner!");
                        break;
                    }
                } else {
                    player2Choice(box, p2Ch);
                    if (checkWinner(box, p2Ch)) {
                        print(box);
                        System.out.println("\nPlayer 2 is the winner!");
                        break;
                    }
                }
            }
            print(box);
            count++;
        }
        if (count > 9) {
            System.out.println("Match Draw!");
        }
    }

    // ------------------------------------------------------------------------------------------------------------------------------------------
    public static void player1Choice(char[][] box, char p1Ch) {
        Scanner in = new Scanner(System.in);
        boolean a = true;
        while (a) {
            System.out.println("\nPlayer 1 put " + "'" + p1Ch + "'");
            char p = in.next().charAt(0);
            if (p == p1Ch) {
                a = false;
                while (true) {
                    System.out.println("Enter the row number:");
                    int x = in.nextInt();
                    System.out.println("Enter the column number:");
                    int y = in.nextInt();
                    if (x <= 2 && y <= 2) {
                        if (box[x][y] != 'x' && box[x][y] != 'o') {
                            box[x][y] = p;
                            break;
                        } else {
                            System.out.println("symbol already exists!");
                        }
                    } else {
                        System.out.println("Enter valid position!");
                    }
                }
            } else {
                System.out.println("Enter valid symbol");
            }
        }
       
    }

    // ------------------------------------------------------------------------------------------------------------------------------------------
    public static void player2Choice(char[][] box, char p2Ch) {
        Scanner in = new Scanner(System.in);
        boolean a = true;
        while (a) {
            System.out.println("\nPlayer 2 put " + "'" + p2Ch + "'");
            char p = in.next().charAt(0);
            if (p == p2Ch) {
                a = false;
                while (true) {
                    System.out.println("Enter the row number:");
                    int x = in.nextInt();
                    System.out.println("Enter the column number:");
                    int y = in.nextInt();
                    if (x <= 2 && y <= 2) {
                        if (box[x][y] != 'x' && box[x][y] != 'o') {
                            box[x][y] = p;
                            break;
                        } else {
                            System.out.println("symbol already exist!");
                        }
                    } else {
                        System.out.println("Enter valid position!");
                    }
                }
            } else {
                System.out.println("Enter valid symbol");
            }
        }
       
    }

    // ------------------------------------------------------------------------------------------------------------------------------------------
    public static void print(char[][] box) {
        System.out.println();
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                System.out.print(box[i][j]);
                if (j != 2) {
                    System.out.print("  |  ");
                }
            }
            if (i != 2) {
                System.out.println("\n-------------");
            }
        }
        System.out.println();
    }

    // ------------------------------------------------------------------------------------------------------------------------------------------
    public static boolean checkWinner(char[][] box, char ch) {
        int r1 = 0, r2 = 0, r3 = 0;
        int c1 = 0, c2 = 0, c3 = 0;
        int d1 = 0, d2 = 0;
        int k = 2;
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                if (i == 0) {
                    if (box[i][j] == ch) {
                        r1++;
                    }
                    if (box[j][i] == ch) {
                        c1++;
                    }
                } else if (i == 1) {
                    if (box[i][j] == ch) {
                        r2++;
                    }
                    if (box[j][i] == ch) {
                        c2++;
                    }
                } else if (i == 2) {
                    if (box[i][j] == ch) {
                        r3++;
                    }
                    if (box[j][i] == ch) {
                        c3++;
                    }
                }
            }
            if (box[i][i] == ch) {
                d1++;
            }
            if (box[k][i] == ch) {
                d2++;
            }
            k--;
        }
        if (r1 == 3 || r2 == 3 || r3 == 3 || c1 == 3 || c2 == 3 || c3 == 3 || d1 == 3 || d2 == 3) {
            return true;
        }
        return false;
    }

    // ----------------------------------------------------------------------------------------------------------------------------------
    public static boolean wantToPlayAgain(char[][] box) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to Play again!\npress 'y' or 'n'");
            char play = in.next().charAt(0);
            if (play == 'y') {
               for(int i = 0; i < box.length; i++){
                for(int j = 0; j < box.length; j++){
                    box[i][j] = ' ';
                }
               }
                return true;
            } else if (play == 'n') {
               
                return false;
            } else {
                System.out.println("Enter valid input!");
            }
        }

    }
}