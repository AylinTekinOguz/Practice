package practice03;

import java.util.Scanner;

public class c01ForLoop {
    public static void main(String[] args) {
            /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir kelime yazın");
        String kelime =input.next();

        int counter =0;

        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i)=='c'){
                break;
            } else if (kelime.charAt(i)=='a') {

                counter++;
            }
        }
        System.out.println(counter);
    }
}
