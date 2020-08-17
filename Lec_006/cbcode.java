import java.util.Scanner;

public class CbCode
{
  public static Scanner scn=new Scanner(System.in);

  public static void main(String[] args)
  {
    int m,n;
    System.out.print("Enter m and n: ");
    m=scn.nextInt();
    n=scn.nextInt();
    int[][]arr=new int[m][n];
    input(arr);
    dispPattern(arr);    
  }

  public static void input(int[][] arr)
  {
    for(int row=0;row<arr.length;row++)
    {
      for(int col=0;col<arr[0].length;col++)
        arr[row][col]=scn.nextInt();
    }
    System.out.println();
  }
    
  public static void dispPattern(int[][] arr)
  {
    int tne=arr.length*arr[0].length;
    int rmin=0;
    int cmin=0;
    int rmax=arr.length-1;
    int cmax=arr[0].length-1;

    while(tne>0)
    {
      for(int i=rmin;i<=cmax;i++)
      {
        System.out.print(cmin+1);
        tne--;
      }
      rmin++;

      for(int i=rmin;i<=rmax;i++)
      {
        System.out.print(cmin+1);
        tne--;
      }
      cmax--;
      
      for(int i=cmax;i>=cmin;i--)
      {
        System.out.print(cmin+1);
        tne--;
      }
      rmax--;
      
      for(int i=rmax;i>=rmin;i--)
      {
        System.out.print(cmin+1);
        tne--;    
      }
      cmin++;
    }
  }
}       
    
  
  