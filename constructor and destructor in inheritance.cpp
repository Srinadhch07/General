//written by SRINADHCH07
//code: constructor and destructor in inheritance 

#include<iostream>
using namespace std;
class A{
public:
A(int j){
cout<<"Number youhave entered:"<<j<<endl;
}};
class B:public A{
int y;
public:
B(int j):A(j){
cout<<"child class"<<endl;
}
~B(){
cout<<"child class destructed ";
}};
int main()
{
B o(2);
}

#c++
