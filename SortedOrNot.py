#Written by :SRINADHCH07
#CODE:CHECKING SORTED OR NOT
#
a=[]
b=int(input("Enter the Number of Elements :\n"))
print("Enter values:\n")
for i in range(b):
       a.append(int(input("value : ")))
print(a)
def is_sorted(a):
        c=sorted(a)
        print(a==c)
is_sorted(a)



#python
