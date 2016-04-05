package com.goit.gojavaonline;

public class TemperatureCalculator {
    public static double fahrenheitToCelsiusConverter(double fahrenheitDegrees){
        double celsiusDegrees = (5.0/9) * (fahrenheitDegrees - 32);
        return celsiusDegrees;
    }

    public static double celsiusToFahrenheitConverter(double celsiusDegrees){
        double fahrenheitDegrees = (9.0/5) * celsiusDegrees + 32;
        return fahrenheitDegrees;
    }
}
