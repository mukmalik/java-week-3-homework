import java.util.Scanner;

public class Program11EvenDigitSum {


    public static int getEvenDigitSum(int number) {
        int originalNumber = number;
        int lastDigit;
        int sumOfEvenDigits = 0;
        if (number >= 0) {
            while (number > 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sumOfEvenDigits += lastDigit;
                }
                number /= 10;
            }
            if (originalNumber >= 0) {
                System.out.print("The sum of even digits within a number " + originalNumber + " is equal to:");
            }
            return sumOfEvenDigits;
        }
        System.out.println("Invalid input:");
        return -1;
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number to get sum of even number :  ");
        int x = obj.nextInt();

        int a = getEvenDigitSum(x);
        System.out.println(a);
        obj.close();;
    }
}
