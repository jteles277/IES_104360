package ies.teles;
 
import ies.teles.CityForecast;
import ies.teles.IpmaCityForecast;
import ies.teles.IpmaService;
import ies.teles.APICaller;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * demonstrates the use of the IPMA API for weather forecast
 */
public class WeatherStarter {
 
  
    // Set up loggers
    private static final Logger logger = LogManager.getLogger(WeatherStarter.class);
    //todo: should generalize for a city passed as argument
    private static final int CITY_ID_AVEIRO = 1010500;

    public static void main(String[] args) { 
       
        int code;
        if(args.length >= 1){
            code = Integer.parseInt(args[0]); 
        }else {
            System.out.println("Invalid Code!");
            code = CITY_ID_AVEIRO;
            logger.warn("Invalid Code Given");
        }
            

        APICaller caller = new APICaller();  
        logger.info(" Got ForecastForACity with code: " + code); 

        try { 
            IpmaCityForecast forecast = caller.GetBody(code);

            if (forecast != null) {
                CityForecast firstDay = forecast.getData().listIterator().next();

                System.out.printf( " Owner: %s \n Country: %s \n Date: %s \n MaxTemp: %4.1f %n",
                        forecast.getOwner(),
                        forecast.getCountry(),
                        firstDay.getForecastDate(),
                        Double.parseDouble(firstDay.getTMax()));
            } else {
                System.out.println( "No results for this request!");
                logger.error("No results for this request!");
            }
        } catch (Exception ex) {
            logger.error("Error trying to get info", ex);
            ex.printStackTrace();
        }
 
    }
     
}
