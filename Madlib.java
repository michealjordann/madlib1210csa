import java.util.Scanner;

public class MadLib
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String madlib = "I went to the animal (noun); the (plural noun) and the (number) beasts were there.";
    System.out.print(madlib + "\nFill in the blanks! Start with a singular noun.");
    String noun = sc.nextLine();
    System.out.println("Nice! Now a plural noun.");
    String pnoun = sc.nextLine();
    System.out.println("Now finally, an integer!");
    int num = sc.nextInt();
    System.out.println("Your sentence is: I went to the animal " + noun + "; the " + pnoun + " and the " + num + " beasts were there.");
    
  }
}
