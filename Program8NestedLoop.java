import java.util.Scanner;

public class Program8NestedLoop {

    public static void triangleLoop(int n)
    {


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("How many lines you want in triangle :  ");
        int x = obj.nextInt();

        triangleLoop(x);
        obj.close();;

    }
}
