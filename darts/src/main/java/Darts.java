class Darts {
    private final double distance;

    Darts(double x, double y) {
        this.distance = Math.sqrt(x*x + y*y);
    }

    int score() {
        return 
        (distance <  1) ? 10 :
        (distance <  5) ?  5 :
        (distance < 10) ?  1 :
        0;
    }
}
