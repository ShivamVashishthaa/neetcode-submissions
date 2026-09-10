class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0) return false;
        Set<Integer> set = new HashSet<>();
        for (Integer integer : nums)
            if (!set.add(integer)) {
                return true;
            }
        return false;
        }
    }
