import java.util.Arrays;
import java.util.stream.LongStream;

class LargestSeriesProductCalculator {
    private final int[] digArray;

    LargestSeriesProductCalculator(String inputNumber) {
        this.digArray = (inputNumber.length() == 0) ? new int[]{} :
                                Arrays.stream(inputNumber.split(""))
                                   .mapToInt(str -> {
                                       try {
                                           return Integer.parseInt(str);
                                       } catch (IllegalArgumentException e) {
                                           throw new IllegalArgumentException("String to search may only contain digits.");
                                       }
                                   })
                                   .toArray();
    }

    long calculateLargestProductForSeriesLength(int width) {
        if (digArray.length < width) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        } else if (width < 0){
            throw new IllegalArgumentException("Series length must be non-negative.");
        }
        return LongStream.range(0, digArray.length-width+1)
                .map(idx -> LongStream.range(idx, idx+width)
                                    .map(d -> digArray[(int)d])
                                    .reduce(1, (id, acc) -> id * acc))
                .reduce(Long::max)
                .orElse(1);
    }
}
