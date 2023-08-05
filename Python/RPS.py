import random
user_choice=int(input("Enter the choice 0 for Rock, 1 for Paper and 2 for Scissors."))
if user_choice >=3 or user_choice<0 :
    print("You entered the wrong number")
else:
        comp_choice=random.randint(0,2)
        print("computer choice")
        print(comp_choice)
        if comp_choice == user_choice:
            print("Draw")
        elif comp_choice ==0 and  user_choice==2 :
            print("You lose")
        elif comp_choice ==2 and  user_choice==0:
            print("You win")
        elif comp_choice > user_choice:
            print("You lose")
        elif comp_choice < user_choice:
            print("You win")
