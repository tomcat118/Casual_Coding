public class 340Sol {
        public int lengthOfLongestSubstringKDistinct(String s, int k) {
            if(s==""){
                return 0;
            }
            if(k==0){
                return 0;
            }
     
           int result = 0;
           int left = 0;
           int distinct = 0;
           char cur;
           HashMap<Character,Integer> count = new HashMap(); //Char,Count
           for(int r = 0; r<s.length(); r++){
                
               if(!count.containsKey(s.charAt(r))||count.get(s.charAt(r))==0){
                   distinct++;
               }
               count.put(s.charAt(r), count.getOrDefault(s.charAt(r),0)+1);
                while(distinct > k){
                     count.put(s.charAt(left), count.getOrDefault(s.charAt(left),0)-1);
                    if(count.get(s.charAt(left))==0){
                        distinct--;
                    }
                       left++;
                }
                result = Math.max(result, r-left+1);
           } 
             
           return result;
        }
}
