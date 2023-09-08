package practice01;

public class C01Variables {
    public static void main(String[] args) {
        //(int) bir variable(yas)  olustur ve yazdır
        int age=28;
        System.out.println(age);

        //(int) bir variable(sayi)  olustur ve yazdır
        int sayi=120;
        System.out.println(sayi);

        //konsola sayi = 50 seklinde yazdır
        String sayiDegeri = "sayı = 50";
        System.out.println(sayiDegeri);

        //yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala
        int benimYasim = age;
        System.out.println(benimYasim);

        //String bir variable olusturalım (isim)
        String isim = "Aylin";

        //isim variable ını etiketıyle yazdır
        System.out.println("isim =" + isim);

        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala
        String onunIsmi = isim;

        //onunIsmi variable'ını etiketiyle yazdır
        System.out.println("Onun ismi ="+ onunIsmi);
        System.out.println("onunIsmi = " + onunIsmi); //soutv

        //isim variable'ının degerini guncelle
        isim="celo";

        //isim ve onunIsmi variable'larını yazdır
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);
    }
}
