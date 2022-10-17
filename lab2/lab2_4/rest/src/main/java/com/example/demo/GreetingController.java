package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController { 


	public List<Quote> quotes = new ArrayList<Quote>();
	public List<Show> shows = new ArrayList<Show>();

  	public GreetingController() {
		
		// Show 1 
		shows.add(new Show(1, "show1"));
		quotes.add(new Quote("quote1", 1));
		quotes.add(new Quote("quote2", 1)); 
		// Show 2 
		shows.add(new Show(2, "show2"));
		quotes.add(new Quote("quote3", 2));
		quotes.add(new Quote("quote4", 2));
		// Show 3 
		shows.add(new Show(3, "show3"));
		quotes.add(new Quote("quote5", 3));
		quotes.add(new Quote("quote6", 3));
	}
	 
	@GetMapping("/api/shows")
	public List<Show> shows() {
		  
		// return all shows in db 
		return shows;
	
	}
	@GetMapping("/api/quotes")
	public Quote quote_from_show(@RequestParam Integer show) {

		Quote q = null;

		  
		if (show >= shows.size()){
			return null;
		}

		if(show != null){
			
			
			Random random = new Random();
			int i = -1;
			while(i > -1 || quotes.get(i).getShow() != show)
				i = random.nextInt(quotes.size());

			return quotes.get(i);
			
		} 
		return random_quote();
	
	}

	@GetMapping("/api/quote")
	public Quote random_quote() {

		Quote q = null;

	 
		Random random = new Random();

		int i = random.nextInt(quotes.size());

		return quotes.get(i);
	
	}

}