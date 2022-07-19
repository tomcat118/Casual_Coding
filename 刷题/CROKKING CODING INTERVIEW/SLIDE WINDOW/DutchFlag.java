import java.util.*;

class DutchFlag {
    //ERROR: NON-STATIC FUNCTION CAN'T BE USED IN STATIC FUNCTION
    // as they are within the objects themselves, thus has to declare from which class they are called from
    public static void sort(int[] arr) {
      // TODO: Write your code here  
      int left =0;
      int right = arr.length-1;
      for(int i=0; i<=right;){
        if(arr[i]<1){
          swap(arr, i, left);
          left++;
          i++;
        }
        else if (arr[i]==1){
          i++;
        }
        else{
          swap(arr, i, right);
          right--;
          
        }
      }
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
      int[] arr = new int[] { 1, 0, 2, 1, 0 };
      DutchFlag.sort(arr);
      System.out.print(Arrays.toString(arr));
      
      System.out.println();
  
      arr = new int[] { 2, 2, 0, 1, 2, 0 };
      DutchFlag.sort(arr);
      System.out.print(Arrays.toString(arr));
    }
  }
  
