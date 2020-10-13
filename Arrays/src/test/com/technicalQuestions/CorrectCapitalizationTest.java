package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CorrectCapitalizationTest {
    CorrectCapitalization correctCapitalization = new CorrectCapitalization();
    String[] testStrings = new String[]{"USA", "Calvin","compUter","coding",};

    @Test
    void VacuumCleanerRouteTest1() {
        assertTrue(correctCapitalization.correctCapitalization(testStrings[0]));
    }

    @Test
    void VacuumCleanerRouteTest2() {
        assertTrue(correctCapitalization.correctCapitalization(testStrings[1]));
    }

    @Test
    void VacuumCleanerRouteTest3() {
        assertFalse(correctCapitalization.correctCapitalization(testStrings[2]));
    }

    @Test
    void VacuumCleanerRouteTest4() {
        assertTrue(correctCapitalization.correctCapitalization(testStrings[3]));
    }

    @Test
    void VacuumCleanerRouteTest5() {
        assertTrue(correctCapitalization.correctCapitalization2(testStrings[0]));
    }

    @Test
    void VacuumCleanerRouteTest6() {
        assertTrue(correctCapitalization.correctCapitalization2(testStrings[1]));
    }

    @Test
    void VacuumCleanerRouteTest7() {
        assertFalse(correctCapitalization.correctCapitalization2(testStrings[2]));
    }

    @Test
    void VacuumCleanerRouteTest8() {
        assertTrue(correctCapitalization.correctCapitalization2(testStrings[3]));
    }
}
