import java.util.Scanner;

public class Program1ReadingUserInputChallenge {

    public static void main(String[] args) {
        inputNumbers();
    }

    public static void inputNumbers()
    {
        Scanner scan = new Scanner(System.in);
        int y=1;
        int sum=0;

        while(y<=10) {
            System.out.print("Enter number "+y+"    :  ");

            boolean check = scan.hasNextInt();
            if (check) {
                // System.out.println("Enter number :"+y);
                int x = scan.nextInt();
                y++;
                sum += x;

            }
            else {
                System.out.println("invalid number");
            }
            scan.nextLine();


        }
        System.out.println("Sum of all the numbers entered is :"+sum);
        scan.close();;

    }
}
