class RemoveDuplicates {
/*
 * Given an array of sorted numbers, remove all duplicate number instances from it in-place, 
 * such that each element appears only once. The relative order of the elements 
 * should be kept the same and you should not 
 * use any extra space so that that the solution have a space complexity of O(1).
 * 
 * Input: [2, 3, 3, 3, 6, 9, 9]
// Output: 4
// Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].

// Input: [2, 2, 2, 11]
// Output: 2
// Explanation: The first two elements after removing the duplicates will be [2, 11].
*
 */
    public static int remove(int[] arr) {
      // TODO: Write your code here
      int unique_index = 0;
      int unique_num = arr[0];
      
      for (int dup_index = 1;dup_index<arr.length; dup_index++){
    
        if(arr[dup_index] != unique_num) {
  
          unique_num = arr[dup_index];
          unique_index++;
          if(dup_index > unique_index){
  
            arr[unique_index]= arr[dup_index];
          }  
        }
      }
  
      return unique_index+1;
    }
    public static void main(String[] args) {
      int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
      System.out.println(RemoveDuplicates.remove(arr));
  
      arr = new int[] { 2, 2, 2, 11 };
      System.out.println(RemoveDuplicates.remove(arr));
    }
  }
  