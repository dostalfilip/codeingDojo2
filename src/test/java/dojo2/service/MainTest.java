package dojo2.service;

import kotlin.Pair;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainTest {

    @Test
    void internalModelTest() {
        String str1 = "XXIV";
        String str2 = "XLVII";
        Pair<String, String> result = RunService.extracted(str1, str2);
        Pair<String, String> example = new Pair("XXIIII","XXXXVII");
        assertEquals(result, example);
    }
}
