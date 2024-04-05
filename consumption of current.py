#consumption of current, relative cost with expected prices
#written by : SRINADHCH07


#Modern calcuation

mn=input("Enter Meter no:")
cn=input("Enter consumer name :")
omr=float(input("Enter opening meter reading :"))
cmr=float(input("Enter closing meter reading :"))
u=cmr-omr
print("Name :",cn)
print("Meter No :",mn)
print("Units : ",u)
if u<100 :
   print("COST :",u*0.5)
elif u>=100 and u<250:
   a=99*0.5
   b=(u-99)*1.0
   print("COST :",a+b)
elif u>=250 and u<500 :
   a=99*0.5
   b=150*1.0
   c=(u-249)*1.5
   print("COST :",a+b+c)
elif u>=500:
   a=99*0.5
   b=150*1.0
   c=250*1.5
   d=(u-499)*2.0
   print("COST :",a+b+c+d)
   


#python
