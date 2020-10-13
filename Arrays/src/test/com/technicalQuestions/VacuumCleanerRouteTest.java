package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VacuumCleanerRouteTest {
    VacuumCleanerRoute vacuumCleanerRoute = new VacuumCleanerRoute();
    String[] testStrings = new String[]{"LR", "URURD", "RUULLDRD"};

    @Test
    void VacuumCleanerRouteTest1() {
        assertTrue(vacuumCleanerRoute.vacuumCleanerRoute(testStrings[0]));
    }

    @Test
    void VacuumCleanerRouteTest2() {
        assertFalse(vacuumCleanerRoute.vacuumCleanerRoute(testStrings[1]));
    }

    @Test
    void VacuumCleanerRouteTest3() {
        assertTrue(vacuumCleanerRoute.vacuumCleanerRoute(testStrings[2]));
    }
}
