package Giris.arrays;
import java.util.Scanner;
import java.util.Arrays;

public class sayisiralama {

    /*
    baysidev
     */

    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = giris.nextInt();
        int[] list = new int[n];
        System.out.println("Dizinin elemanlarını giriniz :");

        for (int i = 0; i < n; i++){

            System.out.print(i+1+ ". Elemanı: ");
            list[i] = giris.nextInt();

        }


        Arrays.sort(list);
        System.out.println("Sıralama: "+Arrays.toString(list));


    }




}
