package com.androidsx.myapplication;

import android.test.ActivityInstrumentationTestCase2;

public class HelloTest extends ActivityInstrumentationTestCase2<GooglePlayServicesActivity> {

    public HelloTest() {
        super(GooglePlayServicesActivity.class);
    }

    public void testFoo() {
        assertEquals("ola ke ase", "ola ke ase");
    }

    /*public void testBar() {
        assertEquals("ola ke ase", "hola que haces");
    }*/
}
