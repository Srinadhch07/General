//writen by SRINADHCH07
//CODE : BOO WITH class fun

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

demo operator +(demo &obj1){
demo temp(0,0);
temp.a=a+obj1.a;
temp.b=b+obj1.b;
return temp;
}
};
int  main()
{
demo ob(10,20),ob1(30,40),ob2(0,0);
ob2=ob+ob1;
ob2.show();
}

#c++
