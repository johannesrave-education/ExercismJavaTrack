import java.util.Objects;

public class Twofer {
    
    public String twofer(String name) {
        
        return Objects.nonNull(name)?"One for "+name+", one for me.":"One for you, one for me.";
    }
}
