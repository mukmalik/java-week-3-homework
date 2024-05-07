import java.util.Scanner;

public class Program9Fibonacci {
    public static void fibonacciNumber(int number)
    {
        int firstTerm = 1;
        int secondTerm = 1;
        System.out.println("Fibonacci Series till " + number + " terms:");

        for(int i=1;i<=number;++i)
        {
            System.out.print(firstTerm+", ");

            int nextTerm = firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter how many : ");

        int a = obj.nextInt();

        fibonacciNumber(a);
        obj.close();
    }

}
