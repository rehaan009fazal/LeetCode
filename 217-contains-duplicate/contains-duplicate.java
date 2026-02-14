class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> checkDup = new HashSet<>();
        
        for(int i : nums){
            if(checkDup.contains(i))
            return true;

            checkDup.add(i);
        }
            return false;
    }
}