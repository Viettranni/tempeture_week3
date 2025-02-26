package src.main.java.TempetureConverter;

public class TempetureConverter {
    private double celcius;
    private double fahrenheit;


    // Converting the Fahrenheit to Celcius
    public double fahrenheitToCelsius(double fahrenheit) {
        celcius = (fahrenheit - 32) * 5/9;
        return celcius;
    }

    // Converting the Celcius to Fahrenheit
    public  double	kelvinToFah(double kel) {
		return Math.round((kel-273.15)* (9/5) + 32);
	}

    public double celsiusToFahrenheit(double celcius) {
        fahrenheit = (9/5 * celcius) + 32;
        return fahrenheit;
    }

    public boolean isExtremeTemperature(double celcius) {
        if (celcius > 50.0) {
            return true;
        } else if ( celcius < -40.0) {
            return true;
        } 
        return false;
    }
}
