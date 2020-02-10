import java.util.Scanner;
public class pattern5{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n;
        n=scn.nextInt();
        numpyr(n);
        
    }
    

    public static void numpyr(int n){
        int csp,nsp,nst,r,cst;
        nsp=n/2;
        nst=1;
        for (r=1;r<=n;r++){
            int val=r;
            if (r>n/2){
                val=n-r+1;
            }
            else{
                val=r;
            }
            
            for(csp=1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            
            for(cst=1;cst<=nst;cst++){
                System.out.print(val);
                if(cst<=nst/2){
                    val++;
                }
                else{
                    val--;
                }
            }

            if(r<=n/2){
                nst+=2;
               
                nsp--;
            }    
             
            else{
                nst-=2;
                nsp++;
            }

            System.out.println();   
                   
        }
        
        
            
    }
}

/*
Output:
    1
   232
  34543
 4567654
  34543
   232
    1
    */
