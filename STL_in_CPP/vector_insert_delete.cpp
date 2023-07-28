#include <bits/stdc++.h>
using namespace std;

int main(){
    vector<int> v;
    for(int i = 1; i <= 6; i++){
        v.emplace_back(i);
    }
    
    // erasing the element in vector

    v.erase(v.begin()); // deleting the first element in vector
    cout << "erasing begin element:" << endl;
    for(auto i : v){
        cout << i << endl;
    }
    cout << "erasing end element:" << endl;
    v.erase(v.end()-1); // deleting the last element in vector
     for(auto i : v){
        cout << i << endl;
    }

    cout << "erasing range element:" << endl;
    v.erase(v.begin(),v.begin()+2); // deleting the particular range of values
     for(auto i : v){
        cout << i << endl;
    }

    // inserting the elements in the vector

    cout << "insert element in the beginning:" << endl;
    v.insert(v.begin(),7); // inserting the 7 in beginning of vector
     for(auto i : v){
        cout << i << endl;
    }

    cout << "inserting two element in beginning:" << endl;
    v.insert(v.begin(),2,30); // inserting two 30 in the beginning of the vector
     for(auto i : v){
        cout << i << endl;
    }

    // copying the elements inside the vector
    vector<int> copy = {2,30};
    v.insert(v.end(),copy.begin(),copy.end());
    cout << "copying the elements in the vector:" << endl;
    for(auto i : v){
        cout << i << endl;
    }

    // popping the element from the vector
    v.pop_back();

    cout << "popping the element:" << endl;
    for(auto i : v){
        cout << i << endl;
    }

    // getting the size of the vector
    cout << "size of the vector v is " << v.size() << endl;

    // clearing the vector
    v.clear();

    // checking the vector is empty
    cout << "if empty show 1 else 0: " << v.empty() << endl;

    // swapping the vectors
    vector<int> v2 = {1,2,3};
    v.swap(v2);
    cout << "swapping the two vectors now the vector v values are: " << endl;
    for(auto i : v){
        cout << i << endl;
    }

    // printing end element in vector
    cout << "end element in the vector v is: " << v.back() << endl;

    // printing first element in vector
    cout << "first element in the vector v is: " << v.front() << endl;

}