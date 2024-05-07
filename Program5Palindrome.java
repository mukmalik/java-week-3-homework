import java.util.Scanner;

public class Program5Palindrome {

    public static boolean isPalindrome(int number)
    {

        int reverse = 0;
        int original = number;
        while (number !=0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }

        if(original==reverse)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Please enter:   ");
        int ent = obj.nextInt();
        boolean a = isPalindrome(ent);

        System.out.println("result "+a);
        obj.close();;
    }
}
