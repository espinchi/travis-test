package com.androidsx.myapplication;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class PlainTest {

    @Test
    public void passingTest() {
        assertEquals("hola", "hola");
    }

    @Test
    public void failingTest() {
        assertEquals("ola", "hola");
    }
}