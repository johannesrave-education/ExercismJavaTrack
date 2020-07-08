import java.math.BigInteger;

class DifferenceOfSquaresCalculator {

    public static final int SQUARE_OF_SUMS_MAX = 304;
    public static final int SUM_OF_SQUARES_MAX = 1024;
    public static final int DIFFERENCE_OF_SQUARES_MAX = 305;

    public static int computeSquareOfSumTo(int n) {
        if (n > SQUARE_OF_SUMS_MAX) {
            System.out.println("An overflow occured when computing for " + n);
            System.out.println("Please use computeSquareOfSumTo(BigInteger b) instead.");
            return -1;
        }
        return ((n * (n + 1)) / 2) * ((n * (n + 1)) / 2);
    }

    public static BigInteger computeSquareOfSumTo(BigInteger b) {
        return b.multiply(b.add(BI(1))).divide(BI(2)).multiply(b.multiply(b.add(BI(1))).divide(BI(2)));
    }

    public static int computeSumOfSquaresTo(int n) {
        if (n > SUM_OF_SQUARES_MAX) {
            System.out.println("An overflow occured when computing for " + n);
            System.out.println("Please use computeSumOfSquaresTo(BigInteger b) instead.");
            return -1;
        }
        return (n*(n+1)*(2*n+1))/6;
    }

    public static BigInteger computeSumOfSquaresTo(BigInteger b) {
        return b.multiply(b.add(BI(1)).multiply(BI(2).multiply(b.add(BI(1))))).divide(BI(6));
    }

    public static int computeDifferenceOfSquares(int n) {
        if (n > DIFFERENCE_OF_SQUARES_MAX) {
            System.out.println("An overflow occured when computing for " + n);
            System.out.println("Please use computeDifferenceOfSquares(BigInteger b) instead.");
            return -1;
        }
        return (computeSquareOfSumTo(n)-computeSumOfSquaresTo(n));
    }
    
    public static BigInteger computeDifferenceOfSquares(BigInteger b) {
        return (computeSquareOfSumTo(b).subtract(computeSumOfSquaresTo(b)));
    }
    
    
    // Shortened BigInteger.valueOf(n) to pseudoconstructor for better readability of formulae
    public static BigInteger BI(int n) {
        return BigInteger.valueOf(n);
    }
    // Just a utility class to find the allowed maximum for each of the methods. 
    // This could probably be improved but worked alright.
    static void findMaxima(){
        System.out.println("\ncomputeSquareOfSumTo(i)");
        int lastResult = 1;
        int i = 1;
        while (lastResult > 0){
            i++;
            lastResult = computeSquareOfSumTo(i);
        }
        System.out.println("An overflow happened at " + i);
        System.out.println(computeSquareOfSumTo(i-1));
        System.out.println(computeSquareOfSumTo(i));
        System.out.println(computeSquareOfSumTo(i+1));

        System.out.println("\ncomputeSumOfSquaresTo(i)");
        lastResult = 1;
        i = 1;
        while (lastResult > 0){
            i++;
            lastResult = computeSumOfSquaresTo(i);
        }
        System.out.println("An overflow happened at " + i);
        System.out.println(computeSumOfSquaresTo(i-1));
        System.out.println(computeSumOfSquaresTo(i));
        System.out.println(computeSumOfSquaresTo(i+1));


        System.out.println("\ncomputeDifferenceOfSquares(i)");
        lastResult = 1;
        i = 1;
        while (lastResult > 0){
            i++;
            lastResult = computeDifferenceOfSquares(i);
        }
        System.out.println("An overflow happened at " + i);
        System.out.println(computeDifferenceOfSquares(i-1));
        System.out.println(computeDifferenceOfSquares(i));
        System.out.println(computeDifferenceOfSquares(i+1));
    }
}
