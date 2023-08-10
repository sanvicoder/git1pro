import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ATM
{
    public static void main(String args[])throws IOException
    {
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(read);
int balance=1000000;
int withdraw,deposit;
int choice;
while(true)
{
System.out.println("Automated Teller Machine");  
System.out.println("Choose 1 for Withdraw");  
System.out.println("Choose 2 for Deposit");  
System.out.println("Choose 3 for Check Balance");  
System.out.println("Choose 4 for EXIT");  
System.out.print("Choose the operation you want to perform:");  
choice=Integer.parseInt(input.readLine());
switch(choice)
{
    case 1:
        System.out.print("Enter money to be withdrawn:"); 
        withdraw=Integer.parseInt(input.readLine());
        if(balance>=withdraw)
        {
            balance=balance-withdraw;
            System.out.println("Please collect your money");  
        }
        else
        System.out.println("Insufficient Balance");
        System.out.println(""); 
        break;
    case 2:
        System.out.print("Enter money to be deposited:");  
        deposit =Integer.parseInt(input.readLine());
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully deposited");  
        System.out.println("");  
        break;  
    case 3:
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;
    case 4:
        System.exit(0);
        break;
        default: System.out.println("Invalid choice");
}
}
}
}