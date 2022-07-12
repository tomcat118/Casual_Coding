class SortedArraySquares {
// question: given an unsorted array, you need to sort the squared values of the array
    public static int[] makeSquares(int[] arr) {
      int[] squares = new int[arr.length];
      int highest_index = arr.length-1;
      int left =0;
      int right = arr.length-1;
  
      // TODO: Write your code here
      while(left < right){
  
          if(arr[left]*arr[left]< arr[right]*arr[right]){
            squares[highest_index] = arr[right]*arr[right];
            right--;
          }
          else{
            squares[highest_index] = arr[left]*arr[left];
            left++;
          }
          highest_index--;
      }
  
      return squares;
    }
    public static void main(String[] args) {

      int[] result = SortedArraySquares.makeSquares(new int[] { -2, -1, 0, 2, 3 });
      for (int num : result)
        System.out.print(num + " ");
      System.out.println();
  
      result = SortedArraySquares.makeSquares(new int[] { -3, -1, 0, 1, 2 });
      for (int num : result)
        System.out.print(num + " ");
      System.out.println();
    }
  }
  