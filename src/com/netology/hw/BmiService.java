package com.netology.hw;

public class BmiService {

    /**
     * @param weight in kilograms
     * @param height in meters
     * @return BMI
     */
    public double calculate (double weight, double height){
        return weight / (height*height);
    }
}
