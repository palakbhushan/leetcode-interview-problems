class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> subArr = new ArrayList<>();

            for(int j=0; j<=i; j++){
                if(j==0 || i <= 1 || j==i){
                    subArr.add(1);
                }else{
                    subArr.add( arr.get(i-1).get(j-1) + arr.get(i-1).get(j) );
                }
                
            }
            
            if(subArr.size() > 0){
                arr.add(subArr);
            }
            
            
        }

        return arr;
    }
}

// 121