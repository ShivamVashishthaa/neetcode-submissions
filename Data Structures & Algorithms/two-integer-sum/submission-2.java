class Solution {
    public int[] twoSum(int[] nums, int target) {
         if (nums.length == 0) return new int[]{};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int firstIndex = target - nums[i];
            if (map.containsKey(firstIndex))
                return new int[]{map.get(firstIndex), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
