import java.util.Arrays;

public class AverageOfSubarrayOfSizeK {

  public static double[] findAverages(int K, int[] arr ){
    double[] output = new double[K];
    int window_start = 0;
    int window_sum = 0;
    int j = 0;
    for (int i=0; i< arr.length; i++){
        window_start = arr[i];
        window_sum+= arr[i];
        if(i>=K-1){
            output[j] = window_sum/Double.valueOf(K);
            window_sum -= arr[i-(K-1)];
            j++; 
        }
    }
    return output;
  }

  public static void main(String[] args) {
    double[] result = AverageOfSubarrayOfSizeK.findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
    System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
  }
}