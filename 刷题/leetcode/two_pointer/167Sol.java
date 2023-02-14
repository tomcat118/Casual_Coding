class 167Sol {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        //if size=1; check if same; return
       
        if(numbers.length<2){
            return result;
        }
        int left = 0; 
        int right = numbers.length-1;
        //left poninter to 0; right pointer to i+1
        while(left < right){
            if(numbers[left]+numbers[right] == target){
                result[0]= left+1;
                result[1] = right +1;
                break;
            }
            else if(numbers[left] + numbers[right] < target){
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
}