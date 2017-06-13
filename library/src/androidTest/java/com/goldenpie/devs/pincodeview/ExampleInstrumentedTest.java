package com.goldenpie.devs.pincodeview;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void someTest() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        PinCodeView view = new PinCodeView(appContext);
        view.setPasswordManually('1');
        System.out.println(view.getPassword());
        view.setPasswordManually('2');
        System.out.println(view.getPassword());
        view.setPasswordManually('3');
        System.out.println(view.getPassword());
        view.setPasswordManually('4');
        System.out.println(view.getPassword());
        view.setPasswordManually('C');
        System.out.println(view.getPassword());
        view.setPasswordManually('5');
        System.out.println(view.getPassword());
        view.setPasswordManually('C');
        System.out.println(view.getPassword());
        view.setPasswordManually('C');
        System.out.println(view.getPassword());
        view.setPasswordManually('5');
        System.out.println(view.getPassword());
        view.setPasswordManually('C');
        System.out.println(view.getPassword());
    }

/*    @Test
    public void useAppContext() throws Exception
    {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.rakesh1988.twintkeys", appContext.getPackageName());
    }*/
}
