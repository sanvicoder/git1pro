import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Numbergame
{
    public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(read);
int num,guess,i,j=5;
System.out.println("Welcome to the Number Guessing game");
num=1 + (int)(100* Math.random());
System.out.println("A number is chosen"+ " between 1 to 100."+ "Guess the number"+ " within 5 trials.");
for(i=0;i<j;i++)
{
System.out.println("Guess the number");
guess=Integer.parseInt(input.readLine());
if(num==guess)
{
System.out.println("Congratulations, You have won the game");
break;
}
else if(num>guess&&i!=j-1)
{
System.out.println("The number is "+ "greater than " + guess);
}
else if(num<guess&&i!=j-1)
{
System.out.println("The number is "+ "less than " + guess);
}
}
if(i==j)
{
System.out.println("You have exhausted all the trials.");
System.out.println("The number was " + num);
}
}
}