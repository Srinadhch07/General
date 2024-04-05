#written by SRINADHCH07
#CODE : ADDITION OF FILES
# First create files named file1 and file2
with open("file1.txt","r") as f1,with open("file2.txt","r") as f2,with open("file3.txt","w") as f3:
        a=f1.read()
        b=f2.read()
        c=f3.write(a+"\n"+b)
#python
