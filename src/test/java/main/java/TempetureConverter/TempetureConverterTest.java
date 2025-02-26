package main.java.TempetureConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import TempetureConverter.TempetureConverter;

public class TempetureConverterTest {
    @Test
    void testCelsiusToFahrenheit() {
        TempetureConverter t = new TempetureConverter();
        double result = t.celsiusToFahrenheit(10.0);
        assertEquals(42.0, result);
    }

    @Test
    void testFahrenheitToCelsius() {
        TempetureConverter t = new TempetureConverter();
        double result = t.fahrenheitToCelsius(50.0);
        assertEquals(10.0, result);
    }

    @Test
    void testkelvinToFah() {
        TempetureConverter t = new TempetureConverter();
        double result = t.kelvinToFah(10.0);
        assertEquals(-231.0, result);
    }

    @Test
    void testIsExtremeTemperatureFalse() {
        TempetureConverter t = new TempetureConverter();
        boolean result = t.isExtremeTemperature(25.0);
        assertEquals(false, result);
    }

    @Test
    void testIsExtremeTemperatureTrue() {
        TempetureConverter t = new TempetureConverter();
        boolean result = t.isExtremeTemperature(1000.0);
        assertEquals(true, result);
    }

    @Test
    void testIsExtremeTemperatureTrue2() {
        TempetureConverter t = new TempetureConverter();
        boolean result = t.isExtremeTemperature(-1000.0);
        assertEquals(true, result);
    }

    
}

// VIET TRAN
