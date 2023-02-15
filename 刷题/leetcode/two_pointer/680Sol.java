public class 680Sol {
   
        public boolean validPalindrome(String s) {
            boolean checked = false;
            int left = 0;
            int right = s.length()-1;
          
            while(left<=right){
                if(s.charAt(left) != s.charAt(right)){
                  return isPalindrome(left, right-1, s)|| isPalindrome(left+1, right, s);
                }
                left++;
                right--;
            }
            return true;
        }
        public boolean isPalindrome(int start, int end, String s) {
          
            while(start<=end){
                if(s.charAt(start) != s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    
}
