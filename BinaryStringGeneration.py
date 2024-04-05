# Generates the binary strings 
def g(n):
    if n == 0:
        return ['']
    else:
        prev_strings = g(n-1)
        new_strings = []
        for string in prev_strings:
            new_strings.append(string + '0')
            new_strings.append(string + '1')
        return new_strings
       
b=int(input("Enter the Number: "))
c=g(b)
print(c)



#python
