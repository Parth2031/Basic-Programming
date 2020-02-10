import java.util.Scanner;
public class numrotate{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n,count=0,j,k,r,c,z,i,T=10;
        System.out.print("Enter number: ");
        n=scn.nextInt();
        c=n;
        System.out.println();
        while(c>10){
            k=c%10;
            c=c/10;
            count++;
        }
        System.out.print("Enter number of times to be rotated: ");
        r=scn.nextInt();
        System.out.println();
        for (i=0;i<r;i++){
            T=10;
            for (j=1;j<count;j++){
                T=T*10;
            }
           
            k=n%T;
            n=n/T;
            n=(k*10+n);
        }
   
    System.out.println(n);


    }
    
}