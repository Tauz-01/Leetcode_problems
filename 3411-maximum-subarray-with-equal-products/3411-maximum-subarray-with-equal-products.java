class Solution {
    public int maxLength(int[] nums) {
          int maxlength = 0 ;
        for(int i = 0 ;  i <nums.length ; i++) {
       
        long product = 1 ;
        long gcdValue = nums[i];
        long  lcmValue = nums[i];
        for(int j = i ; j < nums.length ; j++) {
            product *= nums[j];
            gcdValue = gcd(gcdValue,nums[j]);
            lcmValue = lcm(lcmValue,nums[j]);

            if(product == gcdValue*lcmValue)
               maxlength = Math.max(maxlength,j-i+1);
        }

        }
        return maxlength;
    }
    public long gcd(long a, long b){
        while(b != 0 ) {
            long temp = b ;
                     b = a % b ; 
                     a = temp;
        }
        return a;
    }
    public long lcm(long a ,long b) {
        return (a /gcd(a,b))*b;
    }
}