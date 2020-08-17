#include<iostream>
using namespace std;

int main(int args,char** argv)
{
  int n,z=0;
  cout<<"Enter num: ";
  cin>>n;

  while (n>0)
  {
    int k=n%10;
    n=n/10;
    z=(z*10)+k;
  }

  cout<<z;
  
  return 0;
}
