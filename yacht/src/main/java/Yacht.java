import java.util.Arrays;

class Yacht {

    private final int[] dice;
    private final YachtCategory category;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice = dice;
        this.category = yachtCategory;
    }

    int score() {
        switch (category){
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
            case CHOICE: return summed();
            case YACHT: return yacht();
            default: return 0; 
        }
    }

    private int sumOfNum(int i) {
        return occurs(i) * i;
    }
    
    private int fullHouse() {
        int[] occ = new int[6];
        for (int i = 1; i <= 6; i++) {
            occ[i-1] = occurs(i);
        }
        Arrays.sort(occ);
        return (occ[5] == 3 && occ[4] == 2) ? summed() : 0;
    }
    
    private int fourOfAKind() {
        for (int i = 1; i <= 6; i++) {
            if (occurs(i) >= 4){
                return 4 * i;
            }
        }
        return 0;
    }

    private int summed() {
        return Arrays.stream(dice).sum();
    }

    private int straight() {
        int[] straight = (category == YachtCategory.LITTLE_STRAIGHT) ?
                                 new int[]{1, 2, 3, 4, 5} :
                                 new int[]{2, 3, 4, 5, 6};
        Arrays.sort(dice);
        return (Arrays.equals(dice, straight)) ? 30 : 0;
    }
    
    private int yacht() {
        return (occurs(dice[0]) == 5) ? 50 : 0;
    }
    
    private int occurs(int die){
        return (int) Arrays.stream(dice).filter(o -> o == die).count();
    }
}
