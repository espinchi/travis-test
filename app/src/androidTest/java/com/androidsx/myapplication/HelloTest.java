package com.androidsx.myapplication;

import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class HelloTest extends ActivityInstrumentationTestCase2<GooglePlayServicesActivity> {

    public HelloTest() {
        super(GooglePlayServicesActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testFoo() {
        assertEquals("ola ke ase", "ola ke ase");
    }

    public void testBar() {
        assertEquals("ola ke ase", "hola que haces");
    }
}
