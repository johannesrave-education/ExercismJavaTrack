class PhoneNumber{
    private String phoneNumber = "";

    PhoneNumber(String phoneNumber) {
        
        if (phoneNumber.matches("[a-zA-Z]")){
            throw new IllegalArgumentException("letters not permitted");
        } else if (phoneNumber.matches("[@;:_,#'!§$%&/=?`´*<>|]")){
            throw new IllegalArgumentException("punctuations not permitted");
        }
        
        String numToVerify = phoneNumber.replaceAll("[^0-9]", "");
        
        if (numToVerify.length() < 10){
            throw new IllegalArgumentException("incorrect number of digits");
        } else if (numToVerify.length() == 11 && numToVerify.charAt(0) != 1){
            throw new IllegalArgumentException("11 digits must start with 1");
        } else if (numToVerify.length() > 11){
            throw new IllegalArgumentException("more than 11 digits");
        }
        
        if (numToVerify.length() == 11) {
            numToVerify = numToVerify.substring(1);
        }
        
        if (numToVerify.charAt(0) == 0){
            throw new IllegalArgumentException("area code cannot start with zero");
        } else if (numToVerify.charAt(0) == 1){
            throw new IllegalArgumentException("area code cannot start with one");
        } else if (numToVerify.charAt(3) == 0){
            throw new IllegalArgumentException("exchange code cannot start with zero");
        } else if (numToVerify.charAt(3) == 1){
            throw new IllegalArgumentException("exchange code cannot start with one");
        }
        
        this.phoneNumber = numToVerify;
    }
    
    public String getNumber() {
        return phoneNumber;
    }
}