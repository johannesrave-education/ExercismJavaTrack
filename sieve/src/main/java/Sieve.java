import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.HashSet;

class Sieve {
    private final int maxPrime;
    private final HashSet<Integer> candidates;
            
    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
        candidates = IntStream.rangeClosed(2, maxPrime)
                             .boxed()
                             .collect(Collectors.toCollection(HashSet::new));
    }

    List<Integer> getPrimes() {
        
        for (int i = 2; i < candidates.size(); i++) {
            int c = i;
            if (candidates.contains(c)){
                while (c < maxPrime){
                    c += i;
                    candidates.remove(c);
                }
            }
        }
        
        return new ArrayList<Integer>(candidates);
    }
}
