package homworks2;

import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {
        printStringMultipleTimes (3, "Привет Мир!");
        int[] arr = {1, 5, 7, 10, 8, 9};
        printSumOfElementsGreaterThanFive (arr);
        fillArrayWithValue(5, arr);
        incrementArrayElements(2, arr);
        int[] arr1 = {2, 4, 6, 4, 8, 9, 10, 33, 22, 1};
        printLargerHalfSum(arr1);



    }


    public static void printStringMultipleTimes (int count, String str) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }

    }

    public static void printSumOfElementsGreaterThanFive (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }

        }
        System.out.println(sum);

    }

    public static void fillArrayWithValue (int value, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        System.out.println(Arrays.toString(arr));


    }

    public static void incrementArrayElements(int value, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += value;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void printLargerHalfSum(int[] arr) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum1 += arr[i];
        }
        if (sum > sum1) {
            System.out.println(sum);

        }
        if (sum < sum1) {
            System.out.println(sum1);
        }
    }
}
