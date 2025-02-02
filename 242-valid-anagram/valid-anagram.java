class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] track = new int[26];
        
        for(char i : s.toCharArray()){
            track[i - 'a']++;
        }

        for(char i : t.toCharArray()){
            if(track[i - 'a'] > 0) {
                track[i - 'a']--;
            } else {
                return false;
            }
        }

        return true;
    }
}