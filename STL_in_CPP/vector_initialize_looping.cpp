#include <bits/stdc++.h>
using namespace std;

int main(){
    vector<int> v;
    v.push_back(1);
    v.emplace_back(2); // same as push_back() it pushes the value to vector but it is efficient

    vector<pair<int,int>> vec;
    vec.push_back({1,2});
    vec.emplace_back(3,4);

    vector<int> v1(5); // stores like {0,0,0,0,0}
    vector<int> v2(2,100); // stores like {100,100};
    vector<int> v3(5,20); // stores like {20,20,20,20,20}

    vector<int> v4(v3);

    cout << vec.at(0).first << endl; // way of getting single element in the vector
    cout << vec.at(1).second << endl;

    // looping through the vector using iterator
    // this begin() points the memory address of vector starting
    // this end() points the memory address of vector last element + 1 (empty element address)
    // because of pointing to address we have to dereference it using *(it) to get value in the address

    for(vector<int> :: iterator it = v3.begin(); it != v3.end(); it++){ // iterating to start to end
        cout << *(it) << endl;
    }    

    for(vector<int> :: iterator it = v2.end()-1 ; it != v2.begin()-1; it--){ // iterating form end to start
        cout << *(it) << endl;
    }
    
    // unused iterators
    // both are work on exact opposite to the above iterator begin() and end()
    // vector<int> :: iterator it = v.rbegin();
    // vector<int> :: iterator it = v.rend();

    // using auto
    // auto keyword automatically assign the data type according to the value
    for(auto it = v3.begin(); it != v3.end(); it++){
        cout << *(it) << endl;
    }

    // looping through the for each loop

    for(auto i : v2){
        cout << i << " ";
    }

    



   



}