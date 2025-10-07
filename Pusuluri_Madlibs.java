import java.util.Scanner;

public class Pusuluri_Madlib
{
    public static void main(String[] args)
    {
        // setup, initialize scanner
        String sentence = "I went to the zoo to see a <noun>. There were people <verb> around the enclosure which made the <adjective> apes go bananas.";
        System.out.println(sentence);
        Scanner sc = new Scanner(System.in);
        
        // get replacements using scanner
        System.out.println("Type in your noun to replace <noun>.");
        String noun = sc.nextLine();
        System.out.println("Type in your verb to replace <verb>.");
        String verb = sc.nextLine();
        System.out.println("Type in your adjective to replace <adjective>.");
        String adj = sc.nextLine();

        // parse with replace method
        sentence = sentence.replace("<noun>", noun);
        sentence = sentence.replace("<verb>", verb);
        sentence = sentence.replace("<adjective>", adj);
        System.out.println("Your new sentence: " + sentence);

        sc.close();
    }
}
