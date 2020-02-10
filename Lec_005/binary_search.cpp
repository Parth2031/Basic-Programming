#include<iostream>
#include<vector>
using namespace std;


void display(vector<int>& arr){
    for(int i:arr){
        cout<<i<<" ";
    }
    cout<<endl;
}

void input(vector<int>& arr){
    for(int i=0;i<arr.size();i++){
        cin>>arr[i];
    }
    display(arr);
}



int binary_search(vector<int>& arr,int data){
    int si=0,ei=arr.size()-1,mid;
    while(si<=ei){
        mid=(si+ei)/2;
        if(arr[mid]==data){
            return (0);
        }
        else if(arr[mid]<data){
            si=mid+1;
        }
        else{
            ei=mid-1;
        }
    
    }
    return(1);
}

int main(int args,char** argv){
    vector<int> arr(10,0);
    int data;
    input(arr);
    cout<<endl;
    cout<<"Enter data to be found: ";
    cin>>data;
    cout<<endl;
    if(binary_search(arr,data)==1){
        cout<<"Found!"<<endl;
    }
    else{
        cout<<"Not found!"<<endl;
    }
}   