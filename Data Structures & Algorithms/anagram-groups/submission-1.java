class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        HashMap<String, List<String>> m = new HashMap<>();
        for(int i = 0 ; i < strs.length ; i++){

            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!m.containsKey(key)) {
    m.put(key, new ArrayList<>());
}
           m.get(key).add(strs[i]);

        }

        return new ArrayList<>(m.values());
    }
}
