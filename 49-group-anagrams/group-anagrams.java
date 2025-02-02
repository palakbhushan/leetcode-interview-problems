class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> track = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();;
        int n = strs.length;
        for(int i=0; i<n; i++){

            char[] temp = strs[i].toCharArray(); 
            Arrays.sort(temp);               
            String sortedStr = new String(temp);
            track.putIfAbsent(sortedStr, new ArrayList<>());
            track.get(sortedStr).add(strs[i]);
        }
        ans.addAll(track.values());
        return ans;
    }
}