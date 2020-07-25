import java.util.Arrays;

class Matrix {
    private int[][] matrix;

    Matrix(String matrixAsString) {
        this.matrix = Arrays.stream(matrixAsString.split("\n"))
                               .map(x -> Arrays.stream(x.split(" "))
                                                 .mapToInt(Integer::parseInt)
                                                 .toArray())
                               .toArray(int[][]::new);
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber-1];
    }

    int[] getColumn(int columnNumber) {
        return Arrays.stream(matrix)
                       .mapToInt(x -> x[columnNumber-1])
                       .toArray();
    }
}
