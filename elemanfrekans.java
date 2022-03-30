package Giris.arrays;

import java.util.Arrays;

public class elemanfrekans {

    public static void main(String[] args) {


        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(list));
        int count = 0;
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int k : list) {

            for (int j = 0; j < list.length; j++) {

                if (k == list[j]) {

                    count++;
                }

            }

            if (!isFind(duplicate, k)) {

                duplicate[startIndex++] = k;
                System.out.println(k + " sayısı " + count + " kere tekrar edildi !");
                count = 0;


            }

    }

    }

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }






}
