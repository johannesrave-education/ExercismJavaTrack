class CollatzCalculator {

    int computeStepCount(int n) {
        if (n < 1){
            throw new IllegalArgumentException("Only natural numbers are allowed");
        }
        if (n == 1){
            return 0;
        }
        return (n % 2 == 0) ? computeStepCount(n/2) + 1 : computeStepCount((3*n)+1) + 1;
    }

}
