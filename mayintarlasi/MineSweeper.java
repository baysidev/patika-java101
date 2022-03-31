package Giris.mayintarlasi;
import java.util.Scanner;
import java.util.Random;

public class MineSweeper {


    int row;
    int column;
    String[][] gameMap;
    String[][] minedMap;
    int spaces;

    public MineSweeper(int row, int column) {
        super();
        this.row = row;
        this.column = column;

        this.gameMap = new String[row][column];
        this.minedMap = new String[row][column];

        this.spaces = (row * column) - ((row * column) / 4);

        this.prepareGameBoard(row, column);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Satır Giriniz: ");
            int rowFromUser = sc.nextInt();
            System.out.print("Sütun Giriniz: ");
            int colFromUser = sc.nextInt();
            System.out.println("===========================");

            if (!this.isValidInput(rowFromUser, colFromUser)) {
                System.out.println("Lütfen girdiğiniz sınırlar içerisinde seçim yapınız.");
                continue;
            }

            if(isGameOver(rowFromUser, colFromUser)) {
                System.out.println("Game Over!");
                this.printMinedBoard();
                break;
            }

            if (this.spaces == 1) {
                System.out.println("Oyunu Kazandınız!");
                break;
            }

            this.writeBoard(rowFromUser, colFromUser);
            this.spaces--;
            this.printGameBoard();
        }
    }

    public void writeBoard(int row, int col) {
        int count = 0;

        if (this.isValidInput(row -1 , col)) {

            if (this.minedMap[row-1][col].equals("*")) {
                count++;
            }
        }

        if (this.isValidInput(row -1 , col -1)) {
            if (this.minedMap[row-1][col -1].equals("*")) {
                count++;
            }
        }

        if (this.isValidInput(row -1 , col+1)) {
            if (this.minedMap[row-1][col+1].equals("*")) {
                count++;
            }
        }

        if (this.isValidInput(row , col-1)) {
            if (this.minedMap[row][col-1].equals("*")) {
                count++;
            }
        }

        if (this.isValidInput(row , col+1)) {
            if (this.minedMap[row][col+1].equals("*")) {
                count++;
            }
        }

        if (this.isValidInput(row +1  , col -1)) {
            if (this.minedMap[row+1][col -1].equals("*")) {
                count++;
            }
        }

        if (this.isValidInput(row + 1 , col)) {
            if (this.minedMap[row+1][col].equals("*")) {
                count++;
            }
        }

        if (this.isValidInput(row + 1 , col + 1)) {
            if (this.minedMap[row+1][col+1].equals("*")) {
                count++;
            }
        }


        this.gameMap[row][col] = String.valueOf(count);
    }

    public boolean isValidInput(int row, int col) {
        return row < this.row && col < this.column && row >= 0 && col >= 0;
    }

    public boolean isGameOver(int row, int col) {

        return this.minedMap[row][col].equals("*");
    }

    public void prepareGameBoard(int row, int col) {
        Random rand = new Random();
        int countOfMine = (row * col) / 4;

        for (int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                this.gameMap[i][j] = "-";
                this.minedMap[i][j] = "-";
            }
        }

        for(int i = 0; i<countOfMine; i++) {
            int randRow = rand.nextInt(row);
            int randCol = rand.nextInt(column);

            this.minedMap[randRow][randCol] = "*";
        }

    }

    public void printGameBoard() {
        for (String[] row : this.gameMap) {
            for (String column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public void printMinedBoard() {
        System.out.println("Mayınların Konumu");
        for (String[] row : this.minedMap) {
            for (String column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }



}
