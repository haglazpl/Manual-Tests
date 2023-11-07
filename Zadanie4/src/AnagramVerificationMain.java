import java.util.Scanner;

public class AnagramVerificationMain {

    public static void main(String[] args) {
        AnagramVerificator anagramVerificator = new AnagramVerificator();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please type first input: ");
        String firstInput = scan.nextLine();
        System.out.print("Please type second input: ");
        String secondInput = scan.nextLine();
        System.out.println(anagramVerificator.isAnagram(firstInput, secondInput)
                ? "Input strings are indeed anagrams"
                : "False, input strings are not anagrams"
        );
        scan.close();
    }
}