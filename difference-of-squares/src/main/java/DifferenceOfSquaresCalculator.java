import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = IntStream.range(0, input+1).reduce(0, (a, b) -> a+b);
        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
        return IntStream.range(0, input+1).reduce(0, (a, b) -> a+(b*b));
    }

    int computeDifferenceOfSquares(int input) {
        return (computeSquareOfSumTo(input)-computeSumOfSquaresTo(input));
    }

}
