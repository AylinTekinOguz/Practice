package practice05.inheritance02;

public class Corsa extends Opel{

    String hiz = "Corsa max 200 km hız yapar";

    String yakıt = "Corsa arabalar benzinli ve elektriklidir.";

    String model ="Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar çevreci motor kullanır");
    }

    @Override
    protected void yakıtTüketimi() {
        System.out.println("Corsa arabalar 5.6 lt yakıt tüketir");
    }

    protected void vitesSayısı(){
        System.out.println("Corsa arabalar 5 viteslidir.");
    }

    public static void main(String[] args) {

        Corsa arb1 = new Corsa();
        System.out.println("arb1.hareket = " + arb1.hareket); //araba
        System.out.println("arb1.hiz = " + arb1.hiz); //corsa
        System.out.println("arb1.yakıt = " + arb1.yakıt); //corsa
        System.out.println("arb1.marka = " + arb1.marka); //opel
        System.out.println("arb1.şirketMerkezi = " + arb1.şirketMerkezi); //opel
        System.out.println("arb1.model = " + arb1.model); //corsa

        arb1.motor(); //corsa

        Opel arb2 = new Corsa(); //bir opel objesi oluşturduk

        System.out.println("arb2.hareket = " + arb2.hareket); //araba
        System.out.println("arb2.hız = " + arb2.hız); //Opel
        System.out.println("arb2.yakıt = " + arb2.yakıt); //araba
        System.out.println("arb2.marka = " + arb2.marka); //opel
        System.out.println("arb2.şirketMerkezi = " + arb2.şirketMerkezi); //opel

        arb2.motor(); //corsa

        /*
        inheritanceda variablelar ;
        aramaya data türü ne ise oradan başlanır
        yoksa parenta bakılır ve ilk bulduğu yerden getirilir.

        inheritanceda methodlar;
        aramaya data türü ne ise oradan başlanır
        yoksa parenta bakılır
        ilk bulduğunu GETIRMEZ
        constructorun olduğu classa kadar override edilmiş mi diye kontrol eder
        son bulduğunu getirir
         */

        //arama her zaman aşağıdan yukarı doğrudur
        //override control her zaman yukarıdan aşağı doğrudur

        arb2.garanti(); //opel

        arb2.yakıtTüketimi(); //corsa
        arb2.motor(); //corsa

        Araba arb3 =new Corsa();
        System.out.println("arb3.hareket = " + arb3.hareket); //araba
        System.out.println("arb3.yakıt = " + arb3.yakıt); //araba
        System.out.println("arb3.hız = " + arb3.hız); //araba
        System.out.println("arb3.marka = " + arb3.marka); //araba

        arb3.yakıtTüketimi(); //corsa
        arb3.motor(); //corsa

        Araba arb4 = new Opel();

        System.out.println("arb4.hız = " + arb4.hız); //Araba
        System.out.println("arb4.yakıt = " + arb4.yakıt);//araba
        System.out.println("arb4.marka = " + arb4.marka);//araba

        arb4.yakıtTüketimi(); //araba
        arb4.motor();  //opel


    }

}
