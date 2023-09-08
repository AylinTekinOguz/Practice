package practice04;

import java.util.Scanner;

public class C03HesapMakinesi {
    public static void main(String[] args) {


     /*
        Basit 4 islem yapan bir hesap makinesi kodlayınız
        Kullanıcıcn yapacagi islemi islem sembolu ile( +  -  /  *  ) secmesini isteyiniz
        Kullanıcının 2 sayi girmesini isteyiniz
        Girilen islem ve sayilara gore dogru sonucu ekrana yazdırınız
        */

    Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : +, -, *, / kullanınız");

        char islem = input.next().charAt(0);

        if (islem=='+' || islem =='-' || islem=='*' || islem=='/'){
            System.out.println("Lütfen işlem yapmak istediğiniz sayıları giriniz \nBirinci sayı : ");
            Double ilkSayi = input.nextDouble();
            System.out.println("İkinci sayı : ");
            Double ikinciSayi = input.nextDouble();

            hesapMakinesi(islem, ilkSayi, ikinciSayi);


        }else System.out.println("Hatali giriş");



    }

    private static void hesapMakinesi(char islem, Double ilkSayi, Double ikinciSayi) {
        switch (islem){
            case '+' :
                System.out.println(ilkSayi + "+" + ikinciSayi + "=" +(ilkSayi+ikinciSayi));break;

            case '-' :
                System.out.println(ilkSayi + "-" + ikinciSayi + "=" +(ilkSayi-ikinciSayi));break;
            case '*':
                System.out.println(ilkSayi + "*" + ikinciSayi + "=" +(ilkSayi*ikinciSayi));break;
            case '/':
                System.out.println(ilkSayi + "/" + ikinciSayi + "=" +(ilkSayi/ikinciSayi));break;
        }



    }


}
