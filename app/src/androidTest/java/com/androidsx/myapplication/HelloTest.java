package com.androidsx.myapplication;

import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;

@RunWith(AndroidJUnit4.class)
public class HelloTest {

    @Test
    public void testFoo() {
        assertEquals("ola ke ase", "ola ke ase");
    }

    @Test
    public void testBar() {
        assertNotSame("ola ke ase", "hola que haces");
    }

    @Test
    public void testFailingOne() {
        assertEquals("one", "1");
    }

    @Test
    public void testFailingTwo() {
        assertEquals("two", "2");
    }

    @Test
    public void testPassingThree() {
        assertEquals("three", "three");
    }
}
