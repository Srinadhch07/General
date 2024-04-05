#written by SRINADHCH07
#CODE : finding the most occured word in text file 

with open("file1.txt","w+") as f1:
        a=f1.write(input("Text here \n"))
        b=f1.read()
        c=b.split()
        d=max(c,key=c.count)
        print("The most occurred word is",d)
#python
