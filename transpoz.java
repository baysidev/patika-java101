package Giris.arrays;


public class transpoz {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4},{5,6,4}};
        int[][] transposedArr = new int[3][2];


        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                transposedArr[j][i] = arr[i][j];
            }
        }


        System.out.println("Matris: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(j == arr[0].length-1)
                    System.out.println(arr[i][j]);
                else
                    System.out.print(arr[i][j]+"\t");
            }
        }

        System.out.println();

        System.out.println("Transpoze: ");
        for(int i = 0; i < transposedArr.length; i++){
            for(int j = 0; j < transposedArr[0].length; j++){
                if(j == transposedArr[0].length-1)
                    System.out.println(transposedArr[i][j]);
                else
                    System.out.print(transposedArr[i][j]+"\t");
            }
        }
    }
}
