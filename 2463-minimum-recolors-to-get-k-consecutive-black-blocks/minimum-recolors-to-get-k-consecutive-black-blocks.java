class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minWhiteBalls = 0;
        int minWhiteBallsInWindow = 0;

        for(int i=0; i<k; i++){
            if(blocks.charAt(i) == 'W') {
                minWhiteBalls++; 
                minWhiteBallsInWindow++;
                }
        }

        for(int i=k; i< blocks.length(); i++){

            if(blocks.charAt(i - k) == 'W'){
                minWhiteBallsInWindow--;
            }

            if(blocks.charAt(i) == 'W'){
                minWhiteBallsInWindow++;
            }
            
            minWhiteBalls = Math.min(minWhiteBalls, minWhiteBallsInWindow);
        }

        return minWhiteBalls;
    }
}