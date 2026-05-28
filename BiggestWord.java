class BiggestWord {
    public static void main(String[] args) {
      String s="a quick brown fox is jump upto lazy dog";
      String[] str=s.split(" ");
      String Biggest=str[0];
      for(int i=0;i<str.length;i++)
      {
          if(str[i].length()>Biggest.length())
          {
              Biggest=str[i];
          }
      }
      System.out.println(Biggest);
    }
    
}
