#include <bits/stdc++.h>
using namespace std;

// abstraction is the concept of hiding complexity of the data

class AbstractStudent{
    public:
    virtual void contract()=0; // abstract method with virtual keyword
};

class Student : AbstractStudent{
    public:
    void contract(){
        cout << "contract is granted!" << endl;
    }
};

int main(){
    Student s1;
    s1.contract();
}

