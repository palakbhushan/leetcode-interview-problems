class Solution {
    public String reverseWords(String s) {
        Stack<String> stk = new Stack<>(); 
        char[] arr = s.toCharArray();

        StringBuilder temp = new StringBuilder();
        for(int i=0;i<arr.length; i++){
            if(arr[i] == ' '){
                if(temp.length()>0){
                    stk.push(temp.toString());
                    temp= new StringBuilder();
                }
            } else{
                temp.append(arr[i]);
            }
            
        }

        if(temp.length() > 0){
            stk.push(temp.toString());
        }

        StringBuilder result = new StringBuilder();
        while(!stk.isEmpty()){
            result.append(stk.pop());
            if(!stk.isEmpty()){
                result.append(" ");
            }
        }

        return result.toString();
    }
}