class ResistorColor {
    static private final String[] COLORS = {
            "black", 
            "brown", 
            "red", 
            "orange", 
            "yellow", 
            "green", 
            "blue", 
            "violet", 
            "grey", 
            "white"};
    
    int colorCode(String color) {
        for (int i = 0; i < COLORS.length; i++) {
            if (color.equals(COLORS[i])) return i;
        }
        return -1;
    }

    String[] colors() {
        return this.COLORS;
    }
}
