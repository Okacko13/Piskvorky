import java.util.Arrays;

public class TicTacToe {

    private char[][] gameField = new char[3][3];

    private final char player1 = 'X';
    private final char player2 = '0';

    public TicTacToe(){

    }

    public void printField(){

        for(int a = 0; a < gameField.length; a++){
            System.out.print("\t" +(a));
        }

        int i = 0;
        System.out.print("\n");

        for (int y = 0; y < gameField.length; y++) {
            for (int x = 0; x < gameField[y].length; x++) {
                if(x % 10 == 0){
                    System.out.print(i);
                }
                System.out.print("\t" + gameField[y][x]);
            }
            i++;
            System.out.println();
        }
    }

    public String checkWinner(){
        String line = null;

        for (int a = 0; a < 8; a++) {
            switch (a) {
                case 0:
                    line = String.valueOf(gameField[0][0] + gameField[0][1]+ gameField[0][2]);
                    break;
                case 1:
                    line = String.valueOf(gameField[1][0] + gameField[1][1]+ gameField[1][2]);
                    break;
                case 2:
                    line = String.valueOf(gameField[2][0] + gameField[2][1]+ gameField[2][2]);
                    break;
                case 3:
                    line = String.valueOf(gameField[0][0] + gameField[1][0]+ gameField[2][0]);
                    break;
                case 4:
                    line = String.valueOf(gameField[0][1] + gameField[1][1]+ gameField[2][1]);
                    break;
                case 5:
                    line = String.valueOf(gameField[0][2] + gameField[1][2]+ gameField[2][2]);
                    break;
                case 6:
                    line = String.valueOf(gameField[0][0] + gameField[1][1]+ gameField[2][2]);
                    break;
                case 7:
                    line = String.valueOf(gameField[0][2] + gameField[1][1]+ gameField[2][0]);
                    break;
            }

            if (line.equals("XXX")) {
                return "X";
            }

            // For O winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(gameField).contains(
                    String.valueOf(a + 1))) {
                break;
            }
            else if (a == 8) {
                return "draw";
            }
        }


        return null;
    }



}
