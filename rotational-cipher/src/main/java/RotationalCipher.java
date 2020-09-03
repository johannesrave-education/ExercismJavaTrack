import java.util.stream.Collectors;

class RotationalCipher {

    private final int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey; 
    }

    String rotate(String data) { 
        return data.chars()
                       .map(letter -> safelyShiftLetter(letter, 'a', 'z'))
                       .map(letter -> safelyShiftLetter(letter, 'A', 'Z'))
                       .mapToObj(c-> (char) c)
                       .map(Object::toString)
                       .collect(Collectors.joining());
    }

    private int safelyShiftLetter(int letter, char from, char to) {
        if (from <= letter && letter <= to) {
            letter -= (letter + shiftKey > to) ? 26 : 0; 
            letter += shiftKey;
        }
        return letter;
    }
}
