import java.util.*;

//find
class TripletSumCloseToTarget {

  public static int searchTriplet(int[] arr, int targetSum) {
    int distance = targetSum+1;
    Arrays.sort(arr);
    
    for (int i = 0; i < arr.length - 2; i++) {
      if (i > 0 && arr[i] == arr[i - 1]) // skip same element to avoid duplicate triplets
        continue;
      distance = Math.min(distance, searchPair(arr, targetSum - arr[i], i + 1) );
    }

    return Math.abs(targetSum-distance);
  }
  private static int searchPair(int[] arr, int targetSum, int left) {
    int right = arr.length - 1;
    int distance = targetSum+1;
    while (left < right) {
      int currentSum = arr[left] + arr[right];
      if (currentSum == targetSum) { // found the triplet
        distance = 0;
        return distance;
      } else if (targetSum > currentSum){
        distance = Math.min(distance, Math.abs(arr[left] + arr[right]- targetSum));
        left++; // we need a pair with a bigger sum
      }
      else
        distance = Math.min(distance, Math.abs(arr[left] + arr[right]- targetSum));
        right--; // we need a pair with a smaller sum
    }
    return distance;
  }


}