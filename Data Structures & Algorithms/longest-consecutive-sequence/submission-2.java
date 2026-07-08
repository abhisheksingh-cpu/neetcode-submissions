class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> result = new HashSet<>();
        for(int num : nums) {
            result.add(num);
        }
        int max_streak = 0;
        for(int num : result) {
            if(!result.contains(num - 1)) {
                int length = 1;
                while(result.contains(num + length)){
                    length += 1;
                }
                max_streak = Math.max(length, max_streak);
        }
        
    }
      return max_streak;
}


}
