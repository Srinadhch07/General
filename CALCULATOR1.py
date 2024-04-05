#written by :SRINADHCH07
#CODE : CALCULATOR 
print("""\033[1;32;40mAddition (+)
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
 except ValueError as m:
     print('******Inavalid input*******\n',m) 
     mul=int(input("Enter Element :"))
     a*=mul
     print("Total :",a)
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


def diva(a):
 try:
     div=int(input("Enter Element :"))
     a/=div
     print("Total :",a)
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
 except ZeroDivisionError as m:
     print("******Zero Divison Error*******\n",m)
     div=int(input("Enter Divisor :"))
     a/=div
     print("Total :",a)
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

def all():
 try:
   no=1 
   print("\033[1;32;40m||||||||| MULTIPLE OPERATORS |||||||||||\033[0m")
   for i in range(no):
     a=int(input("Enter Element :"))
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
     else:
       print("*******Inavalid choice*****")
       all()
 except ValueError as m:
   print('******Inavalid input*******\n',m) 
   no=1 
   for i in range(no):
     a=int(input("Enter Element :"))
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
try:
 sel=int(input("Enter N0::"))
 def one():
  if sel==1:     
   print("\033[1;32;40m||||||||| SINGLE OPERATOR |||||||||||\033[0m")
   op=input("CHOOSE OPERATOR:")
    
   if op=='+':
    add()
   elif op=="-":
    sub()
   elif op=="*":
    mul()
   elif op=="/":
    div()
   else:
    print("Invalid choice")
    one()
  elif sel==2:
    all()
  else:
    one()
except ValueError as m:
   print("**** Invalid input ****\n",m)
   sel=int(input("Enter N0::"))
   if sel==1:     
     print("||||||||| SINGLE OPERATOR |||||||||||")
     op=input("CHOOSE OPERATOR:")
    
     if op=='+':
      add()
     elif op=="-":
      sub()
     elif op=="*":
      mul()
     elif op=="/":
      div()
     else:
      print("Invalid choice")
      one()
   elif sel==2:
    all()
   else:
     one()

one()

