package com.bharath.patterns.adapter;

import mx.ismael.patterns.adapter.constants.ZipCodeConstants;

public class WeatherUI {

    public static void main(String[] args) {
        WeatherUI ui = new WeatherUI();
        System.out.println("This application shows the weather of a city");
        ui.showTemperature(ZipCodeConstants.FLORIDA_ALVARO_OBREGON_MEXICO_CITY);
    }

    /**
     * This method shows the temperature of a city identified by the zip code
     * @param zipCode the zip code of the city
     */
    public void showTemperature(String zipCode) {
        WeatherAdapter weatherAdapter = new WeatherAdapter();
        System.out.println(weatherAdapter.findTemperature(zipCode));
    }
}
