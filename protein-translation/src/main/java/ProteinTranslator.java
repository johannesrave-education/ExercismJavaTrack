import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

class ProteinTranslator {
    static final private Map<String, String> codons = Map.ofEntries(
            entry("AUG","Methionine"),
            entry("UUU","Phenylalanine"),
            entry("UUC","Phenylalanine"),
            entry("UUA","Leucine"),
            entry("UUG","Leucine"),
            entry("UCU","Serine"),
            entry("UCC","Serine"),
            entry("UCA","Serine"),
            entry("UCG","Serine"),
            entry("UAU","Tyrosine"),
            entry("UAC","Tyrosine"),
            entry("UGU","Cysteine"),
            entry("UGC","Cysteine"),
            entry("UGG","Tryptophan"),
            entry("UAA","STOP"),
            entry("UAG","STOP"),
            entry("UGA","STOP"));
    
    List<String> translate(String rnaSequence) {
        List<String> proteines = new ArrayList();
        
        for (int i=0; i < rnaSequence.length()-2; i=i+3) {
            if (codons.get(rnaSequence.substring(i, i+3)).equals("STOP")){
                break;
            } else {
                proteines.add(codons.get(rnaSequence.substring(i, i + 3)));
            }
            
        }
        return proteines;
    }
}
