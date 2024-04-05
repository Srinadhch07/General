//written by: SRINADHCH07
//CODE : method overloading 

#include<iostream>
using namespace std;
class A{
string x,y;
public:
A(string m,string n){
x=m;
y=n;
}
void print(){
cout<<"name:"<<x<<endl;
cout<<"id :"<<y<<endl;
}};
class B:public A{
float i,j,k;
public:
B(string  s,string  q, float b):A(s,q){
b=k;
i=20*15000/100;
j=15*15000/100;

}
void show(){
cout<<"gross salary:"<<k+i+j<<endl;
}};
int main()
{
B o("sri","523",15000);
o.print();
o.show();
return 0;
} 

#c++
