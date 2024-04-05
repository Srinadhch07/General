//written by SRINADHCH07
//Code : VIRTUAL DESTRUCTORS


#include<iostream>
using namespace std;
class A
{
    public:
virtual ~A()=0;
};
A::~A(){
    cout<<"pure virtual destructor";
}
class B: public A
{
    public:
};
int main()
{
    B o;
}

#cpp
