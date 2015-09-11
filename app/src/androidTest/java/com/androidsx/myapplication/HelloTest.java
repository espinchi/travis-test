package com.androidsx.myapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

public class HelloTest extends ActivityInstrumentationTestCase2<GooglePlayServicesActivity> {

    public HelloTest() {
        super(GooglePlayServicesActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SmallTest
    public void testFoo() {
        assertEquals("ola ke ase", "ola ke ase");
    }

    /*public void testBar() {
        assertEquals("ola ke ase", "hola que haces");
    }*/
}
