package com;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by bvue0 on 10/10/2016.
 */
public class TemperatureConversionsTest {
    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celciusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("The conversion failed.", celciusToFahrenheitResult, BigDecimal.valueOf(32));
    }

    @Test
    public void getWindChill() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillResult = service.windChillInFahrenheit(BigDecimal.valueOf(40), BigDecimal.valueOf(5));
        assertEquals("The conversion failed.", windChillResult, BigDecimal.valueOf(33.21799988));
    }


    @Test
    public void getFahrenheitFromCelcius() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheit = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals("The conversion failed.", fahrenheit, BigDecimal.valueOf(0));
    }

}