package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void testHasCity() {
        CustomList cityList = new CustomList(null, new ArrayList<>());
        City city = new City("Toronto", "Ontario");
        cityList.addCity(city);
        assertTrue(cityList.hasCity(city));

        City city2 = new City("Vancouver", "British Columbia");
        assertFalse(cityList.hasCity(city2));
    }
    @Test
    public void testCountCities() {
        CustomList cityList = new CustomList(null, new ArrayList<>());
        assertEquals(0, cityList.countCities());

        City city1 = new City("Toronto", "Ontario");
        City city2 = new City("Vancouver", "British Columbia");
        cityList.addCity(city1);
        cityList.addCity(city2);

        assertEquals(2, cityList.countCities());
    }
    @Test
    public void testDeleteCity() {
        CustomList cityList = new CustomList(null, new ArrayList<>());
        City city = new City("Toronto", "Ontario");
        cityList.addCity(city);


        cityList.delete(city);
        assertFalse(cityList.hasCity(city));
    }

}
