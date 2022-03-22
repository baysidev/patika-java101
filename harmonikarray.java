package Giris.arrays;
import java.util.Arrays;


public class harmonikarray {
    public static void main(String[] args) {

        int [] list = {1, 2, 3, 4, 5};
        double rest = 0.0;

        for(int i = 0; i < list.length; i++){

            for (int k = 1; k <= list[i]; k++){

                rest += (1.0/k);

            }

        }

        double harmonik = (list.length) / rest;
        System.out.println(harmonik);


    }



}
