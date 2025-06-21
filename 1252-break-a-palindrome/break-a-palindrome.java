class Solution {
    public String breakPalindrome(String palindrome) {
        
        char[] charArr = palindrome.toCharArray();

        if(charArr.length < 2){
            return "";
        }

        for(int i=0; i<charArr.length/2;i++){
            if(charArr[i] != 'a'){
                charArr[i] = 'a';
                return String.valueOf(charArr);
            }
        }

        charArr[charArr.length - 1] = 'b';
        return String.valueOf(charArr);
    }
}