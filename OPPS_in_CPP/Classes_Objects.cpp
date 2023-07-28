
#include <bits/stdc++.h>
using namespace std;

// classes are the user defined data type
// objects are the instance of the class

class human{
    // initially the members in the class are private
    public:
        string name;
        int age;
        float height;
        double weight;
        bool isLive;

        void display(){
            cout << "my name is " << name << endl;
            cout << "my age is " << age << endl;
            cout << "my height is " << height << endl;
            cout << "my weight is " << weight << endl;
            if(isLive){
                cout << "I am live now!" << endl;
            }
        }
        
};

int main(){
    human h1; // creating the object for the class human
    h1.name = "suresh";
    h1.age = 20;
    h1.height = 180.5;
    h1.weight = 61.5;
    h1.isLive = true;
    h1.display();
}