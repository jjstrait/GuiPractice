package guitempconverter;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;


/**
 * Singleton uility class to simplify managing and using dates and times, 
 * using the new Java Date/Time API (Past JDK 8). Fields are
 *
 * 
 * @author jstra
 * @version 1.00
 */
public class TempUtlilties {

    private static TempUtlilties instance;

    private TempUtlilties() {

    }
    /**
     * Gets the instance of DateUtilities so only one object is made at a time.
     * @return 
     */
    public static TempUtlilties getInstance() {
        if (instance == null) {
            instance = new TempUtlilties();
        }

        return instance;
    }
    /**
     * 
     * @param temp
     * @return a double
     * converts Fahrenheit to Celsius using double as and input
     * @throws IllegalArgumentException 
     */
    public double ConvertFahrenheitToCelsius(double temp) throws IllegalArgumentException{
         if (temp < -459.67) {
            throw new IllegalArgumentException(" Not Real Tempature");
        }
        double cel = (temp-32)/1.8;
        return cel;
    }
    /**
     * 
     * @param temp
     * @return a double
     * converts Fahrenheit to Celsius using double as and input
     * @throws IllegalArgumentException 
     */
    public double ConvertFahrenheitToCelsius(String temp) throws IllegalArgumentException {
        if(!isDouble(temp)){
            throw new IllegalArgumentException("Not a #");
        }
        double input =Double.parseDouble( temp );
         if (input < -459.67) {
            throw new IllegalArgumentException(" Not Real Tempature");
        }
        double cel = (input-32)/1.8;
        return cel;
    }
    public double ConvertToKelvin(String temp) throws IllegalArgumentException {
        if(!isDouble(temp)){
            throw new IllegalArgumentException("Not a #");
        }
        double input =Double.parseDouble( temp );
         if (input < -459.67) {
            throw new IllegalArgumentException(" Not Real Tempature");
        }
        double cel = (input-32)/1.8;
        return cel;
    }
     private boolean isDouble(String str){
     try{
        Double.parseDouble( str );
        return true;
     }catch( Exception e ){
        return false;
        }
    }
}
    
    
   
    

   
   
    
    
    
    
    
    
    
   
    
   
   
    
  
    

