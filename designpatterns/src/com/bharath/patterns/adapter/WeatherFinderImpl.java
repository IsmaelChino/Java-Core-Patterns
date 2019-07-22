package com.bharath.patterns.adapter;

import mx.ismael.patterns.adapter.constants.TemperatureConstants;
import mx.ismael.patterns.adapter.constants.ZipCodeConstants;

public class WeatherFinderImpl implements WeatherFinder {

    @Override
    public int find(String city) {
        return TemperatureConstants.ALVARO_OBREGON_TEMPERATURE;
    }

}
