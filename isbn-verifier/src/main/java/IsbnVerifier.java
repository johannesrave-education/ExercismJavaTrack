class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        
        String isbn = stringToVerify.replaceAll("[^0-9X]","");
        if(isbn.length()!=10 || (isbn.contains("X") && isbn.charAt(9)!='X')) return false;
        
        int checksum = 0;
        for (int i = 0; i < 10; i++) {
            if (isbn.charAt(i)=='X') checksum += 10;
            else checksum += (isbn.charAt(i)-48) * (10-i);
        }
        return checksum % 11 == 0;
    }
}
