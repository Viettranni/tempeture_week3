package TempetureConverter;

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

    public static void main(String[] args) {
        TempetureConverter converter = new TempetureConverter();
        
        // Example calls to the methods
        System.out.println("Fahrenheit to Celsius (50.0°F): " + converter.fahrenheitToCelsius(50.0));
        System.out.println("Celsius to Fahrenheit (10.0°C): " + converter.celsiusToFahrenheit(10.0));
        System.out.println("Kelvin to Fahrenheit (283.15K): " + converter.kelvinToFah(283.15));
        System.out.println("Is 100.0°C an extreme temperature? " + converter.isExtremeTemperature(100.0));
    }
}
