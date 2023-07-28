#include <bits/stdc++.h>
using namespace std;

// inheritance is the concept deriving the properties of parent class to the child class

class human{
    public:
        string name;
        int age;
        string relation;

        void detail(){
            cout << "name : " << name << endl;
            cout << "age : " << age << endl;
            cout << "relation : " << relation << endl;
        }

};

class father : public human{ // single inheritance
    public:
    void show(){
        cout << "i am a father" << endl ;
    }
};
class mother : public human{
    public:
    void show(){
        cout << "i am a mother" << endl;
    }
};

int main(){
    father h1;
    mother m1;

    h1.name = "viswa";
    h1.age = 50;
    h1.relation = "father";

    m1.name = "vivina";
    m1.age = 49;
    m1.relation = "mother";

    h1.detail();
    m1.detail();
    h1.show();
    m1.show(); 
}

