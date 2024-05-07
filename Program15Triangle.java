import java.util.Scanner;

public class Program15Triangle {

    public static void triangleMethod() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = obj.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        obj.close();
    }

    public static void main(String[] args) {
        triangleMethod();
    }

}