package practice05;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
         /*
        Kulanıcıdan alınan bir tam sayı kadar eleman içeren (47den kucuk olmak kosuluyla)
        FIBONACCI dizisi olusturun(Bunu bir method olusturarak yazınız)
        Ör: sayi=10 için
        0-1-1-2-3-5-8-13-21-34 gibi
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 47den küçük bir sayı girin");
        int sayi = input.nextInt();

        fibonacci1 (sayi);

    }

    private static void fibonacci1(int sayi) {
        int num1 =0;
        int num2 =1;
        int num3;

        if (sayi<47 && sayi>-1){
            for (int i = 0; i < sayi; i++) {
                System.out.print(num1+" ");
                num3=num1+num2;
                num1=num2;
                num2=num3;

            }

        }else {
            System.out.println("Lütfen geçerli bir sayı girin");
        }



    }


}
