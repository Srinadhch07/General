#written by : SRINADHCH07
#CODE : REMOVE WORD FROM STRING 

a=input("Enter string :")
b=a.split()
c=input("Enter word to remove :")
s=""

if c in  b:
    for i in b:
        b.remove(c)
else:
    print("Match not found")
for i in b:
    s+=i
    s+=" "
print(s)

#python
