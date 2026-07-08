class Solution {
    public int trap(int[] height) {
        if(height.length == 0 || height == null) return 0;

        int res = 0;

        for(int i = 0; i < height.length; i++) {
            int leftmax = height[i];
            int rightmax = height[i];
            for(int j = 0; j < i; j++) {
                leftmax = Math.max(leftmax, height[j]);
            }
            for(int j = i+1; j < height.length; j++) {
                rightmax = Math.max(rightmax, height[j]);
            }

            res += Math.min(leftmax, rightmax) - height[i];

        }

        return res;
    }
}
