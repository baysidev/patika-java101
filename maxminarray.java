package Giris.arrays;
import java.util.Scanner;
import java.util.Arrays;

public class maxminarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, closestMin = 0, closestMax = 0;
        System.out.print("Sayı giriniz: ");
        num = scanner.nextInt();

        int[] numbers = {15,12,788,1,-1,-778,2,0};

        Arrays.sort(numbers);
        System.out.println("Girilen Sayı: "+ num);

        for (int numInArr : numbers) {

            if (numInArr < num) {
                closestMin = numInArr;

            }
            if ((numInArr > num)) {
                closestMax = numInArr;
                break;
            }

        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestMin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestMax);


    }
}
