import java.util.HashSet;

class NaturalNumber {
    
    private final Classification c;
    HashSet<Integer> divisors = new HashSet<>();


    public NaturalNumber(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0 && !divisors.contains(i)) {
                divisors.add(i);
                divisors.add(number / i);
            }
        }
        divisors.remove(number);
        
        Integer sum = divisors.stream().reduce(Integer::sum).orElse(0);
        if (sum > number) c = Classification.ABUNDANT;
        else if (sum < number) c = Classification.DEFICIENT;
        else c = Classification.PERFECT;
    }
    
    public Classification getClassification(){
        return c;
    }
}
