import java.util.List;

class ResistorColorDuo {
    private final List<String> colorCode = List.of(
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"); 
            
    int value(String[] colors) {
        return Integer.parseInt(
                String.format("%d%d",
                        colorCode.indexOf(colors[0]),
                        colorCode.indexOf(colors[1])));
    }
}
