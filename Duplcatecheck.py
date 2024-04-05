#Written by :SRINADHCH07
#CODE:CHECKING DUPLICATES
#
a=[]
b=int(input("Enter the Number of Elements :\n"))
print("Enter values:\n")
for i in range(b):
       a.append(int(input("value : ")))

def is_sorted(a):
        c=set(a)
        d=list(c)
        d=sorted(d)
        print(a==d)
        
print("ELEMENTS DON'T CONTAIN DUPLICATES :")
is_sorted(a)


#python
