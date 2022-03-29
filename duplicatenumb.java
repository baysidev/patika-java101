package Giris.arrays;

public class duplicatenumb {

    static boolean isFind(int[] arr, int value) {

        for (int i : arr) {

            if (i == value) {
                return true;
            }
        }
        return false;

    }


    public static void main(String[] args) {

        int startIndex = 0;
        int[] list = {3, 7, 3, 7, 2, 9, 10, 21, 1, 33, 88, 44, 2, 9, 13, 51, 44};
        int[] duplicate = new int[list.length];


        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {

                if ((i != j) && (list[i] == list[j]) && list[i] % 2 == 0) {
                    if (!isFind(duplicate, list[i])) {

                        duplicate[startIndex++] = list[i];
                    }

                    break;

                }
            }

        }
            for (int row : duplicate) {
                if (row != 0) {
                    System.out.println(row);
                }
            }


    }
}