import java.util.*;
public class twoSum {

//Error: Naming variable problem
    public int[] twoSum(int[] nums, int target) {
        
        int remain = 0;
        int second =0;
        Map <Integer,Integer> numIndex = new HashMap<>();
        int[] temp = new int[2];
        
        for(int first = 0; first< nums.length; first++){
            remain = target - nums[first];
            
            if(numIndex.containsKey(remain)==false){
                numIndex.put(nums[first], first);
            }
            else{
                second = numIndex.get(remain);
                
                temp[0]= second;
                temp[1]= first;
                break;
            }
        }
        return temp;
        
    }

}
