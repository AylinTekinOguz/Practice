package practice05.inheritance02;

public class Araba {
    // Araba, Opel, Corsa adında farklı class'lar olusturunuz.
    // Opel class'ı Araba class'ına baglı olacak
    // Corsa class'ı Opel class'ına baglı olacak
    // Araba class'ına genel bilgileri, variable ve method olarak yazınız.
    // Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.
    // Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.


    //tum arabalar için ortak olan özellikleri variable olarak tanımlayalım

    String hareket="Arabalar tekerlek ile hareket eder.";
    String hız = "Arabalar motor gücüne göre hız yapar.";
    String yakıt= "Arabalar farklı yakıtlar kullanabilir.";
    String marka = "Arabalar üretildikleri markaya sahiptir.";


    //tum arabalar için ortak olan özellikleri method olarak tanımlayalım

    protected void motor(){
        System.out.println("Arabalar farklı markalarda motor kullanırlar.");

    }
    protected void yakıtTüketimi(){
        System.out.println("Arabalar motor gücü ve yakıt türüne göre yakıt tüketirler");
    }








}
