class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result [] = new int [2];
        List<Integer> data = new ArrayList<>();
        for(int i : nums){
            data.add(i);
        }
        for(int i = 0 ;i<nums.length;i++){
            if(data.contains(target - nums[i]) && data.indexOf(target - nums[i])!=i)
            {
                result[0] = i;
                result[1] = data.indexOf(target - nums[i]);
            }
        }
        return result;
    }
}