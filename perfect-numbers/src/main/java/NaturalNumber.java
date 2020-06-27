import java.util.HashSet;

class NaturalNumber {
    
    private final int number;
    HashSet<Integer> divisors = new HashSet<>();


    public NaturalNumber(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        
        this.number = number;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0 && !divisors.contains(i)) {
                divisors.add(i);
                divisors.add(number / i);
            }
        }
        divisors.remove(number);
    }
    
    public Classification getClassification(){
        Integer sum = divisors.stream().reduce(Integer::sum).orElse(0);
        
        return
            (sum > number) ? Classification.ABUNDANT :
            (sum < number) ? Classification.DEFICIENT : 
            Classification.PERFECT;
    }
}
