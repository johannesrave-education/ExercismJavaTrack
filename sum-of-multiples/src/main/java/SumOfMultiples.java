class SumOfMultiples {
    
    private int number;
    private final int[] SET;

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        SET = set;
    }

    int getSum() {
        int accumulator = 0;
        while ((number-1) > 0){
            for (int divisor: SET){
                if ((number-1) % divisor == 0) accumulator += number-1;
            }
            number--;
        }
        return accumulator;
    }
}
