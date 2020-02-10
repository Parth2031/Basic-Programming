#include<iostream>
#include<vector>
using namespace std;

void input(vector<vector<int>>&arr1){
    for(int row=0;row<arr1.size();row++){
        for(int col=0;col<arr1[0].size();col++){
            cin>>arr1[row][col];
        }
    }
    cout<<"\n\n";
}


void addmat(vector<vector<int>>&arr1,vector<vector<int>>&arr2){
    for(int row=0;row<arr1.size();row++){
        for(int col=0;col<arr1[0].size();col++){
            arr1[row][col]+=arr2[row][col];
        }
    }

}

void disp(vector<vector<int>>&arr1){
    for(int row=0;row<arr1.size();row++){
        for(int col=0;col<arr1[0].size();col++){
            cout<<arr1[row][col]<<" ";
        }
        cout<<endl;    
    }
    cout<<"\n\n";

}


int main(int args, char** argv){
    int m,n;
    cout<<"Enter m and n: ";
    cin>>m>>n;
    vector<vector<int>>arr1(m,vector<int>(n,0));
    vector<vector<int>>arr2(m,vector<int>(n,0));
    input(arr1);
    disp(arr1);
    input(arr2);
    disp(arr2);
    addmat(arr1,arr2);
    disp(arr1);
    return 0;
}