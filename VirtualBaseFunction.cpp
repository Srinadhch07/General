//written by :SRINADHCH07
//CODE: VIRTUAL BASE FUNCTION 

#include<iostream>
using namespace std;
class A {
    public:
    virtual void fun1()
    {
        cout<<"fun is calleld base ";
}
void fun2()
{
    cout<<"fun2 in base class ";
}
};
class B : public A
{
    public:
    void fun1()
    {
        cout<<"Fun1 in derived ";
        
    }

    void fun2()
    {
        cout<<"fun2 in derived";
        
    }
};
int main()
{
    A *bc;
    B obj;
    bc=&obj;
    bc->fun2();
    obj.fun2();
}

#CPP
