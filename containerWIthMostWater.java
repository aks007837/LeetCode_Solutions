public class containerWIthMostWater {
    public int maxArea(int[] height)
    {
        int maxvol=0;
        int maxi, maxj;
        // for(int i=0; i<height.length; i++)    
        // {
        //     for(int j=i; j<height.length; j++)
        //     {
        //         int min=(height[i]<height[j])?height[i]:height[j];
        //         int vol=(min*(j-i));
        //         if(vol>maxvol)
        //         {
        //             maxvol=vol;
        //             maxi=i;
        //             maxj=j;
        //         }
        //     }
        // }
        // return maxvol;
        
        int beg=0, end=height.length-1;
        while(beg<end)
        {
            int min=(height[beg]<height[end])?height[beg]:height[end];
            int vol=(min*(end-beg));
            if(vol>maxvol)
                {
                    maxvol=vol;
                    maxi=beg;
                    maxj=end;
                }
            if(height[beg]<height[end])
            {
                beg++;
            }
            else
            {
                end--;
            }
        }
        return maxvol;
    }
}
