import java.util.Scanner;

public class Program12Prime {

    public static void prime(int num)
    {
        //int num = 29;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int x = obj.nextInt();

        prime(x);
        obj.close();;

    }
}
