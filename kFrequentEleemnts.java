public class kFrequentEleemnts
{
    public static int removeDuplicates(int[] nums)
    {
        int count=0;
        int[] expnums=new int[nums.length];
        if(nums.length!=0)
        {
            expnums[0]=nums[0];
            count++;
            for(int i=1; i<nums.length; i++)
            {
                if(nums[i]!=expnums[count-1])
                {
                    System.out.println("Elem: "+ expnums[count]);
                    expnums[count]=nums[i];
                    count++;
                }                
            }
        }

        for(int i=0; i<count-1; i++)
        {
            System.out.print(expnums[i] + " ");
        }
        return count;
    }
    
    public static void main(String[] args) {
        int nums[]= {0,0,1,1,1,2,2,3,3,4};
        int k= removeDuplicates(nums);
        
        System.out.println();
        System.out.println("Fnal Result");
        System.out.println("K: "+k);

    }
}
