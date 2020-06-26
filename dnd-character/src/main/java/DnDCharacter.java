import java.util.stream.IntStream;

class DnDCharacter {
    
    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private int hitpoints;

    public DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
        this.hitpoints = 10 + modifier(constitution);
    }

    int ability() {
        return IntStream.range(0,4).map(i -> throwDie(6)).sorted().skip(0).sum();
    }

    int modifier(int input) {
        int x = (int) Math.floor((input - 10d) / 2d);
        return (int) Math.floor((input - 10d) / 2d);
    }
    
    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }
    
    int throwDie(int sides){
        System.out.println("Rolled a "+((int) (Math.random() * sides) + 1));
        return (int) (Math.random() * sides) + 1;
        
    }
}
