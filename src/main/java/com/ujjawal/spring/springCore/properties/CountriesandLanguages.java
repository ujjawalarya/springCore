package com.ujjawal.spring.springCore.properties;

import java.util.Properties;

public class CountriesandLanguages {
	private Properties countryandLangs;

	@Override
	public String toString() {
		return "CountriesandLanguages [countryandLangs=" + countryandLangs + "]";
	}

	public Properties getCountryandLangs() {
		return countryandLangs;
	}

	public void setCountryandLangs(Properties countryandLangs) {
		this.countryandLangs = countryandLangs;
	}
	
	
}
