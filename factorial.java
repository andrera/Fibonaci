import java.util.Scanner;
 
class factorial
{
   public static void main(String args[])
   {
      int n, c, fact = 1;
 
      System.out.println("masukkan inputan");
      Scanner in = new Scanner(System.in);
 
      n = in.nextInt();
 
      if ( n < 0 )
         System.out.println("tidak bisa");
      else
      {
         for ( c = 1 ; c <= n ; c++ )
            fact = fact*c;
 
         System.out.println("factorialnya "+n+" adalah = "+fact);
      }
   }
}
