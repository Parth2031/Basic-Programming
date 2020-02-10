#include<iostream>
using namespace std;
int main(int args, char** argv){
    int n,nsp,nst,csp,cst,r;
    cin>>n;
    nsp=n/2;
    nst=1;
    for (r=1;r<=n;r++){
        for(csp=1;csp<=nsp;csp++){
            cout<<" ";
        }
        for(cst=1;cst<=nst;cst++){
            cout<<"*";
        }
        cout<<endl;
        if (r<=n/2){
            nst+=2;
            nsp--;
        }
        else{
            nst-=2;
            nsp++;
        }
    }
    
    
    return 0;
}




/*
Output:
    *
   ***
  *****
 *******
  *****
   ***
    *
    
*/
