#include <bits/stdc++.h>
using namespace std;

// polymorphism is the process having more methods with same name and different parameters

// types of polymorphism
// compile time polymorphism - method overloading
// runtime polymorphism - method overriding

// method overloading...
class poly{
    public:
        void display(){           
            cout << "hello" << endl;
        }
        void display(int age,string name){
            cout << "my name is " << name << " and age is " << age << endl;
        }
        int display(int n){
            return n * n;
        }
        void show(){
            cout << "hello I am in poly!" << endl;
        }
};


// overriding...
class override : public poly{
    public:
    void show(){
        cout << "hello I am in override!" << endl;
    }
};



int main(){
    poly p;
    p.display();
    p.display(20,"suresh");
    cout << p.display(5) << endl;
    override o;
    o.show();
    // poly *a;
    // override e;
    // a = &e;
    // a -> show();

}