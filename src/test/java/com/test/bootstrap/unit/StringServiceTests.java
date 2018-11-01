package com.test.bootstrap.unit;

import static org.junit.Assert.*;

import com.test.bootstrap.services.StringService;
import org.junit.*;

public class StringServiceTests {

    private StringService stringService = new StringService();

    @Test
    public void testStringService() {
        assertNotNull(stringService.returnString());
    }

}