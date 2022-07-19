class ReplacingOnes {
  public static int findLength(int[] arr, int k) {
    // TODO: Write your code here
    int maxRepeatedOne = 0, maxLength = 0, windowStart = 0;
    for(int windowEnd =0; windowEnd < arr.length; windowEnd++){
        if(arr[windowEnd] == 1){
          maxRepeatedOne++;
        }
        // check if window contains more than k 0's 
        while(windowEnd - windowStart +1 - maxRepeatedOne >k){
          if(arr[windowStart] ==1){
            maxRepeatedOne--;
          }

          windowStart++;
        }

        maxLength = Math.max(maxLength, windowEnd-windowStart+1);
    }

    return maxLength;
  }
  public static void main(String[] args) {
    System.out.println(ReplacingOnes.findLength(new int[] { 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1 }, 2));
    System.out.println(ReplacingOnes.findLength(new int[] { 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1 }, 3));
  }
}
