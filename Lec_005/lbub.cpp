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


int lb(vector<int>& arr,int data){
    int si=0,ei=arr.size()-1,mid;
    while(si<=ei){
        mid=(si+ei)/2;
        if( arr[mid]==data){
            if(mid-1>=0 && arr[mid-1]==data){
                ei=mid-1;
            }
            else return(mid);
        }
        else if(arr[mid]<data){
            si=mid+1;
        }
        else{
            ei=mid-1;
        }
    
    }
    return(0);
}

int ub(vector<int>& arr,int data){
    int si=0,ei=arr.size()-1,mid;
    while(si<=ei){
        mid=(si+ei)/2;
        if( arr[mid]==data){
            if(mid+1<=arr.size() && arr[mid+1]==data){
                si=mid+1;
            }
            else return(mid);
        }
        else if(arr[mid]<data){
            si=mid+1;
        }
        else{
            ei=mid-1;
        }
    
    }
    return(0);
}


int main(int args,char** argv){
    vector<int> arr={10,12,12,12,45,78};
    int data;
    
    cout<<endl;
    cout<<"Enter data to be found: ";
    cin>>data;
    cout<<lb(arr,data)<<" ";
    cout<<ub(arr,data);
}   