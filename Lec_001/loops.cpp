#include<iostream>
using namespace std;
int main(int args,char** argv){
    int i,n,z;
    cout<<"Enter number whose table is to be printed: ";
    cin>>n;
    cout<<endl;
    cout<<"Enter number to which table is to be printed: ";
    cin>>z;
    cout<<endl;

    for(i=1;i<=z;i++){
        
        cout<<n<<" x "<<i<<" = "<<(i*n)<<endl;
    }
return 0;
}