import java.util.Scanner;
public class numlen{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n,count=0,k;
        System.out.print("Enter number: ");
        n=scn.nextInt();
        System.out.println();
        while(n>10){
            k=n%10;
            n=n/10;
            count++;
        }
        System.out.println(count+1);
    }
    
}