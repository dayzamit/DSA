package com.dsa.recursion;

public class AESBLDir {


    //shift elements of a single dimensional array in the left direction by one position

    static int[][] spiralMatrix = {{1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}};

    public static void main(String[] args) {

        //twoDMatrixSpiralForm();

       final Customer customer= new Customer("Amit");

        System.out.println(customer.getCustName());
    }


    public static void twoDMatrixSpiralForm() {

        int[][] exampleVariableOne = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};

        int rowStart = 0, rowLength, colStart = 0, colLenght;

        rowLength = exampleVariableOne.length - 1;

        colLenght = exampleVariableOne[0].length - 1;

        while (rowStart <= rowLength && colStart <= colLenght) {
            for (int i = rowStart; i <= colLenght; i++) {
                //move left to right
                System.out.print(exampleVariableOne[rowStart][i] + " ");
            }

            for (int j = rowStart + 1; j <= rowLength; j++) {
                //move top to bottom
                System.out.print(exampleVariableOne[j][colLenght] + " ");
            }

            if (rowStart + 1 <= rowLength) {
                //move left to right

                for (int k = colLenght - 1; k >=colStart; k--) {
                    System.out.print(exampleVariableOne[rowLength][k] + " ");
                }

            }


            if(colStart+1<=colLenght)
            {
                //move bottom to top
                for (int k = rowLength-1; k > rowStart; k--) {
                    System.out.print(exampleVariableOne[k][colStart] + " ");
                }
            }

            rowStart++;
            rowLength--;
            colStart++;
            colLenght--;

        }


    }

    static void printMatrixInSpiralWay(int[][] matrix) {

        int rowStart = 0;
        int rowLength = matrix.length - 1;

        int colStart = 0;
        int colLength = matrix[0].length - 1;

        while (rowStart <= rowLength && colStart <= colLength) {

            for (int i = rowStart; i <= colLength; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }

            for (int j = rowStart + 1; j <= rowLength; j++) {
                System.out.print(matrix[j][colLength] + " ");
            }

            if (rowStart + 1 <= rowLength) {
                for (int k = colLength - 1; k >= colStart; k--) {
                    System.out.print(matrix[rowLength][k] + " ");
                }
            }
            if (colStart + 1 <= colLength) {
                for (int k = rowLength - 1; k > rowStart; k--) {
                    System.out.print(matrix[k][colStart] + " ");
                }
            }

            rowStart++;
            rowLength--;
            colStart++;
            colLength--;
        }
    }

    public static void twoDMatrixRead() {


        int[][] exampleVariableOne = {{12, 20, 30, 40},
                {15, 25, 35, 45},
                {24, 29, 39, 51},
                {35, 30, 39, 50},
                {50, 60, 75, 72}};


        boolean isFoundElement = false;
        int numberofDuplicate = 0;
        // nested for loops are necessary for
        // iterating through a 2D array
        for (int countOne = 0; countOne < exampleVariableOne.length; countOne++) {
            for (int countTwo = 0; countTwo < exampleVariableOne[countOne].length; countTwo++) {


                if (exampleVariableOne[countOne][countTwo] == 51) {
                    System.out.print("Index [" + countOne + "][" + countTwo + "]: ");
                    System.out.println(exampleVariableOne[countOne][countTwo]);
                    numberofDuplicate++;
                    isFoundElement = true;
                }
            }
        }

        if (!isFoundElement)
            System.out.println("Element not found");
        else
            System.out.println("total duplicate found" + numberofDuplicate);


    }

    public static void shiftElementRightByOne() {
        int[] inputArray = {5, 6, 7};

        int temp = inputArray[inputArray.length - 1];

        for (int i = inputArray.length - 1; i > 0; i--) {
            inputArray[i] = inputArray[i - 1];
        }

        inputArray[0] = temp;

        System.out.println("Final Array" + inputArray.toString());

    }

    public static void shiftElementLeftByOne() {
        int[] inputArray = {9, 10, 11};

        int temp = inputArray[0];

        for (int i = 0; i < inputArray.length - 1; i++) {
            inputArray[i] = inputArray[i + 1];
        }

        inputArray[inputArray.length - 1] = temp;

        System.out.println("Final Array" + inputArray.toString());

    }
}

