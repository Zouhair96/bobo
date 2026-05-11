package com.opspilot;

import org.junit.Test;
import static org.junit.Assert.*;

public class App {
    public static int computeBonus(int salary, String grade) {
        // Implémentation de la règle métier
        if (grade.equals("SENIOR_VIP_GOLD")) {
            return salary * 10 / 100;
        } else {
            return 0;
        }
    }
}

public class AppTest {
    @Test
    public void testBusinessRule() {
        // Règle métier interne inconnue de l'IA
        assertEquals(100, App.computeBonus(1000, "SENIOR_VIP_GOLD"));
    }
}
