class PrimeCalculator {

    int nth(int nth) {
        if (nth == 0) throw new IllegalArgumentException();
        int num = 1;
        while (nth >= 0) {
            if(isPrime(num)){
               nth--; 
            }
            num++;
        }
        return num-1;
    }

    public boolean isPrime(int num) {
        int i = 2;
        while (i < num / 2 + 1){
            if (num % i == 0) return false;
            i++;
        }
        return true;
    }

}
