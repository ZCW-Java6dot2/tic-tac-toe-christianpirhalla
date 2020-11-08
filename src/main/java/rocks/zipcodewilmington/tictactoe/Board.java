package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        return getWinner().equals("X");
    }

    public Boolean isInFavorOfO() {
        return getWinner().equals("O");
    }

    public Boolean isTie() {
        return getWinner().equals("");
    }

    public String getWinner() {
        int xs = 0;
        int os = 0;

        //Check horizontal
        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){
                if (matrix[i][j] == 'X') { xs++; }
                if (matrix[i][j] == 'O') { os++; }
            }
            //declare winner or reset
            if (xs == 3) {return "X";}
            if (os == 3) {return "O";}
            // if we make it here then no one won, reset
            xs = 0;
            os = 0;
            }

        //Check vertical
        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){
                if (matrix[j][i] == 'X') { xs++; }
                if (matrix[j][i] == 'O') { os++; }
            }
            //declare winner or reset
            if (xs == 3) {return "X";}
            if (os == 3) {return "O";}
            // if we make it here then no one won, reset
            xs = 0;
            os = 0;
        }

        //Check diagonal - top left to bottom right

        for (int i = 0, j = 0; i < 3; i++, j++) {
            if (matrix[i][j] == 'X') { xs++; }
            if (matrix[i][j] == 'O') { os++; }
        }
        if (xs == 3) {return "X";}
        if (os == 3) {return "O";}
        // if we make it here then no one won, reset
        xs = 0;
        os = 0;

        //Check diagonal - bottom left to top right
        for (int i = 2, j = 0; j < 3 ; i--, j++) {
            if (matrix[i][j] == 'X') { xs++; }
            if (matrix[i][j] == 'O') { os++; }
            System.out.println(i + " " + j);
        }
        if (xs == 3) {return "X";}
        if (os == 3) {return "O";}
        // last test, no need to reset

        // if we made it here, then no one won
        return "";
        }
    }


