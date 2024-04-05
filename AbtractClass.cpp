//written by :SRINADHCH07
//code: abstact class 

#include<iostream>
using namespace std;
class A{
public:
virtual int data()=0;
};
class B:public A{
public:
int data(){
cout<<"data func";
}};
int main()
{
B o;
o.data();
}

#c++
