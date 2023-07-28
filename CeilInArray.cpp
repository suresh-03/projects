#include <iostream>
using namespace std;

// https://www.geeksforgeeks.org/ceiling-in-a-sorted-array/

int Ceil(int[],int,int);

int main(){
    int n,k;
    cin >> n >> k;
    int arr[n];
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    cout << Ceil(arr,n,k) << endl;
}

int Ceil(int arr[],int n, int k){
    if(arr[0] > k){
        return arr[0];
    }
    for(int i = 0; i < n; i++){
        if(i != n-1){
        if(arr[i] < k && arr[i+1] > k){
            return arr[i+1];
        }
        }
    }
    return -1;
}