import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PigLatinTranslator{
    
    public static String translate(String input){
        StringJoiner result = new StringJoiner(" ");
        for (String split: input.split(" ")) {
            StringBuilder word = new StringBuilder(split);
            Matcher vowel = Pattern.compile("^([aeiou]|yt|xr).*").matcher(word);
            Matcher cons = Pattern.compile("^([^aeiou]+)y.*|^(thr?|s?ch|[^aeiou]?qu|[^aeiou]).*").matcher(word);

            if (vowel.matches()) {
            } else if (cons.matches()) {
                int g = 1;
                if (cons.group(1) == null) g = 2;
                word.append(cons.group(g)).delete(cons.start(g), cons.end(g));
            }
            word.append("ay");
            result.add(word);
        }
        
        return result.toString();
    }
}