package com;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CentimeterTest {
    CentiMeter centiMeter1;
    CentiMeter centiMeter2;
    @Before
    public void setUp() throws Exception {
        centiMeter1 = new CentiMeter(100);
        centiMeter2 = new CentiMeter(200);
    }

    @Test
    public void testAdd() throws Exception {
        Length length = centiMeter1.add(centiMeter2);
        assertThat((CentiMeter) length, is(new CentiMeter(300)));
    }

    @Test
    public void testSubtract() throws Exception {
        Length length = centiMeter1.subtract(centiMeter2);
        assertThat((CentiMeter) length, is(new CentiMeter(-100)));
    }

    @Test
    public void testToMeter() throws Exception {
       Meter meter = centiMeter1.toMeter();
        assertThat(meter, is(new Meter(1)));

    }
}
