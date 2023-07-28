#include <bits/stdc++.h>
using namespace std;

int * selection(int[],int);

int main(){
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    int * ans;
    ans = selection(arr,n);
    for(int i = 0; i < n; i++){
        cout << ans[i] << " ";
    }
    cout << endl;
}

int * selection(int arr[], int n){

    for(int i = 0; i < n; i++){
        int index = 0;
        int max = arr[0];
        for(int j = 0; j < n-i; j++){
            if(arr[j] > max){
                max = arr[j];
                index = j;
            }
        }
        int temp = arr[(n-1)-i];
        arr[(n-1)-i] = max;
        arr[index] = temp;
    }
    return arr;
}