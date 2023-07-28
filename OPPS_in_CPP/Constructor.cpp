#include <bits/stdc++.h>
using namespace std;

// constructor is a special function which is called in the compile time

class cars{
    public:
        string brand;
        string model;
        int year;
        long price;
        
        cars(string brand, string model, int year, long price){ // constructor with parameters
            cout << "brand of the car is " << brand << endl;
            cout << "model of the car is " << model << endl;
            cout << "year of manufacturing " << year << endl;
            cout << "price of the car is " << price << endl;
        }

        cars(){ // constructor without parameters
            cout << "nothing" << endl;
        }

};

int main(){
    cars c1("benz","c1",2023,30000000);
    cars c2("BMW","A200",2023,50000000);
    cars();

}