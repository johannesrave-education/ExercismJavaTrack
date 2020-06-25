import java.util.Map;

class Scrabble {
    private final Map<Character, Integer> scores = Map.ofEntries(
             Map.entry('a',1), Map.entry('e',1), Map.entry('i',1), Map.entry('o',1),
             Map.entry('u',1), Map.entry('l',1), Map.entry('n',1), Map.entry('r',1),
             Map.entry('s',1), Map.entry('t',1), Map.entry('d',2), Map.entry('g',2),
             Map.entry('b',3), Map.entry('c',3), Map.entry('m',3), Map.entry('p',3),
             Map.entry('f',4), Map.entry('h',4), Map.entry('v',4), Map.entry('w',4),
             Map.entry('y',4), Map.entry('k',5), Map.entry('j',8), Map.entry('x',8),
             Map.entry('q',10), Map.entry('z',10)
    );
    private final String word;

    Scrabble(String word) {
        this.word = word.toLowerCase();
    }

    int getScore() {
        return word.chars()
                       .mapToObj(i -> (char) i)
                       .map(scores::get)
                       .reduce(0, Integer::sum);
    }

}
