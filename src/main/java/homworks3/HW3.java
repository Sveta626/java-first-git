package homworks3;

public class HW3 {
    public static void main(String[] args) {
        int[][] arr2d = {
                {1, 5, -7},
                {-4, 7, 9},
                {0, 8, 10}
        };
        System.out.println(sumOfPositiveElements(arr2d));
        System.out.println();
        int size = 10;
        printSquareOfSymbol(size);
        System.out.println();
        int[][] array2d = {
                {4, 5, 6},
                {1, 8, 9},
                {3, 5, 8}
        };
        zoningOutDiagonally(array2d);
        System.out.println();
        int[][] arrayForSearchingMax = {
                {4, 5, 6},
                {1, 8, 9},
                {3, 5, 8}
        };
        findMax(arrayForSearchingMax);
        System.out.println();
        int[][] arraySumLine = {
                {4, 5, 6},
                {1, 8, 9},
                {3, 5, 8}
        };

        System.out.println(sumSecondLine(arraySumLine));

    }

    public static int sumOfPositiveElements(int[][] arr2d) {
        int sum = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i][j] > 0) {
                    sum += arr2d[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquareOfSymbol(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* " + " ");

            }
            System.out.println();
        }


    }

    public static void zoningOutDiagonally(int[][] array2d) {
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (i == j) {
                    array2d[i][j] = 0;
                } else if (i + j == array2d.length - 1) {
                    array2d[i][j] = 0;
                }
                System.out.print(array2d[i][j] + " ");

            }

            System.out.println();
        }

    }

    public static void findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }

            }

        }
        System.out.println(max);


    }

    public static int sumSecondLine(int[][] arr2d) {
        if (arr2d.length < 2) {
            return -1;
        }
        int sum = 0;
        for (int j = 0; j < arr2d[1].length; j++) {
            sum += arr2d[1][j];
        }
        return sum;

    }

}