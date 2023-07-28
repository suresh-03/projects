#include <iostream>
using namespace std;

void print1(int);
int fib(int);

int main(){
    print1(9);
    cout << fib(8) << endl;
}
void print1(int n){
    for(int row = 1; row < 2*n; row++){
        if(row > n){
            for(int spc = n; spc < row; spc++){
                cout << " ";
            }
            for(int col = row - (n-1); col <= n; col++){
                cout << col << " ";
            }
        }
        else{
             for(int spc = row; spc < n; spc++){
            cout << " ";
        }
        for(int col = (n-row)+1; col <= n; col++){
            cout << col << " ";
        }
        }
       
        cout << endl;
    }
}

int fib(int n){
   return n < 2 ? n : fib(n-1)+fib(n-2);
}
   

