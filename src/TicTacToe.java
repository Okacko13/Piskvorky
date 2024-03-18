public class TicTacToe {

    private char[][] gameField = new char[3][3];

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


}
