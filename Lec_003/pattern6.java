import java.util.Scanner;
public class numbox{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n;
        n=scn.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
            int b=(n%2==0)?n/2:n/2+1;
            int i=0;
                int rowEnd=n;
            int colEnd=n;
            int start=0;
            int arr[][] = new int[n][n];
            int count=1;
            while(i<b){
                for(int r=start;r<rowEnd;r++){
                    //fill all row's first col with count
                    arr[r][start]=count;
                    //fill all row's last col woth count
                    arr[n-r-1][n-start-1]=count;
                }
                for(int c=start;c<colEnd;c++){
                    //fill all col in first row with count
                    arr[start][c]=count;
                    //fill all col in last row with count
                    arr[n-start-1][n-c-1]=count;
                }
                count++;
                start++;
                rowEnd--;
                colEnd--;
                i++;
            }
                for(int r=0;r<n;r++){
                    for(int c=0;c<n;c++){
                        System.out.print(arr[r][c]+" ");
                    }
                    System.out.println();
                }
        }
}
/*
Output:
1 1 1 1 1
1 2 2 2 1
1 2 3 2 1
1 2 2 2 1 
1 1 1 1 1
*/
