package array;

class twopointer {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int i=0;
        
        while(i<=high)//0<2 //1<2
        {
            if(nums[i]==1)
            i++;//2
            else if(nums[i]==0)
            {
                int temp=nums[i];//2//0
                nums[i]=nums[low];//2//0
                nums[low]=temp;//2//0
                low++;i++;//1//1//2

            }
          else
            {
               int temp=nums[i];//2
                nums[i]=nums[high];//1
                nums[high]=temp;//2
                high--;//1
            }



        }
        
    }
}