package ies.teles;

import ies.teles.IpmaCityForecast; //may need to adapt package name
import ies.teles.IpmaService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APICaller {
    

    Retrofit retrofit;
    IpmaService service;
    // get a retrofit instance, loaded with the GSon lib to convert JSON into objects  
    public APICaller() {
    
        retrofit = new Retrofit.Builder()
        .baseUrl("http://api.ipma.pt/open-data/")
        .addConverterFactory(GsonConverterFactory.create())
        .build(); 
        // create a typed interface to use the remote API (a client)
        IpmaService service = retrofit.create(IpmaService.class);
    }
    
    public IpmaCityForecast GetBody(int code){
        try { 
            
           
            // prepare the call to remote endpoint
            Call<IpmaCityForecast> callSync = service.getForecastForACity(code); 
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();
            return forecast; 
       
             
        } catch (Exception ex) { 
            ex.printStackTrace();
        }

        return null;
    }

    
}
