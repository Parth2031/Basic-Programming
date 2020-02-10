#include<iostream>
#include<vector>
using namespace std;
void input(vector<int>& arr){
    for(int i=0;i<arr.size();i++){
        cin>>arr[i];
    }
}


void display(vector<int>& arr){
    for(int i:arr){
        cout<<i<<" ";
    }
    cout<<endl;
}


int max(vector<int>& arr){
    int max=arr[0],i;
    for(i=0;i<=arr.size();i++){
        if (arr[i]>max){
            max=arr[i];
        }
        
    }
    return(max);
}


int min(vector<int>& arr){
    int min=arr[0],i;
    for(i=0;i<arr.size();i++){
        if (arr[i]<min){
            min=arr[i];
        }
        
    }
    return(min);
}


int main(int args, char** argv){
    vector<int> arr(5,0);
    input(arr);
    cout<<"max: "<<max(arr)<<endl;
    cout<<"min: "<<min(arr)<<" ";
    return 0;
}