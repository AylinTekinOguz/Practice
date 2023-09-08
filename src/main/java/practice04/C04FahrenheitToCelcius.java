package practice04;

import java.util.Scanner;

public class C04FahrenheitToCelcius {
    public static void main(String[] args) {
        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

        Scanner input =new Scanner(System.in);
        System.out.println("Fahrenheit cinsinden sıcaklık girin");
        double fahrenheit  = input.nextDouble();

        double celsius =fahrenheitToCelcius (fahrenheit);
        System.out.println("celsius = " + celsius);
    }

    private static double fahrenheitToCelcius(double fahrenheit) {
        double celsius = (fahrenheit-32)/1.8;
        return celsius;
    }
}
