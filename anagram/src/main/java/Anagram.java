import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram{
    private String base;
    
    public Anagram(String in){
        this.base = in;
    }
    
    public List match(List<String> candidates) {
        char[] chars = base.toLowerCase().toCharArray();
        Arrays.sort(chars);
        
        List result = new ArrayList();
        
        for (String candidate : candidates){
            if (!base.toLowerCase().equals(candidate.toLowerCase())){
                char[] charsToMatch = candidate.toLowerCase().toCharArray();
                Arrays.sort(charsToMatch);
                if (Arrays.equals(chars, charsToMatch)) result.add(candidate);
            }
        }
        return result;
    }
}