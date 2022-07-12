class PairWithTargetSum {
//Given an array of sorted numbers and a target sum,
// find a pair in the array whose sum is equal to the given target.
/*
 * 
    Input: [1, 2, 3, 4, 6], target=6
    Output: [1, 3]
    Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6

    Input: [2, 5, 9, 11], target=11
    Output: [0, 2]
    Explanation: The numbers at index 0 and 2 add up to 11: 2+9=11
    * 
 */
    public static int[] search(int[] arr, int targetSum) {
      // TODO: Write your code here
      int start = 0;
      int end = arr.length -1;
      int[] output = new int[2];
      for(int i =0; i<arr.length; i++){
        if (arr[start] + arr[end] < targetSum){
          start++;
        }
        else if (arr[start] + arr[end] > targetSum){
          end--;
        }
        else{
          output[0]=start;
          output[1] = end;
        }
      }
      return output;
    }

    public static void main(String[] args) {
      int[] result = PairWithTargetSum.search(new int[] { 1, 2, 3, 4, 6 }, 6);
      System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
      result = PairWithTargetSum.search(new int[] { 2, 5, 9, 11 }, 11);
      System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
    }
  }