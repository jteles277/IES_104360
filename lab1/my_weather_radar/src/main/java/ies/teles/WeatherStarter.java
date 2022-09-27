package ies.teles;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ies.teles.IpmaCityForecast; //may need to adapt package name
import ies.teles.IpmaService;

/**
 * demonstrates the use of the IPMA API for weather forecast
 */
public class WeatherStarter {

    // Set up loggers
    private static final Logger logger = LogManager.getLogger(WeatherStarter.class);

    //todo: should generalize for a city passed as argument
    private static final int CITY_ID_AVEIRO = 1010500;

    public static void  main(String[] args ) {


       
		


        int code;
        if(args.length >= 1){
            code = Integer.parseInt(args[0]); 
        }else {
            System.out.println("Invalid Code!");
            code = CITY_ID_AVEIRO;
            logger.warn("Invalid Code Given");
        }
            

        // get a retrofit instance, loaded with the GSon lib to convert JSON into objects
        
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        logger.info(" Got a retrofit instance "); 

        // create a typed interface to use the remote API (a client)
        IpmaService service = retrofit.create(IpmaService.class);
        // prepare the call to remote endpoint
        Call<IpmaCityForecast> callSync = service.getForecastForACity(code);
        logger.info(" Got ForecastForACity with code: " + code); 

        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

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
