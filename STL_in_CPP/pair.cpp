#include <bits/stdc++.h>
using namespace std;

int main(){
    // pairing two data
    pair<int,int> a = {1,2};
    pair<string,string> name = {"suresh","kumar"};
    cout << name.first << endl;
    cout << a.first << " " << a.second << endl;
    pair<int,pair<int,int>> p = {1,{2,3}};
    cout << p.first << " " << p.second.first << endl;
    pair<int,int> arr[] = {{1,2},{2,3},{4,5}};
    cout << arr[2].first << " " << arr[2].second << endl;
}