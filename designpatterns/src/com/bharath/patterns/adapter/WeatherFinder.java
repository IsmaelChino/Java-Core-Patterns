package com.bharath.patterns.adapter;

public interface WeatherFinder {

    /**
     * This method returns the weather of the specified city
     * @param city the city name
     * @return the weather of the city
     */
    int find(String city);
}
