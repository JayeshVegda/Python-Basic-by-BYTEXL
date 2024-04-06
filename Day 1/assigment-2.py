# An ATM containes indian currence of 100, 500, 1000. To withdraw cash from this ATM, the user had to enter no O noted he/she wants of each currency
# EX: 100,500,1000. write a program to calculete the total ammount with drawn by the person from the ATM

ammount = int(input("Enter the Ammount : ")) # 1600

t_1000 = ammount//1000
ammount = ammount - (t_1000 * 1000)
t_500 = ammount//500
ammount = ammount - (t_500 * 500)
t_100 = ammount//100
ammount = ammount - (t_100 * 100)
ammount = None
print("Thousand Notes : ", t_1000)
print("Five Hundred Notes : " , t_500)
print("Hundreds Notes : " , t_100)



