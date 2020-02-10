#include<iostream>
using namespace std;
int main(int args, char** argv){
    int a=0, b=0, c=0;
    cout<<"Enter a: ";
    cin>>a;
    cout<<"\n";
    
    cout<<"Enter b: ";
    cin>>b;
    cout<<"\n";
    
    cout<<"Enter c: ";
    cin>>c;
    cout<<"\n";
    
    if (a>b && a>c){
            cout<<a;
    }
    else if (b>a && b>c){
           cout<<b;
    }
    else{
            cout<<c;
    }
    return 0;
}