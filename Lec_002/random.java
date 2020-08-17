import java.util.Scanner;

public class random
{
  public static Scanner scn=new Scanner(System.in);
  
  public static void main(String[] args)
  {
    int n,i;

    System.out.print("Enter number upto which prime numbers are to be found: ");
    n=scn.nextInt();
    
    for (i=3;i<=n;i++) {
      isPrime(i);
    }
  }
   
  public static int isPrime(int n)
  {
    int i,flag=0;
    
    for (i=2;(i*i)<=n;i++)
    {
      if(n%i==0)
      {
        flag=1;
        break;
      }
    }

    if (flag==0) {
      System.out.println(n);
    } 

    return(0); 
  }
}