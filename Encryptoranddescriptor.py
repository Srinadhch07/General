#Encryptor and descriptor
#written by :SRINADHCH07

import re
encoded=input()
decoded =re.sub("[^A-Z]", "",encoded,0,re.IGNORECASE)

def reverse(string):

    string = string[::-1]

    return string
 

s = decoded
print(end="")

print(reverse(s))


#python
