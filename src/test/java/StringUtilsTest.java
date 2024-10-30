import fr.diginamic.utils.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.diginamic.utils.StringUtils;

class StringUtilsTest {

    @Test
    void testLevenshteinDistance1() {
        int distance = StringUtils.levenshteinDistance("Chien", "Chien");
        assertEquals(0, distance);
    }

    @Test
    void testLevenshteinDistance2() {
        int distance = StringUtils.levenshteinDistance("Chien", "Chine");
        assertEquals(2, distance);
    }

    @Test
    void testLevenshteinDistance3() {
        int distance = StringUtils.levenshteinDistance("Chie", "Chien");
        assertEquals(1, distance);
    }

    @Test
    void testLevenshteinDistancePremierParamNull() {
        int distance = StringUtils.levenshteinDistance(null, "Chien");
        assertEquals(-1, distance);
    }

    @Test
    void testLevenshteinDistanceSecondParamNull() {
        int distance = StringUtils.levenshteinDistance("Chien", null);
        assertEquals(-1, distance);
    }

    @Test
    void testLevenshteinDistanceDeuxParamsNull() {
        int distance = StringUtils.levenshteinDistance(null, null);
        assertEquals(-1, distance);
    }

    @Test
    void testLevenshteinDistanceDeuxParamsVides() {
        int distance = StringUtils.levenshteinDistance("", "");
        assertEquals(0, distance);
    }

    @Test
    void testLevenshteinDistanceDeuxParamsAvecEspaces() {
        int distance = StringUtils.levenshteinDistance("  Chien ", "Chien");
        assertEquals(0, distance);
    }

    @Test
    void testLevenshteinDistanceMinMaj() {
        int distance = StringUtils.levenshteinDistance("Chien", "chien");
        assertEquals(0, distance);
    }

}