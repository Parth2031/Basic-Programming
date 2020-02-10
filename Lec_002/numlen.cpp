#include<iostream>
using namespace std;
int main(int args,char** argv){
    cout<<"Enter num: ";
    int n, count=0;
    cin>>n;
    while (n>10){
        int k=n%10;
        n=n/10;
        count++;
    }
    cout<<count+1;
    return 0;
}
