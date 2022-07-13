//Given an array with positive numbers and a positive target number, find all of 
//its contiguous subarrays whose product is less than the target number.

import java.util.*;

class SubarrayProductLessThanK {

  public static List<List<Integer>> findSubarrays(int[] arr, int target) {
    List<List<Integer>> subarrays = new ArrayList<>();
    int product =1;
    int left = 0;
    for(int right =0; right<arr.length; right++){
      product*= arr[right];
      while(product >= target && right>=left){
          product/=arr[left];
          left++;
      }
      List<Integer> tempL = new LinkedList<>();
          for(int i = right; i>= left; i--){
            tempL.add(arr[i]);
            subarrays.add(new ArrayList<>(tempL));
          }
    }
    // TODO: Write your code here
    return subarrays;
  }
}
