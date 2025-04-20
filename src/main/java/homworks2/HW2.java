package homworks2;

import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {
        stringPrintCount(3, "Привет Мир!");
        int[] arr = {1, 5, 7, 10, 8, 9};
        sumArrayPrint(arr);
        myMethodArrayPrint(5, arr);
        //System.out.println(Arrays.toString(arr));
        addValuePrint(2, arr);
        int[] arr1 = {2, 4, 6, 4, 8, 9, 10, 33, 22, 1};
        myMethodHalfSummaPrint(arr1);


    }


    public static void stringPrintCount(int count, String str) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }

    }

    public static void sumArrayPrint(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }

        }
        System.out.println(sum);

    }

    public static void myMethodArrayPrint(int value, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        System.out.println(Arrays.toString(arr));


    }

    public static void addValuePrint(int value, int[] in) {
        for (int i = 0; i < in.length; i++) {
            in[i] += value;
        }
        System.out.println(Arrays.toString(in));

    }

    public static void myMethodHalfSummaPrint(int[] arr) {
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
