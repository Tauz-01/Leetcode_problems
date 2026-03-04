class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList();
        if(s.length()<p.length()) return result;
        
        int[] pcount = new int[26];
        int[] windowcount = new int[26];
 
        int left = 0 ;
        for(char c:p.toCharArray()) {
            pcount[c-'a']++;
        }

        for(int right = 0 ; right<s.length() ; right++) {
            windowcount[s.charAt(right)-'a']++;
            if(right-left+1 == p.length()) {
                if(Arrays.equals(pcount,windowcount))
                   result.add(left);
                 windowcount[s.charAt(left)-'a']--;
                 left++;   
            }
           
        }

        return result;
        
    }
}