class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0;
        int ans=-1;
        int window=0;//1110111
        for(int right=0;right<nums.length;right++)
        {
            window+=nums[right];//1
            while(right-left+1!=window)//
            {
                window-=nums[left];
                left++;
            }
            ans=Math.max(ans,window);//1
        }
        return ans;
    }

}