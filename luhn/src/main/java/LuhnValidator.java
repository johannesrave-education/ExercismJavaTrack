class LuhnValidator {

    boolean isValid(String candidate) {
    
        StringBuilder sb = new StringBuilder(candidate.replaceAll("\\s+", ""));
        char[] chars = sb.reverse().toString().toCharArray();

        if(chars.length < 2) return false;
        
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            // "Cast" numerical char to int by subtracting value of the char '0' on the ASCII table
            int n = chars[i] - '0';
            // Make sure character is numerical
            if(n < 0 || n > 9) return false; 
            if((i + 1) % 2 == 0){
                n = (n * 2 > 9) ? (n * 2 - 9) : (n * 2);
            }
            sum += n;
        }

        return sum % 10 == 0; 
    }

}
