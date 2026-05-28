class ReverseWord {
    public static void main(String[] args) {
      String s="java is easy";
      String[] str=s.split(" ");
      for(int i=0;i<str.length;i++)
      {
          System.out.print(isRev(str[i])+" ");
      }
    }
    static String isRev(String s)
    {
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        return rev;
    }
    
}
