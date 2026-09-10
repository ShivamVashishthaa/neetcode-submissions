class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // TC -> O(n log n), due to sorting 
         if (nums.length == 0) return new int[]{};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer integer : nums) map.put(integer, map.getOrDefault(integer, 0) + 1);

        List<Integer> integers = new ArrayList<>(map.keySet());

        integers.sort((a, b) -> map.get(b) - map.get(a));

        int[] res = new int[k];
        for (int i = 0; i < res.length; i++) res[i] = integers.get(i);

        return res;
    }
}
