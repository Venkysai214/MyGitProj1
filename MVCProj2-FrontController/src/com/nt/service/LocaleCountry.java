package com.nt.service;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LocaleCountry  implements Handler {
	
	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		Locale [] locales=null;
		locales=Locale.getAvailableLocales();
		String country[]=null;
		
		country=Locale.getISOCountries();
		int i=0;
	    for(Locale lcl: locales){
	    	country=new String[locales.length];
	    	if(locales!=null)
	    	country[i]=lcl.getDisplayCountry();
	       req.setAttribute("countrylist", country);
	    
		
	    }
	    return "country";
	    }
}
