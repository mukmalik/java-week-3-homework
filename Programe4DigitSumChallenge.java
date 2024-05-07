import java.util.Scanner;

public class Programe4DigitSumChallenge {
    public static int sumDigits(int number)
    {
        int sum;

        if(number>9)
        {
            int t= number%10;
            sum= t+t;
            number = number/10;
            return (sum);
        }
        else
        {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number :  ");
        int integer = in.nextInt();

       int a = sumDigits(integer);
        System.out.println("Output   :  "+a);
        in.close();


    }


}
