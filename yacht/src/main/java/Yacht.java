import java.util.Arrays;

class Yacht {

    private final int[] dice;
    private final YachtCategory cat;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice = dice;
        this.cat = yachtCategory;
    }

    int score() {
        switch (cat){
            case ONES: return sumOfNum(1);
            case TWOS: return sumOfNum(2);
            case THREES: return sumOfNum(3);
            case FOURS: return sumOfNum(4);
            case FIVES: return sumOfNum(5);
            case SIXES: return sumOfNum(6);
            case FULL_HOUSE: return fullHouse();
            case FOUR_OF_A_KIND: return fourOfAKind();
            case LITTLE_STRAIGHT:
            case BIG_STRAIGHT: return straight();
            case CHOICE: return choice();
            case YACHT: return yacht();
            default: return 0; 
        }
    }

    private int sumOfNum(int i) {
        int sum = 0;
        for (int die : dice){
            if (i == die) sum += i;
        }
        return sum;
    }
    
    private int fullHouse() {
        int a = dice[0];
        int b = 0;
        int aDice = 0;
        int bDice = 0;
        for (int die : dice){
            if (die == a) {
                ++aDice;
            } else if (die == b) {
                ++bDice;
            } else if ((b == 0)) {
                b = die;
                ++bDice;
            }            
        }
        if ((aDice == 3 && bDice == 2) || (aDice == 2 && bDice == 3)){
            return a*aDice + b*bDice;
        }
        return 0;
    }
    
    private int fourOfAKind() {
        int a = dice[0];
        int b = 0;
        int aDice = 0;
        int bDice = 0;
        for (int die : dice){
            if (die == a) {
                ++aDice;
            } else if (die == b) {
                ++bDice;
            } else if ((b == 0)) {
                b = die;
                ++bDice;
            }
        }
        if (aDice >= 4){
            return a*4;
        } else if (bDice >= 4){
            return b*4;
        }
        return 0;
    }

    private int choice() {
        return Arrays.stream(dice).sum();
    }

    private int straight() {
        int[] straight = (cat == YachtCategory.LITTLE_STRAIGHT) ?
                                 new int[]{1, 2, 3, 4, 5} :
                                 new int[]{2, 3, 4, 5, 6};
        Arrays.sort(dice);
        if (Arrays.equals(dice, straight)) return 30;
        return 0;
    }
    
    private int yacht() {
        int a = dice[0];
        int aDice = 0;
        for (int die : dice){
            if (die == a) {
                ++aDice;
            }
        }
        if (aDice == 5){
            return 50;
        }
        return 0;
    }
}
