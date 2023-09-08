package practice04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C08LocalDate {
    public static void main(String[] args) {
          /*
        Ali 29.10.1923 tarihinden 45 yıl 8 ay 5 gun sonra dogdu.
        Veli  15.09.1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
        Ali ve Veli'nin dogum tarihini hesaplayıp yazdırınız.
        Ali'nin doğum tarihini 23/9/24 formatında yazdırın
        Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız
         */

        LocalDate aliDogum = LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate veliDogum = LocalDate.of(1993, 9, 15).minusYears(24).minusMonths(2).minusDays(11);

        System.out.println("Ali'nin Doğum Günü : "+ aliDogum);
        System.out.println("Veli'nin Doğum Günü : "+ veliDogum);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/M/dd");
        System.out.println(dtf.format(aliDogum));

        if (aliDogum.equals(veliDogum)){
            System.out.println("Aynı gün doğmuşlardır");
        }else System.out.println("Aynı gün doğmamışlardır");
    }
}
