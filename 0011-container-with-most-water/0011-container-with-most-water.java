class Solution {
    public int maxArea(int[] height) {
      int maxwater = 0 ;
      int left = 0 ;
      int right = height.length-1;
      while(left<right){
        int width = right-left;
        int ht = Math.min(height[left],height[right]);
        int currentwater = ht * width ;
        maxwater = Math.max(currentwater , maxwater);
        if(height[left]>height[right])
          right--;
        else 
          left++;  
      }
      return maxwater;
    }
}