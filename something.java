import java.util.Scanner;

public class MadLib
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Fill in the blanks! Start with a singular noun.");
    String noun = sc.nextLine();
    System.out.println("Nice! Now a plural noun.");
    String pnoun = sc.nextLine();
    System.out.println("Now finally, an integer!");
    int num = sc.nextInt();   
  }
}

public class Parse(noun, pnoun, num)
{
  String sentence = "I went to the animal (noun); the (plural noun) and the (number) beasts were there.";

  public parse(String sentence)
  {
    System.out.println(sentence.substring(0, 21) + noun);
  }

}

  

