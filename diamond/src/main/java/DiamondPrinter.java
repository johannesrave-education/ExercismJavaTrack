import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DiamondPrinter {
    
    public static List<String> printToList(char a) {
        int dim = (a-65)*2+1;
        char[][] board = new char [dim][dim];
        for (char[] row:board) Arrays.fill(row,' ');
        
        for (int row = 0; row < dim/2+1; row++) {
            char letter = (char)(row+65);
            for (int col = 0; col < dim/2+1; col++) {
                if(col == dim/2-row){
                    board[row][col] = letter;
                    board[row][dim-col-1] = letter;
                    board[dim-row-1][col] = letter;
                    board[dim-row-1][dim-col-1] = letter;
                }
            }
        }
        
        ArrayList<String> diamond = new ArrayList();
        for (char[] row:board) {
            StringBuilder sb = new StringBuilder();
            for (char c:row) {
                sb.append(c);
            }
            diamond.add(sb.toString());
        }
        
        return diamond;
    }

}
