class Solution {
    public List<Integer> getRow(int rowIndex) {
        // List<List<Integer>> mainArr = new ArrayList<>();
        // List<Integer> arr = new ArrayList<>();
        // for(int i=0; i<=rowIndex; i++){
        //     arr = new ArrayList<>();
        //     for(int j=0; j<=i; j++){
        //         if(j==0 || i==j || i<=1){
        //             arr.add(1);
        //         } else {
        //             arr.add(mainArr.get(i-1).get(j-1) + mainArr.get(i-1).get(j));
        //         }
        //     }

        //     if(arr.size() > 0){
        //         mainArr.add(arr);
        //     }
        // }

        // return arr;

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        long val = 1;
        for(int i=1; i<=rowIndex; i++){
            val = val * (rowIndex - i + 1)/i;
            arr.add((int) val);
        }

        //using binomial coefficients

        return arr;

        
    }
}