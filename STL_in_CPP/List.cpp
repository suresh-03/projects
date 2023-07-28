#include <bits/stdc++.h>
using namespace std;

// list container is similar to the vector

int main(){
    list<int> ls;
    ls.push_back(1);
    ls.emplace_back(2);
    ls.push_front(0);
    ls.emplace_front(-1);

    // elements in the list
    cout << "elements in the list are: " << endl;
    for(auto i : ls){
        cout << i << endl;
    }
    cout << "size of the list is: " << ls.size() << endl;
   
    // poping the element
    ls.pop_back();
    ls.pop_front();

    cout << "after popping list can be:" << endl;
     for(auto i : ls){
        cout << i << endl;
    }
}