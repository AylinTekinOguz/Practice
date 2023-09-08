package practice01;

public class C03KimlikBilgileri {
    public static void main(String[] args) {
           /*
         isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            Isim: ...
            Soyisim: ...
            Yas: ...
            Boy: ...
            Kilo: ...
    Not: Sadece bir adet "System.out.println(); kullanınız.
    */
        String isim = "Aylin";
        String soyisim = "Tekin Oğuz";
        byte yas = 28;
        double boy = 1.62;
        byte kilo = 56;

        System.out.println("Isim: "+isim + "\nSoyisim: "+soyisim + "\nYaş: " + yas + "\nBoy: " + boy + "\nKilo: " + kilo);
    }
}
