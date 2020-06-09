public class Hamming {
    
    private char[] left;
    private char[] right;
    
    public Hamming(String leftStrand, String rightStrand) {
        int ll = leftStrand.length();
        int rl = rightStrand.length();
        if (ll != rl) {
            if(ll == 0) throw new IllegalArgumentException("left strand must not be empty.");
            if(rl == 0) throw new IllegalArgumentException("right strand must not be empty.");
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }else{
            this.left = leftStrand.toCharArray();
            this.right = rightStrand.toCharArray();
        }
    }       
    
    public int getHammingDistance() {
        int distance = 0;
        for (int i = 0; i < left.length; i++){
            if (left[i] != right[i]) distance++;
        }
        return distance;
    }
}
