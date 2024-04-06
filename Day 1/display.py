# write a program to take input from user student name, subject, marks. 

s_name = input("ENTER YOUR NAME : ")
s_subject = input("ENTER YOUR SUBJECT : ")
s_mark = int(input("ENTER YOUR MARK : "))
if(s_mark>100):
    print("Mark is not Valid... try again")
else:
    print("Name : ", s_name)
    print("Subject : ", s_subject)
    print("Mark : ", s_mark)