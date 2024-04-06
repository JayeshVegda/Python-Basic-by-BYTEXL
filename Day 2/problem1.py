month = int(input("Enter Number of Month : ")) 

try:
    if(month<=12):
        if (2 == month):
            year = int(input("Enter Number of Year : "))
            if((year%4) == 0):
                print('This is Leap Year so Day are 29')
            else:
                print('This is not leap year so Day are 28')
        elif(month in [4,6,9,11]):
            print("This month have 31 Days")
        else:
            print("This month have 30 days only")
    else:
        print("Month is not Valid")


except e:
    print("Error Occure", e)