public class TicTacToe {

    private char[][] gameField = new char[3][3];

    public void addXO(int x, int y, char XorO){
        gameField[x][y] = XorO;
    }
    public void printBoard(){
        for(int x =0; x< gameField.length;x++){
            for (int y = 0; y< gameField.length;y++){
                gameField[x][y]='-';
            }
        }
        for(int i = 0; i< gameField.length; i++){
            System.out.println("| ");
            for(int j = 0; j< gameField.length;j++){
                System.out.println(gameField[i][j]+" | ");
            }
        }


    }





}
