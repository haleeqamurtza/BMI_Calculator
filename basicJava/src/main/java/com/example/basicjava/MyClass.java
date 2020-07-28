package com.example.basicjava;

public class MyClass {

    private static double bmi,calculated_value;


    public static void main(String[] args) {
        bmi=BMI_Calculator(75,1.6); //calling method

        if (bmi>25)
        {
            System.out.println("You are overweight");
        }
        else if (bmi>18.5 & bmi<25)
        {
            System.out.println("You have normal weight");
        }
        else
        {
            System.out.println("You are underweight");
        }
    }

    public static double BMI_Calculator(double weight, double height)
    {

        calculated_value=weight/(height*height);
        return calculated_value;

    }
}
