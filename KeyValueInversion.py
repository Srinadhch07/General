#Written by :SRINADHCH07
#CODE: INVERTING KEY AND VALUES IN DICTIONARY 

b=int(input("Enter the Number of Elements :\n"))
key=[]
value=[]
print("Enter values:\n")
for i in range(b):
       key.append(int(input("key : ")))
       value.append(input("value : "))
    
def is_sorted(key,value):
        print("Inverting Key and values :")
        a=dict(zip(value,key))
        print(a)
        
is_sorted(key,value)

#python
