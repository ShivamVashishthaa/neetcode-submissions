class Solution {
     // TC -> O(n) Best Solution
    // SC: O(n) — map + buckets
    public int[] topKFrequent(int[] nums, int k) {
      
        // Step 1: frequency count
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) freq.put(n, freq.getOrDefault(n, 0) + 1);

        // Step 2: create buckets (index = frequency)
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int num : freq.keySet()) {
            int f = freq.get(num);
            if (bucket[f] == null) bucket[f] = new ArrayList<>();
            bucket[f].add(num);
        }

        // Step 3: Traverse from highest frequency and collect top k
        int[] res = new int[k];
        int idx = 0;
        for (int i = bucket.length - 1; i >= 0 && idx < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    res[idx++] = num;
                    if (idx == k) break;
                }
            }
        }
        return res;
    }
}
