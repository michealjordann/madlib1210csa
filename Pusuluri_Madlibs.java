import java.util.Scanner;

public class Pusuluri_Madlib {
    public static void main(String[] args) {

        String sentence = "I went to a <noun> to see <plural noun>. I <adjective> started to <verb> after I got a call from my <noun>";
        System.out.println(sentence);
        Scanner sc = new Scanner(System.in);

        // user input with scanner
        System.out.println("Type in your noun to replace <noun>.");
        String noun = sc.nextLine();
        System.out.println("Type in your plural noun to replace <plural noun>.");
        String pnoun = sc.nextLine();
        System.out.println("Type in your adjective to replace <adjective>.");
        String adj = sc.nextLine();
        System.out.println("Type in your verb to replace <verb>.");
        String verb = sc.nextLine();
        System.out.println("Type in your noun to replace the second <noun>.");
        String noun2 = sc.nextLine();

        // parse and replace
        int start = sentence.indexOf("<noun>");
        int end = start + "<noun>".length();
        sentence = sentence.substring(0, start) + noun + sentence.substring(end);
        start = sentence.indexOf("<plural noun>");
        end = start + "<plural noun>".length();
        sentence = sentence.substring(0, start) + pnoun + sentence.substring(end);
        start = sentence.indexOf("<adjective>");
        end = start + "<adjective>".length();
        sentence = sentence.substring(0, start) + adj + sentence.substring(end);
        start = sentence.indexOf("<verb>");
        end = start + "<verb>".length();
        sentence = sentence.substring(0, start) + verb + sentence.substring(end);
        start = sentence.indexOf("<noun>");
        end = start + "<noun>".length();
        sentence = sentence.substring(0, start) + noun2 + sentence.substring(end);

        System.out.println(sentence);
        sc.close();
    }
}
