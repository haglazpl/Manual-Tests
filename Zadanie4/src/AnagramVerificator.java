import java.util.Arrays;

public class AnagramVerificator {
    // Method for sorting input string
    private String sortString(String inputString)
    {
        char tempArray[] = inputString.toLowerCase().toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    // Method for checking if two input strings are anagrams
    public Boolean isAnagram(String text1, String text2) {
        if(text1 == null && text2 == null) {
            return true;
        }
        if(text1 == null || text2 == null) {
            return false;
        }
        String firstString = sortString(text1);
        String secondString = sortString(text2);

        return firstString.equals(secondString);
    }
}
