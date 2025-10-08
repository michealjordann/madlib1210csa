import java.util.Scanner;

public class Pusuluri_Madlib
{
    public static void main(String[] args)
    {
        // setup, initialize scanner
        String sentence = "I went to a <noun> to see <plural noun>. I <adjective> started to <verb> after the clock struck <int>";
        System.out.println(sentence);
        Scanner sc = new Scanner(System.in);
        
        // get replacements using scanner
        System.out.println("Type in your noun to replace <noun>.");
        String noun = sc.nextLine();
        System.out.println("Type in your plural noun to replace <plural noun>.");
        String pnoun = sc.nextLine();
        System.out.println("Type in your adjective to replace <adjective>.");
        String adj = sc.nextLine();
        System.out.println("Type in your verb to replace <verb>.");
        String verb = sc.nextLine();
        System.out.println("Type in your integer to replace <int>.");
        int eger = sc.nextInt();

        // parse and replace with replace method
        sentence = sentence.replace("<noun>", noun);
        sentence = sentence.replace("<plural noun>", pnoun);
        sentence = sentence.replace("<adjective>", adj);
        sentence = sentence.replace("<verb>", verb);
        // Users integer needs special treatment
        int intdex = sentence.indexOf("<int>");
        sentence = sentence.substring(0, intdex);
        System.out.println(sentence + eger);

        // close scanner
        sc.close();
    }
}
