class Solution {
    public int minimumRecolors(String blocks, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0,0);
        int maximum = 0;

        //using pre computation tecnique here
        for(int i =0; i< blocks.length(); i++){

            // this one is for index 0 and also it consists B
            if(i==0 && blocks.charAt(i) == 'B'){
                arr.add(i,1);
            }
            // now checking if current val is B then add 1 in previous index value and insert in current space
            if(blocks.charAt(i) == 'B' && i!=0){
                arr.add(i, arr.get(i-1) + 1);
            }

            // if it is W then current count is same as previous one
            if(blocks.charAt(i) == 'W' && i!=0) {
                arr.add(i,arr.get(i -1));
            }

            if(i >= (k-1)){
                
                // now checking if window size is as same as required K then finding the maximum B count because maximum the B count minimum the recolor
                if(i-k >= 0){
                    maximum = Math.max(maximum, arr.get(i) - arr.get(i-k));
                } else {
                    maximum =  Math.max(maximum, arr.get(i));
                }
                
            }
        }

        return k-maximum;
    }
}