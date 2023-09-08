package practice04;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
         /*
        Kulanıcıdan alınan bir tam sayı kadar(47den kucuk olmak kosuluyla)
        FIBONACCI dizisi olusturun
        Ör: sayi=10 için
        0-1-1-2-3-5-8-13-21-34 gibi
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 47'den küçük bir sayı giriniz");
        int sayi = input.nextInt();

        fibonacci(sayi);


    }

    private static void fibonacci(int sayi) {
        for (int i = 0; i <= sayi ; i++) {



        }
    }


}
