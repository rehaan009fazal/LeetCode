class Solution {
    public int[] getSneakyNumbers(int[] nums) {
          boolean[] seen = new boolean[nums.length];
        List<Integer> temp = new ArrayList<>();

        for (int x : nums) {
            if (seen[x]) {          // already seen → duplicate
                temp.add(x);
            } else {
                seen[x] = true;     // mark as seen
            }
        }

        int[] ans = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            ans[i] = temp.get(i);
        }

        return ans;
    }
}