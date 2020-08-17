import java.util.Scanner;

public class Round
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
    int dir=0,r=0,c=0;
      
    while(true)
    {
      dir=(dir+arr[r][c]);
      if(dir==0)
      {
        c++;
        if(c==arr[0].length)
        {
          System.out.println(r + "," + (c-1));
          break;
        }
      }
      else if(dir==1)
      {
        r++;
        if(r==arr.length)
        {
          System.out.println((r-1) + "," + c);
          break;
        }
      }
      else if(dir==2)
      {
        c--;
        if(c==-1)
        {
          System.out.println(r + "," + (c+1));
          break;
        }
      }
      else
      {
        r--;  
        if(r==-1)
        {
          System.out.println((r+1)+ "," + c);
          break;
        }
      }
    }   
  }  
}   
  