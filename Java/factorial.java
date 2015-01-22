import java.util.Scanner;
public class factorial
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Hey man! Give me a number and I'll return you the factorial.");
        String factorial_of_string = read.nextLine();
        try
        {
            int factorial_of = Integer.parseInt(factorial_of_string);
            int result = 1;
            for(int i = 1; i <= factorial_of; i++)
            {
                result *= i;
            }
            System.out.println("The factorial of " + factorial_of + " is = " + result);
        }
        catch(Exception error)
        {
            System.out.println("I asked you for a number...");
        }
    }
}
