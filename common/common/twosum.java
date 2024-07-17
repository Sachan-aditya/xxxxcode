package common;
import java.util.HashMap;
import java.util.Map;

class port {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map =new HashMap<>();//hasmap
        for(int i=0;i<nums.length;i++)
        {
            int targetsum=target-nums[i];
            if(map.containsKey(targetsum))//check if there or not inn hasmap
            {
                return new int[]{map.get(targetsum),i};//if yes then extract the key and index
            }
            else
            map.put(nums[i],i);//insert in hasmpa 
        }
        return new int[]{-1,-1};
    }
}
// hashmmap contains key and value , here are the few operations