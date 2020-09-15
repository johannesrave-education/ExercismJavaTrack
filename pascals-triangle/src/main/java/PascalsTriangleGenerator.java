class PascalsTriangleGenerator{
    public static int[][] generateTriangle(int height){
        
        int[][] triangle = new int[height][];
        for (int row = 0; row < triangle.length; row++) {
            triangle[row] = new int[row + 1];
            for (int col = 0; col < triangle[row].length; col++) {
                triangle[row][col] = (col == 0 || col == row) ? 1
                                             : triangle[row-1][col-1] + triangle[row-1][col];
            }
        }

        return triangle;
    }
}