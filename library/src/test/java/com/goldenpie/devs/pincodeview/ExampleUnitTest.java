package com.goldenpie.devs.pincodeview;

import org.junit.Test;

import static org.junit.Assert.*;

import static junit.framework.Assert.assertEquals;

/**
 * Created by rakesh on 13-Jun-17.
 */

public class ExampleUnitTest
{
    @Test
    public void someTest() throws Exception
    {
        new PinCodeView().setPasswordManually('C');
    }

    @Test
    public void addition_isCorrect() throws Exception
    {
        assertEquals(4, 2 + 2);
    }
}