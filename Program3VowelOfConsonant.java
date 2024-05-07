import java.util.Scanner;

public class Program3VowelOfConsonant {

    public void vowelOfCon()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input an Alphabet : ");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <=90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <=122;
        boolean vowels = input.equals("a") || input.equals("A")||input.equals("e")||
                input.equals("E")||input.equals("i")
                ||input.equals("I")||input.equals("o")||input.equals("O")||input.equals("u")||input.equals("U");
        if(input.length()>1)
        {
            System.out.println("Error:  Not a single Character");
        } else if (!(uppercase||lowercase))
        {
            System.out.println("Error:  not a letter. Enter uppercase or lower case letter.");
        } else if (vowels)
        {
            System.out.println("Input letter is vowel");
        } else
        {
            System.out.println("input letter is consonant");
        }
    }


    public static void main(String[] args) {
        Program3VowelOfConsonant obj = new Program3VowelOfConsonant();
       obj.vowelOfCon();
    }
}
