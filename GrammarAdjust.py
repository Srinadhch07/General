#CODE : Adjusting grammar (upper and lower case )

def l(s):
    lower= ""
    for char in s:
        if ord(char) >= 65 and ord(char) <= 90:
            lower += chr(ord(char) + 32) 
        else:
            lower += char
    lis=lower.split()
    for i in range(len(lis)):
           lis[i]=lis[i][0].upper()+lis[i][1:]
    final=""
    for i in lis:
        final+=i
        final+=" "
    print(final)
    

l(input("ENETR THE STRING :\n"))

#python
