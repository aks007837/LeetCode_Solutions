public class removeDuplicates {
    public int removeDuplicates(int[] nums)
    {
        int count=1;
        if(nums.length!=0)
        {
            for(int i=1; i<nums.length; i++)
            {
                if(nums[i]!=nums[count-1])
                {
                    nums[count]=nums[i];
                    count++;
                }                
            }
        }
        return count;
    }
    
}
