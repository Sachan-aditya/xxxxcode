package master;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int targetsum=target-nums[i];
            if(map.containsKey(targetsum))
            {
                return new int[]{map.get(targetsum),i};
            }
            
            else
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
//MAP.GET -- TO GET INDEX OF TARGET SUM , AND THEN i to place
// it new array means new index