package com.opspilot;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testDivide() {
        assertEquals(5, App.divide(10, 2));
        assertEquals(3, App.divide(10, 0)); // va échouer — résultat attendu impossible
    }
}
