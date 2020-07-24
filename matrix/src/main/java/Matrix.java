import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Matrix {
    List<String[]> matrix;

    Matrix(String matrixAsString) {
        this.matrix = Arrays.stream(matrixAsString.split("\n"))
                               .map(x -> x.split(" "))
                               .collect(Collectors.toList());

        
        for (String[] arr : matrix){
            for (String str : arr){
                System.out.println(str);
            }
        }

        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int[] getRow(int rowNumber) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int[] getColumn(int columnNumber) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
