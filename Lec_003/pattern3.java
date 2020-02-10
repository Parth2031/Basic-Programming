import java.util.Scanner;
public class pattern3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n,cst,csp,nst,nsp,r;
        n=scn.nextInt();
        pyram(n);
        
    }
    

    public static void pyram(int n){
        int cst,csp,nst,nsp,r;
        nst=1;
        nsp=n-1;
        for(r=1;r<=n;r++){
            for(csp=1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            for (cst=1;cst<=nst;cst++){
                System.out.print("*");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }    
    }
}


