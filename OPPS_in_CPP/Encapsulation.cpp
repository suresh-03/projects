#include <bits/stdc++.h>
using namespace std;

// encapsulation is the process of hiding the data

class encap{
    private:
        string name;
    public:
        void setter(string n){
            name = n;
        }

        string getter(){
            return name;
        }
};

int main(){
    encap e;
    e.name = "suresh"; // not possible because name is private
    e.setter("suresh kumar s");
    cout << e.getter() << endl;
}