import java.util.Scanner;
public class table{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int i,n,z;
        System.out.print("Enter number whose table is to be printed: ");
        n=scn.nextInt();
        System.out.println();
        System.out.print("Enter number to which table is to be printed: ");
        z=scn.nextInt();
        System.out.println();
        for (i=1;i<=z;i++){
            System.out.println(i*n);    
        }
    }
}