# to read the marks of 5 subject thorugh the keyword. find out the affregate and percentage og mark obtained bby the students

sname = input("Enter Your Name : ")
s1 = int(input("Math Score : "))
s2 = int(input("Python Score : "))
s3 = int(input("Java Score : "))
s4 = int(input("ADBMS Score : "))
s5 = int(input("DSA Score : "))
total = s1+s2+s3+s4+s5
pert = (total/500) * 100

if(s1<=100 or s2<=100 or s3<=100 or s4<=100 or s5 <= 100):
    
    print("Total Marks Obtain is ", total, " out of 500")
    print("Percentage obtain by ", sname ," is ", pert)
else:
    print("INVALID INPUT in Marks")


if(pert>90 and pert<100):  
    print("A")
elif(pert>60 and pert<90): 
    print("B")
elif(pert>40 and pert<60): 
    print("c")
else:
    print("Failed")

