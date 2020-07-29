import java.util.regex.Pattern;

class Bob{
    public Bob(){
    }
    
    public String hey(String phrase){
        String shouting = "([^a-z]*[A-Z][A-Z]+[^a-z]*)";
        String question = ".*\\?\\s*$";
        String silence = "^\\s*$";
        
        if (phrase.matches(shouting) && phrase.matches(question)){
            return "Calm down, I know what I'm doing!";
        } else if (phrase.matches(question)){
            return "Sure.";
        } else if (phrase.matches(shouting)){
            return "Whoa, chill out!";
        } else if (phrase.matches(silence)){
            return "Fine. Be that way!";
        } else {
            return "Whatever.";
        }
    }
}