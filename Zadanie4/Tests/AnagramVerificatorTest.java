import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AnagramVerificatorTest {

    AnagramVerificator anagramVerificator = new AnagramVerificator();

    @ParameterizedTest
    @CsvSource({
            "Silent, Listen, True",
            "abc, bba, False",
            "races, cares, True",
            "abadgarsfwqarfara, wwwr, False",
            "dad, dda, True",
            ", test, False",
            "test, , False",
            ", , True",
            "\"\",\"\", True",
            "\"\",test, False"
    })
    void isAnagram(String inputText1, String inputText2, Boolean expectedResult) {

        Boolean actualResult = anagramVerificator.isAnagram(inputText1, inputText2);

        assertEquals(expectedResult, actualResult);

    }
}