package practice02;

import java.util.Scanner;

public class C07StringManipulations {
    public static void main(String[] args) {
          /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen ad ve soyadınızı aralarında bir boşluk olacak şekilde girin" +
                "\nNOT:Yalnızca bir ad ve bir soyad girilmelidir");

        String adSoyad =input.nextLine();

        int spaceIndex = adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,spaceIndex);
        String soyad=adSoyad.substring(spaceIndex+1);

        String ad2 = ad.toUpperCase().charAt(0) + ad.toLowerCase().substring(1);
        String soyad2=soyad.toUpperCase().charAt(0)+soyad.toLowerCase().substring(1);

        System.out.println(ad2);
        System.out.println(soyad2);
    }
}
