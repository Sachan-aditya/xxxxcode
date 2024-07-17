class panagram {
    public int subarraysDivByK(int[] nums, int k) {
 int c=0;
       for(int i=0;i<nums.length;i++)
       {
        int s=0;
        for(int j=i;j<nums.length;j++)
        {
            s+=nums[j];
            if(s%k==0)
            c++;
        }
       }
       return c;
 }
}