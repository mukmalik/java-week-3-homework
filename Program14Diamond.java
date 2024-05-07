import java.util.Scanner;

public class Program14Diamond {

    public static void diamondMethod(int number)
    {
        int m=1;
        int n;

        while(m<=number) {
            n = 1;
            while (n++ <= number - m) {
                System.out.print(" ");
            }
            n = 1;


            while (n++ <= m * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            m++;
        }

        m=number-1;

        while (m>0)
        {
            n=1;
            while (n++ <=number -m)
            {
                System.out.print(" ");
            }
            n=1;

            while (n++ <=m*2-1)
            {
                System.out.print("*");
            }

            System.out.println();
            m--;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number of rows you want :  ");
        int d = obj.nextInt();

        diamondMethod(d);
        obj.close();
    }

}
