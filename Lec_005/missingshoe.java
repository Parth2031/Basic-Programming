import java.util.Scanner;

public class MissingShoe
{
  public static Scanner scn=new Scanner(System.in);
  public static void main(String[] args)
  {
    System.out.print("Enter size of array: ");
    int n=scn.nextInt();
    System.out.println();
    int[] arr=new int[n];
    input(arr,n);
    if(n%2!=0) 
      System.out.println(findTheMissingShoe(arr,n));
    else 
      System.out.println("No Shoe Missing!");
  }
    
  public static void input(int[] arr,int n)
  {
    for (int i=0;i<n;i++)
      arr[i]=scn.nextInt();
  }

  public static int findTheMissingShoe(int[] arr,int n)
  {
    int si=arr[0],ei=arr[n-1],mid;       
    while(si<=ei)
    {
      mid=(si+ei)/2;
      
      if(mid%2==0)
      {
        if (arr[mid]+1!=arr[mid])
          ei=mid-1;
        else 
          si=mid+1;     
      }
      else
      {
        if (arr[mid]-1!=arr[mid])
          return arr[mid];
        else 
          ei=mid-1;
      }
    }

    return(0);
  } 
}
