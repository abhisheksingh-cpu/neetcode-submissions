class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder new_string = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)) {
                new_string.append(Character.toLowerCase(c));
            }
        }
        return new_string.toString().equals(new_string.reverse().toString());

    }
}
