public class SmallestWord {
    public static void main(String[] args) {
      String s="java is a very easy";
      String[] str=s.split(" ");
      String small=str[0];
      for(int i=0;i<str.length;i++)
      {
          if(str[i].length()<small.length())
          {
              small=str[i];
          }
      }
      System.out.println(small);
    }
    
}
