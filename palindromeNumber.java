public class palindromeNumber {
    public boolean isPalindrome(int x)
    {
        int c=x;
        int count=1;
        int dup=0;
        while(c!=0)
        {
            dup=dup*10+(c%10);
            c/=10;
        }
        if((x==dup)&&(!(x<0)))
            return true;
        else
            return false;
    }
}
