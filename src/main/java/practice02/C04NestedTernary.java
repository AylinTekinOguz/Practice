package practice02;

import java.util.Scanner;

public class C04NestedTernary {
    public static void main(String[] args) {
         /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz");

        int a = input.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz");
        int b = input.nextInt();

       Object result =  (a == b) ? "Sayılar biririne eşit" : (a>b) ? a : b;
        System.out.println("result = " + result);
    }
}
