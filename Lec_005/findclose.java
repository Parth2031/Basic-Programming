import java.util.Scanner;
public class findclose{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter size of array: ");
        int n=scn.nextInt();
        System.out.println();
        int[] arr=new int[n];
        input(arr,n);
        int data;
        System.out.print("Enter data: ");
        data=scn.nextInt();
        System.out.println();
        System.out.println(find(arr,n,data));
    }
    
    
    public static void input(int[] arr,int n){
        for (int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

    }


    public static int find(int[] arr,int n,int data){
        int si=0,ei=n-1,mid,a,b;
        if (data<=arr[0]) return(arr[0]);
        else if (arr[n-1]<= data) return(arr[n-1]);
        
        while(si<=ei){
            mid=(si+ei)/2;
            if(arr[mid]>=data && arr[mid-1]<=data){
                a=data-arr[mid-1];
                b=arr[mid]-data;
                if(a>b) return(arr[mid]);
                else return(arr[mid-1]);
            }
            else if(arr[mid]>data) ei=arr[mid-1];
            else si=mid+1;
        
        }
        return(0);
    }

}