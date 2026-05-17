class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1, max = 0, cmax = 0;
        while(l < r){
            cmax = (r-l)*Math.min(heights[l], heights[r]);
            max = Math.max(max, cmax);
            if(heights[l]<heights[r])
                l++;
            else
                r--;
        }
        return max;
    }
}
