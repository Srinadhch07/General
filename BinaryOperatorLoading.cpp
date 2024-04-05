//writen by SRINADHCH07
//CODE : BOO WITH friend fun

#include<iostream>
using namespace std;
class demo{
int a,b; public :
demo(int x, int y){
a=x;
b=y;
}
void show(){
cout<<"A= "<<a<<"B= "<<b<<endl;
}
friend demo operator +(demo &obj,demo &obj1);
};
demo operator +(demo &obj,demo &obj1){
demo temp(0,0);
temp.a=obj.a+obj1.a;
temp.b=obj.b+obj1.b;
return temp;
}
int  main()
{
demo ob(10,20),ob1(30,40),ob2(0,0);
ob2=ob+ob1;
ob.show();
}

#c±+
