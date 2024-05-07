import java.util.Scanner;

public class Program6Triangle {

    public static void triangleNum()
    {
        int i,j,n;
        System.out.println("input number of rows :  ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();

        for(i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        triangleNum();
    }

}
