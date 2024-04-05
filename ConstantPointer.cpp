// code : constant pointer program 
#include<iostream>
using namespace std;
int main(){
int x=10;
int *const ptr=&x;
*ptr=15;// We can't provide a value to pointer since this pointer has address of x hemce we can manipulate the value x 
cout<<x<<endl<<*ptr;


}


#c++
