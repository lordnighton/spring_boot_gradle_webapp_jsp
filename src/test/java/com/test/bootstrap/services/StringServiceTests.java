package com.test.bootstrap.services;

import static org.junit.Assert.*;
import org.junit.*;

public class StringServiceTests {

    private StringService stringService = new StringService();

    @Test
    public void testStringService() {
        assertNotNull(stringService.returnString());
    }

}