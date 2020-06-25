class ReverseString {

    String reverse(String inputString) {
        StringBuilder sb = new StringBuilder();
        int len = inputString.length();
        for (int i = 0; i < len; i++) {
            sb.append(inputString.charAt(len-1-i));
        }
        return sb.toString();
    }
  
}
