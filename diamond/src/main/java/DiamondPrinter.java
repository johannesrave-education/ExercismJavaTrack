import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {
    
    public static List<String> printToList(char a) {
        int dim = (a-'A')*2+1;
        char[][] board = new char [dim][dim];
        
        for (char letter = 'A'; letter < (dim/2+1)+'A'; letter++) {
            int row = letter-'A';
            for (int col = 0; col < dim/2+1; col++) {
                if(col == dim/2-row){
                    board[row][col] = letter;
                    board[row][dim-col-1] = letter;
                    board[dim-row-1][col] = letter;
                    board[dim-row-1][dim-col-1] = letter;
                } else {
                    board[row][col] = ' ';
                    board[row][dim-col-1] = ' ';
                    board[dim-row-1][col] = ' ';
                    board[dim-row-1][dim-col-1] = ' ';
                }
            }
        }
        
        ArrayList<String> diamond = new ArrayList();
        for (char[] row:board) {
            diamond.add(new String(row));
        }
        
        return diamond;
    }
}
