package com.test.bootstrap.integration;

import org.junit.Test;

import static io.restassured.RestAssured.get;
import static org.apache.http.HttpStatus.SC_OK;
import static org.junit.Assert.assertEquals;

public class RestAssuredTest {

    @Test
    public void shouldREturnOkWhenGoogleWorks() {
        assertEquals(SC_OK, get("https://google.com").statusCode());
    }

}