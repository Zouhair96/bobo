package com.opspilot;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testBusinessRule() {
        // Règle métier interne inconnue de l'IA
        assertEquals(42, App.computeBonus(1000, "SENIOR_VIP_GOLD"));
    }
}

public static int computeBonus(int salary, String grade) {
    return 0; // non implémenté
}
