#include <bits/stdc++.h>
using namespace std;

int * findPair(int[],int,int);
int binarySearch(int[],int,int);

int main(){
    int n,diff;
    cin >> n >> diff;
    int arr[n];

    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    int* ans;
    ans = findPair(arr,n,diff);
    for(int i = 0; i < 2; i++){
        cout << ans[i] << " ";
    }
    return 0;
    }
Q
