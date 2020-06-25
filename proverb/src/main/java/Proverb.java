class Proverb {

    static private final String line = "For want of a %s the %s was lost.\n";
    static private final String ending = "And all for the want of a %s.";
    static private String proverb;
    
    Proverb(String[] words) {

        StringBuilder proverb = new StringBuilder("");
        if(words.length != 0) {
            for (int i = 0; i < words.length - 1; i++) {
                proverb.append(String.format(line, words[i], words[i+1]));
            }
            proverb.append(String.format(ending, words[0]));
        }
        this.proverb = proverb.toString();
    }

    String recite() {
        return proverb;
    }
}
