import random
print("Welcome to the Password Generator")
alphabets=['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
numbers=['0','1','2','3','4','5','6','7','8','9']
symbols=['!','@','#','$','%','^','&','*','(',')']
numalpha=int(input("How many alphabets you want in the password?\n"))
num=int(input("How many numbers you want in the password?\n"))
numsym=int(input("How many symbols you want in the password?\n"))
password_list=[]
for i in range(1,numalpha+1):
    char=random.choice(alphabets)
    password_list+=char
for i in range(1,num+1):
    char=random.choice(numbers)
    password_list+=char
for i in range(1,numsym+1):
    char=random.choice(symbols)
    password_list+=char
random.shuffle(password_list)    
password=""
for char in password_list:
    password=password+char
print("The Password is:",password)    