import java.util.HashMap;

class NucleotideCounter{
    private final String nucleotides;
    private final HashMap<Character, Integer> counts = new HashMap<Character, Integer>(); 
    
    public NucleotideCounter(String nucleotides) {
        if (nucleotides.matches(".*[^ACGT].*")){
            throw new IllegalArgumentException();
        }
        this.nucleotides = nucleotides;
        counts.put('A', 0);
        counts.put('C', 0);
        counts.put('G', 0);
        counts.put('T', 0);
    }

    public HashMap nucleotideCounts(){
        nucleotides.chars().forEach(c -> counts.put((char)c, counts.get((char)c)+1));
        return counts;
    }
}