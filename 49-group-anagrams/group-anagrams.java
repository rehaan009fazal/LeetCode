class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,ArrayList<String>>  mapanagram = new HashMap<>();

        for(int i = 0;i<strs.length;i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String newStr =new String(charArray);
            if(!mapanagram.containsKey(newStr)){
                mapanagram.put(newStr,new ArrayList<>());
            }
                mapanagram.get(newStr).add(strs[i]);
        }
        return new ArrayList(mapanagram.values());
    }
}