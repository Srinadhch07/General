//virtual keyword 
//used to resolve Ambiguity

#include<iostream>
using namespace std;
class A{
public :
void s(){
cout<<"hello";
}};
class B:public virtual  A{};
class C: public virtual  A{};
class D: public B,public C{};
int main(){
D o;
o.s();}

#c++
