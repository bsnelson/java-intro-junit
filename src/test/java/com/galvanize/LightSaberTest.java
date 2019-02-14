package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightSaberTest {

    final static int DEFAULT_JEDI_ID = 8675309;
    final static float DEFAULT_CHARGE_VALUE = 100.0f;
    final static String DEFAULT_COLOR_VALUE = "green";
    final static float DEFAULT_REMAINING_MINUTES = 300.0f;

    final static String TEST_COLOR_VALUE = "blue";
    final static float TEST_REMAINING_MINUTES = 298.0f;
    final static float TEST_USE_MINUTES = 4.0f;
    final static float TEST_CHARGE_VALUE = 53.0f;

    @Test
    public void itShouldCreateADefaultLightSaber() {
        //setup
        LightSaber lightSaber = new LightSaber(DEFAULT_JEDI_ID);
        //execution
        //assertion
        assertThat(lightSaber, instanceOf(LightSaber.class));
    }

    @Test
    public void itShouldReturnTheDefaultChargeValue() {
        //setup
        LightSaber lightSaber = new LightSaber(DEFAULT_JEDI_ID);
        //execution
        //assertion
        assertEquals(DEFAULT_CHARGE_VALUE, lightSaber.getCharge());
    }

    @Test
    public void itShouldSetThePassedChargeValue() {
        //setup
        LightSaber lightSaber = new LightSaber(DEFAULT_JEDI_ID);
        //execution
        lightSaber.setCharge(TEST_CHARGE_VALUE);
        //assertion
        assertEquals(TEST_CHARGE_VALUE, lightSaber.getCharge());
    }

    @Test
    public void itShouldReturnTheDefaultColorValue() {
        //setup
        LightSaber lightSaber = new LightSaber(DEFAULT_JEDI_ID);
        //execution
        //assertion
        assertEquals(DEFAULT_COLOR_VALUE, lightSaber.getColor());
    }

    @Test
    public void itShouldSetThePassedColorValue() {
        //setup
        LightSaber lightSaber = new LightSaber(DEFAULT_JEDI_ID);
        //execution
        lightSaber.setColor(TEST_COLOR_VALUE);
        //assertion
        assertEquals(TEST_COLOR_VALUE, lightSaber.getColor());
    }

    @Test
    public void itShouldReturnTheSerialNumber() {
        //setup
        LightSaber lightSaber = new LightSaber(DEFAULT_JEDI_ID);
        //execution
        //assertion
        assertEquals(DEFAULT_JEDI_ID, lightSaber.getJediSerialNumber());
    }

    @Test
    public void itShouldReturnDefaultRemainingMinutes() {
        //setup
        LightSaber lightSaber = new LightSaber(DEFAULT_JEDI_ID);
        //execution
        //assertion
        assertEquals(DEFAULT_REMAINING_MINUTES, lightSaber.getRemainingMinutes());
    }

    @Test
    public void itShouldDecrementEfficiencyWhenUsed() {
        //setup
        LightSaber lightSaber = new LightSaber(DEFAULT_JEDI_ID);
        //execution
        lightSaber.use(TEST_USE_MINUTES);
        //assertion
        assertEquals(TEST_REMAINING_MINUTES, lightSaber.getRemainingMinutes());
    }

    @Test
    public void itShouldRecharge() {
        //setup
        LightSaber lightSaber = new LightSaber(DEFAULT_JEDI_ID);
        //execution
        lightSaber.recharge();
        //assertion
        assertEquals(DEFAULT_CHARGE_VALUE, lightSaber.getCharge());
    }
}
