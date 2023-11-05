import java.util.Arrays;

public class AnagramVerificationApp {
    public void run(String text1, String text2) {
        checkIfAnagram(text1, text2);
    }

    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toLowerCase().toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    private void checkIfAnagram(String text1, String text2) {
        String firstString = sortString(text1);
        String secondString = sortString(text2);

        final String result = firstString.equals(secondString)
                ? "Strings are anagrams"
                : "False, strings are not anagrams";

        System.out.print(result);

    }
}
