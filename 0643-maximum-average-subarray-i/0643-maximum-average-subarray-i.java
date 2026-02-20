class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 0) 
         return nums[0];
        double sum = 0 ;
        for(int i = 0 ; i< k ; i++) 
           sum+=nums[i];
        double maxum = sum ;    
        for(int j = k ; j<nums.length ; j++) {
            sum+=nums[j]-nums[j-k];
            maxum = Math.max(maxum,sum);
        }  
        return maxum/k;
    }
}