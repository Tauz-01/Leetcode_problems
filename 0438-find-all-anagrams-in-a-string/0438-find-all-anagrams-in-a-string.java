class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(p.length()>s.length())
          return result;
        int left = 0 ; 
        int[] pcount = new int[26];
        int[] windowsize = new int[26];
        for(char x:p.toCharArray()) {
            pcount[x-'a']++;
        }
        for(int right = 0 ; right<s.length() ; right++) {
            windowsize[s.charAt(right)-'a']++;
            if(right-left+1 == p.length()){
               if(Arrays.equals(pcount,windowsize))
                  result.add(left);
                windowsize[s.charAt(left)-'a']--;
                left++;  
            }
        }

        return result;
    }
}