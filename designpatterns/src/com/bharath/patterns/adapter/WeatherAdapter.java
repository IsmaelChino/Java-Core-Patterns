package com.bharath.patterns.adapter;

import mx.ismael.patterns.adapter.constants.CityConstants;
import mx.ismael.patterns.adapter.constants.ZipCodeConstants;

public class WeatherAdapter {

    /**
     * This method returns the temperature of a city specified by it's zip code
     * @param zipCode the zip code of the city
     * @return the temperature of a city
     */
    public int findTemperature(String zipCode) {
        String city = null;
        if (zipCode.contentEquals( ZipCodeConstants.FLORIDA_ALVARO_OBREGON_MEXICO_CITY) ) {
            city = CityConstants.ALVARO_OBREGON;
        }

        WeatherFinder weatherFinder = new WeatherFinderImpl();
        return weatherFinder.find(city);
    }
}
