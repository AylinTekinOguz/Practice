package practice01;

public class C02Ortalama {
    public static void main(String[] args) {
            /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
        ortalama nasıl hesaplanır -> tum sayıları topla, sayı adedine böl
     */
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

        double ortalama = ((num1+num2+num3+num4+num5)/5);
        double ortalama2 = ((num5+num4+num3+num2+num1)/5);
        System.out.println(ortalama);
        System.out.println("ortalama2 = " + ortalama2);
    }
}
