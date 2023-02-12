public class lengthOfLastWord {
    public int lengthOfLastWord(String s)
    {
        String[] str=s.split(" ");
        String sb=str[str.length-1];
        return sb.length();
    }
    
}
