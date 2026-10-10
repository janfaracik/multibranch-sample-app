package com.planetpope.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testFailure() {
        assertFalse(true);
    }

    @Test
    void testFailure2() {
        assertFalse(false);
    }

    @Test
    void testFailure3() {
        assertFalse(false);
    }

    @Test
    void testFailure4() {
        assertFalse(true);
    }

    @Test
    void testFailure5() {
        assertFalse(true);
    }

    @Test
    void testFailure6() {
        assertFalse(false); // Fixed: was assertFalse(true)
    }

    @Test
    void testPassingChangedToFail() {
        assertTrue(false); // Intentionally fails
    }

    @Test
    @Disabled("Skipped intentionally")
    void testSkipped() {
        assertTrue(true);
    }
}
