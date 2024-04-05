#consumption of current, relative cost with expected prices 
#written by : SRINADHCH07

#olden calculation 

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
elif u>=100 and u<250 :
 print("COST :",u)
elif u>=250 and u<500 :
 print("COST :",u*1.5)
elif u>=500 :
 print("COST :",u*2)

#python
