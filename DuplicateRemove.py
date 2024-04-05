#Written by :SRINADHCH07
#CODE: REMOVING DUPLICATES
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
        print(d)
        
is_sorted(a)

#python
