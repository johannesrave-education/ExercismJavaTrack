import java.util.HashSet;

class PrimeCalculator {
    
    HashSet<Integer> knownPrimes = new HashSet<>();

    int nth(int nth) {
        if (nth < 1) throw new IllegalArgumentException();
        
        // Starting at 2 to avoid infinite loop. 
        int num = 2;
        nth--;
        while (nth >= 0) {
            if(isPrime(num++)){
               nth--; 
            }
        }
        return num-1;
    }

    public boolean isPrime(int num) {
        for (int prime : knownPrimes){
            if (num % prime == 0) return false;
        }
        knownPrimes.add(num);
        return true;
    }
}
