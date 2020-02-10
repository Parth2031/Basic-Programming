import java.util.Scanner;
public class numrotate2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int num,rot;
        System.out.print("Enter number to be rotated: ");
        num=scn.nextInt();
        System.out.println();
        System.out.print("Enter number of  times it has to be rotated: ");
        rot=scn.nextInt();
        System.out.println();       
        System.out.println(rotation(num,rot));

    }


    public static int noOfDigits(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;   
        }
    return(count);
    }
    
    
    public static int rotation(int n,int r){
        int i,j,k,T;
        int digit=noOfDigits(n);
        r%=digit;
        r=r<0?r+digit:r;
        for (i=0;i<r;i++){
            T=10;
            for (j=1;j<digit-1;j++){
                T=T*10;
            }
            k=n%T;
            n=n/T;
            n=(k*10+n);
        

        }         
        return n;   
    }
}
