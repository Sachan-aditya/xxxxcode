package common;

class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
            c++;
        }
    
         if(nums[nums.length-1]>nums[0])
         c++;
    return c<=1;
    }
}
//[3,4,5,1,2]= here loop starts from 4 , so 
//3>4 here c=1 , rest all conditions gets false;
