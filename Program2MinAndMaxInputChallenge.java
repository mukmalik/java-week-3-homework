import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program2MinAndMaxInputChallenge {

    public static void maxMinMethod()
    {
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;

        int i = input.nextInt();
        while (i>0)
        {
            sum +=i;
            list.add(i);
            i=input.nextInt();
        }

        System.out.println("You have entered total            : "+list.size()+"  digits.");
        System.out.println("Minimum value you have entered is : "+ Collections.min(list));
        System.out.println("Maximum valye you have entered is : "+ Collections.max(list));
        input.close();
    }

    public static void main(String[] args) {
        maxMinMethod();
    }
}
