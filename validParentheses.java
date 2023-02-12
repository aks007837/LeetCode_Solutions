public class validParentheses {
    public boolean isValid(String s) {
        char[] arr=new char[s.length()];
        int count=0;
        int flag=1;
        int open=0, close=0;
        for(int i=0; i<s.length(); i++)
        {
            if((s.charAt(i)=='{')||(s.charAt(i)=='(')||(s.charAt(i)=='['))
            {
                arr[count]=s.charAt(i);
                count++;
                open++;
            }
            else
            {
                close++;
                if((count>0) && ((s.charAt(i)==arr[count-1]+1)||(s.charAt(i)==arr[count-1]+2)))
                {
                    count--;
                }
                else
                {
                    flag=0;
                }
            }
        }
        if(flag==1 && (close==open))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
}
