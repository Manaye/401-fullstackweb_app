package com.fullstackweb_app.fullstackweb_app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldControllerTest {
    @Test
    public void testCapitalizeString(){
        assertEquals("This should be capitalized", "THIS SHOULD BE CAPITALIZED", HelloWorldController.capitalizeString("this should be capitalized"));



    }

}
