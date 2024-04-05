#written by :SRINADHCH07
#CODE : CALCULATOR 
print("""\033[1mAddition (+)
Subtraction (-)
Multipliction (*)
Division (/)
NOTE : Enter "1" for single operator
       Enter "2" for multiple operators\033[0m
""""")

def add():
 try:
   sum=0
   no=int(input("Enter how many Elements :"))
   for i in range(no):
     a=int(input("Enter Element :"))
     sum+=a
   print("Sum :",sum)
 except ValueError as m:
   print("############Inavalid input ###############",m)
   sum=0
   no=int(input("Enter how many Elements :"))
   for i in range(no):
     a=int(input("Enter Element :"))
     sum+=a
   print("Sum :",sum)
def sub():
 try:
    no=int(input("Enter how many Elements :"))
    a=int(input("Enter Element :"))
    sub=a
    for i in range(no-1):
     a=int(input("Enter Element :"))
     sub-=a
    print("Subtraction :",sub)
 except ValueError as m:
    print("############Inavalid input ###############",m)
    no=int(input("Enter how many Elements :"))
    a=int(input("Enter Element :"))
    sub=a
    for i in range(no-1):
     a=int(input("Enter Element :"))
     sub-=a
    print("Subtraction :",sub)
 
def mul():
 try:
   mul=1
   no=int(input("Enter how many Elements :"))
   for i in range(no):
     a=int(input("Enter Element :"))
     mul*=a
   print("Multiplication :",mul)
 except ValueError as m:
   print("############Inavalid input ###############",m)
   mul=1
   no=int(input("Enter how many Elements :"))
   for i in range(no):
     a=int(input("Enter Element :"))
     mul*=a
   print("Multiplication :",mul)
def div():
 try:
   no=int(input("Enter how many Elements :"))
   a=int(input("Enter Element :"))
   div=a
   for i in range(no-1):
     a=int(input("Enter Element :"))
     div/=a
   print("Division :",div)
 except (ValueError,ZeroDivisionError) as m:
   print("############Inavalid input ###############",m)
   no=int(input("Enter how many Elements :"))
   a=int(input("Enter Element :"))
   div=a
   for i in range(no-1):
     a=int(input("Enter Element :"))
     div/=a
   print("Division :",div)
def adda(a):
 try:
     sum=int(input("Enter Element :"))
     sum+=a
     print("\033[1mTOTAL :\033[0m",sum)
     sign=input("operator:")
     if sign=='+':
      adda(sum)
     elif sign=="-":
      suba(sum)
     elif sign=="*":
      mula(sum)
     elif sign=="/":
      diva(sum)
     elif sign=="=":
       exit(0)
 except ValueError as m:
     print("############# Invalid input ################\n",m)
     sum=int(input("Enter Element :"))
     sum+=a
     print("\033[1mTOTAL :\033[0m",sum)
     sign=input("operator:")
     if sign=='+':
      adda(sum)
     elif sign=="-":
      suba(sum)
     elif sign=="*":
      mula(sum)
     elif sign=="/":
      diva(sum)
     elif sign=="=":
       exit(0)

def suba(a):
 try:   
     sub=int(input("Enter Element :"))
     a-=sub
     print("\033[1mTOTAL :\033[0m",a)
     sign=input("operator:")
     
     if sign=='+':
      adda(a)
     elif sign=="-":
      suba(a)
     elif sign=="*":
      mula(a)
     elif sign=="/":
      diva(a)
     elif sign=="=":
       exit(0)
 except ValueError as m:
     print("############# Invalid input ################\n",m)
     sub=int(input("Enter Element :"))
     a-=sub
     print("\033[1mTOTAL :\033[0m",a)
     sign=input("operator:")
     
     if sign=='+':
      adda(a)
     elif sign=="-":
      suba(a)
     elif sign=="*":
      mula(a)
     elif sign=="/":
      diva(a)
     elif sign=="=":
       exit(0)
def mula(a):
 try:
     mul=int(input("Enter Element :"))
     a*=mul
     print("\033[1mTOTAL :\033[0m",a)
     sign=input("operator:")
    
     if sign=='+':
      adda(a)
     elif sign=="-":
      suba(a)
     elif sign=="*":
      mula(a)
     elif sign=="/":
      diva(a)
     elif sign=="=":
       print("\033[1mTOTAL :\033[0m",a)
       exit(0)
