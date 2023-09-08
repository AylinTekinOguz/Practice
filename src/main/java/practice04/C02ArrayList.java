package practice04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02ArrayList {
    public static void main(String[] args) {
        // Verilen bir array'den tekrar eden elemanları silip
        // tekrarsız elemanlardan olusan bir array haline donusturun
        //  int arr[]={1,2,2,3,4,4,5};

        int arr[]={1,2,2,3,4,4,5};

        List <Integer> tekrarsiz = new ArrayList<>();

        for (int w:arr ) {
            if (!tekrarsiz.contains(w)){
                tekrarsiz.add(w);
            }
        }
        System.out.println(tekrarsiz);

        int brr [] = new int[tekrarsiz.size()];

        for (int i = 0; i < tekrarsiz.size(); i++) {
            brr[i]=tekrarsiz.get(i);

        }
        System.out.println(Arrays.toString(brr));

        arr=brr;

        System.out.println(Arrays.toString(arr));
    }
}
