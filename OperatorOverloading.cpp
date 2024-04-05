//Operator overloading
//written by : SRINADHCH07

#include<iostream>
using namespace std;
class A{
float rec,tri;
public:
A(int r1=0, int i1=0)
{
rec=r1;
tri=i1;}
A operator *(A const &obj)
{
A res;
res.rec=rec*obj.rec; //obj.r =2  , r=10
res.tri=tri*obj.tri*0.5;
return res;
}
void print(){
cout<<"Area of rectangle :"<<rec<<endl<<"Area of triangle :"<<tri<<endl;
}
};
int main()
{float a,b,c,d;
cout<<"Enter Length and breadth of rectangle :";
cin>>a>>b;
cout<<"Enter Height and base of triangle :";
cin>>c>>d;
A c1(a,c),c2(b,d);
A c3=c1*c2;
c3.print();
//c3.print1();

}

#c++
