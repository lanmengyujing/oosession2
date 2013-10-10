package com;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MeterTest {
    Meter meter1;
    Meter meter2;
    CentiMeter centiMeter;

    @Before
    public void setUp() throws Exception {
        meter1 = new Meter(1);
        meter2 = new Meter(2);
        centiMeter = new CentiMeter(300);
    }

    @Test
    public void testAddWithSameUnit() throws Exception {
        Length length = meter1.add(meter2);
        assertThat((Meter) length, is(new Meter(3)));
    }

    @Test
    public void testSubtract() throws Exception {
        Length length = meter1.subtract(meter2);
        assertThat((Meter) length, is(new Meter(-1)));
    }

    @Test
    public void testAddWithDifferentUnit() throws Exception {
        Length length = meter1.add(centiMeter);
        assertThat((Meter) length, is(new Meter(4)));
    }

    @Test
    public void testSubWithDifferentUnit() throws Exception {
        Length length = meter1.subtract(centiMeter);
        assertThat((Meter) length, is(new Meter(-2)));
    }


}
