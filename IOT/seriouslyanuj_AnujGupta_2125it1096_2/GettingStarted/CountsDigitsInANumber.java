import java.util.Scanner;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=0;
      while(n!=0)
      {
          n=n/10;
          c++;
      }
      System.out.println(c);
    // write your code here  
   }
  }