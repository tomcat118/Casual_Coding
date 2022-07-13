import java.util.*;

//Given an array arr of unsorted numbers and a target sum, 
//count all triplets in it such that arr[i] + arr[j] + arr[k] < target 
//where i, j, and k are three different indices. Write a function to 
//return the count of such triplets.
class TripletWithSmallerSum {

    public static int searchTriplets(int[] arr, int target) {
        int count = 0;
        Arrays.sort(arr);
        
        for (int i =0; i< arr.length; i++){
            int left = i+1;
            int right = arr.length-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum<target){
                    count+=(right-left); 
                     
                    left++;
                }
                else{
                    right--;
                }
            }
        }

        return count;
      }
      public static void main(String[] args) {
        System.out.println(TripletWithSmallerSum.searchTriplets(new int[] { -1, 0, 2, 3 }, 3));
        System.out.println(TripletWithSmallerSum.searchTriplets(new int[] { -1, 4, 2, 1, 3 }, 5));
      }
}