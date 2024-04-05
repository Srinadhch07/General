#written by SRINADHCH07
#CODE : Finding all things in text file 
with open("file1.txt","r") as f1:
        
        b=f1.read()
        c=b.split()
        vowels=0
        upper=0
        lower=0
        space=0
        for i in b:
            if (i.isupper()):
                upper+=1
            if (i.islower()):
                lower+=1
            if (i.isspace()):
                space+=1
            if(i=='a' or i=='e' or i=='i' or i=='o' or i=='u') :
                   vowels+=1
        print("VOWELS :",vowels)
        print("Upper :",upper)
        print("lower :",lower)
        print("Spaces :",space)
        print("Total words:",len(c))
           
        
#python 
#fav
