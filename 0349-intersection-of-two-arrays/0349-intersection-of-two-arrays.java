class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map = new HashSet<>();
        HashSet<Integer> resultset = new HashSet<>();

        for(int num : nums1) 
           map.add(num);

        for(int num:nums2){
            if(map.contains(num))
               resultset.add(num);
        }

        int[] result = new int[resultset.size()];
            int i = 0 ;
            for(int num : resultset)
              result[i++] = num;

        return result;      
        
        
    }
}