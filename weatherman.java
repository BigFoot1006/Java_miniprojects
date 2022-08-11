package section_six;
import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class weatherman {
    public static void main(String[] args) {
        double[] celsiusTemperatures = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] farenheitTemperature = new double[celsiusTemperatures.length];
        for(int i = 0; i < celsiusTemperatures.length; i++) {
            farenheitTemperature[i] = celsiusToFarenheit(celsiusTemperatures[i]);
            System.out.println(i + ". " + "Celsius temp: " + celsiusTemperatures[i] + "\t Farenheit temp: " + farenheitTemperature[i]);
        }
    }
    /**
     * function name celsiusToFarenheit 
     * 
     * @param celsius
     * @return (double)
     * Inside the function 
     * 1. transform celsius temperatures into farenheit degrees
     * 3. return farenheit degrees
     */
    public static double celsiusToFarenheit (double celsius) {
        return (celsius/5*9) + 32;
    }
}
