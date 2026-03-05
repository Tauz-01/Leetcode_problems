class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())
            return false;
        int left = 0 ; 
        int[]  s = new int[26];
        int[] windowcount = new int[26];
        
        for(char c:s1.toCharArray()) {
            s[c-'a']++;
        }

        for(int right=0 ; right <s2.length() ; right++) {
            windowcount[s2.charAt(right)-'a']++;
            if(right-left+1 == s1.length()) {
                if(Arrays.equals(s,windowcount))
                   return true;
                windowcount[s2.charAt(left)-'a']--;
                left++;  
            }

        }
       return false;
    }
}