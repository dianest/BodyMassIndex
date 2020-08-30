package com.netology.hw;

public class Main {

    public static void main(String[] args) {
	BmiService service = new BmiService();
	double bmi = service.calculate(80.4,1.71);
	System.out.println(bmi);
    }
}
