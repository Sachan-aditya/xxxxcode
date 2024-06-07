class xor {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i:nums)
        {
         result=result^i;//xor with 0 no chaneg
        }
          return result;
        }
}

//[221]=1 as 1 is only time 
// 33442^=2 0^3^3^4^4^2=2
//xor  for findinf dubpicate
//and for findinf even odd 
