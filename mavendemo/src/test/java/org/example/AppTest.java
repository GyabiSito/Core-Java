package org.example;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    public void givenANameWhenHelloThenReturnName(){
        App app = new App();
        String result=app.hello("Jose");
        Assert.assertNotNull(result);

    }
}
