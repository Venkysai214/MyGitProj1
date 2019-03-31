package com.nt.service;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LocaleLang  implements Handler {
	
	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		Locale [] locales=null;
		locales=Locale.getAvailableLocales();
		String lang[]=null;
	
		lang=Locale.getISOLanguages();
		int i=0;
	    for(Locale lcl: locales){
	    	lang=new String[locales.length];
	    	if(locales!=null)
	    	lang[i]=lcl.getDisplayLanguage();
	       req.setAttribute("langlist", lang);
	    
		
	    }
	    return "lang";
	    }
}
