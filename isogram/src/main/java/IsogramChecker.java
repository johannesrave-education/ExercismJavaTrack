import java.util.HashSet;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        String cleanPhrase = phrase.replaceAll("\\W","");

        HashSet hs = new HashSet();
        for(char letter:cleanPhrase.toLowerCase().toCharArray()){
            hs.add(letter);
        }
        
        return hs.size() == cleanPhrase.length();
    }

}
