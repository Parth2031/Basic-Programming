import java.util.Scanner;
public class numfind{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int[] arr=new int[5];
        input(arr);
        System.out.print("Enter value to be found: ");
        int data=scn.nextInt();
        System.out.println(find(arr,data));
    }
    public static void input(int[] arr){
        for (int i=0;i<5;i++){
            arr[i]=scn.nextInt();
        }

    }
    public static int find(int[] arr,int data){
        int j=0;
        for (int i=0;i<5;i++){
            if (arr[i]==data){
                j=i+1;
               break;
                
            }
        }
        return j;
    }

}

