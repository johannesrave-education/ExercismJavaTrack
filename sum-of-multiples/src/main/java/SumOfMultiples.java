import java.util.HashSet;

class SumOfMultiples {
    
    private final int NUMBER;
    private final int[] SET;
    private final HashSet<Integer> multiples = new HashSet<Integer>();

    SumOfMultiples(int number, int[] set) {
        this.NUMBER = number;
        this.SET = set;
    }

    public int getSum() {
        int candidate = NUMBER - 1;
        while ((candidate) > 0){
            for (int divisor: SET){
                if (divisor == 0){
                    continue;
                }
                if ((candidate) % divisor == 0) {
                    multiples.add(candidate);
                }
            }
            candidate--;
        }

        System.out.println(multiples);
        return multiples.stream().reduce(0, Integer::sum);
    }
}
