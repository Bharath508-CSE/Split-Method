class PalindromeString{
    public static void main(String[] args) {
      String s="madam sir madam";
      String[] str=s.split(" ");
      for(int i=0;i<str.length;i++)
      {
          if(isPalindrom(str[i]))
          {
              System.out.print(str[i]+" ");
          }
      }
    }
    static boolean isPalindrom(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
