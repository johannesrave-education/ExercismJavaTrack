import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if(square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        // Each bitwise leftshift will double the number.
        return BigInteger.ONE.shiftLeft(square-1);
    }

    BigInteger grainsOnBoard() {
        // The sum of all preceding squares is one less than the current square
        return BigInteger.ONE.shiftLeft(64).subtract(BigInteger.ONE);
    }
}
