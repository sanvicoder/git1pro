import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToe {
    int r, c;
    char mar;
    String win;
    char a[][] = new char[3][3];

    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(read);
        System.out.println("Enter the name of the players");
        String ply1, ply2;
        char ch1, ch2;
        ply1 = input.readLine();
        ply2 = input.readLine();
        TicTacToe obj = new TicTacToe();
        obj.extracted(input, ply1, ply2);
    }

    private void extracted(BufferedReader input, String ply1, String ply2) throws IOException {
        char ch2;
        char ch1;
        win = ply1;
        System.out.println("Enter the choice X or O");
        ch1 = (char) input.read();
        ch2 = (ch1 == 'X') ? 'O' : 'X';
        char winch=ch1;
        System.out.println(ply1 + " goes first ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = ' ';
            }
        }
        while (true) {
            System.out.println(win + " turn");
            move(winch);
            board();
            if (checkrow() || checkcol() || checkdia())
            {
                System.out.println(win + " has won");
                break;
            }
            else {
                if (win == ply1) {
                    win = ply2;
                    winch = ch2;
                } else {
                    win = ply1;
                    winch = ch1;
                }
            }
        }
    }

    void board () {
        System.out.println("------------");
        for (int i = 0; i < a.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " | ");
            }
            System.out.println();
            System.out.println("------------");
        }
    }

    void move ( char ch) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(read);
        System.out.println("Enter the row and column number");
        r = Integer.parseInt(input.readLine());
        c = Integer.parseInt(input.readLine());
        mark(r, c, ch);
    }

    void mark ( int row, int col, char m)throws IOException
    {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2 && a[row][col]==' ')
        {
            a[row][col] = m;
        } else {
            System.out.println("Invalid choice");
            move(m);
        }
    }
    boolean checkcol ()
    {
        for (int j = 0; j <= 2; j++) {
            if (a[0][j] != ' ' && a[0][j] == a[1][j] && a[1][j] == a[2][j]){
                return true;
            }
        }
        return false;
    }
    boolean checkrow ()
    {
        for (int i = 0; i <= 2; i++) {
            if (a[i][0] != ' ' && a[i][0] == a[i][1] && a[i][1] == a[i][2]){
                return true;
            }
        }
        return false;
    }
    boolean checkdia ()
    {
        if((a[0][0] != ' ' && (a[0][0] == a[1][1] && a[1][1] == a[2][2])) || (a[0][2] != ' ' && (a[0][2] == a[1][1] && a[1][1] == a[2][0]))){
            return true;
        }
        else
            return false;
    }
}
