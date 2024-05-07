import java.util.Scanner;

public class Program13SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2)
    {
        if (!isValid(num1) || !isValid(num2)) {
            return false;
        }

        // Extract the digits of num1 and num2
        int digit1_num1 = num1 % 10;
        int digit2_num1 = num1 / 10;
        int digit1_num2 = num2 % 10;
        int digit2_num2 = num2 / 10;

        // Check if any digit of num1 is equal to any digit of num2
        return (digit1_num1 == digit1_num2 || digit1_num1 == digit2_num2 ||
                digit2_num1 == digit1_num2 || digit2_num1 == digit2_num2);
    }

    // Method to check if a number is within the range of 10 (inclusive) to 99 (inclusive)
    public static boolean isValid(int num) {
        return (num >= 10 && num <= 99);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("please enter 1st number  :  ");
        int a = obj.nextInt();

        System.out.print("please enter 2nd number  :  ");
        int b = obj.nextInt();

        boolean sen = hasSharedDigit(a,b);
        System.out.println("Result  :   "+hasSharedDigit(a,b));
        obj.close();;

    }

}
