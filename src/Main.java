import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] arr = {3.1, -4.5, 6.3, -8.2, 3.6, -7.2, 4.2, -5.6, 7.9, -3.1, 4.5, -6.3, 8.2, -3.6, 7.1};
        double[] newArr = new double[15];
        double summ = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            newArr[i] = arr[i];
            if (arr[i] < 0) {
                break;
            }
            arr[i] = 0;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {
                summ = summ + arr[j];
                count++;
            }
        }
        System.out.println("Cреднее арифметическое положительных " +
                "чисел расположенных после первого отрицательного" +
                " числа: " + summ + "/" + count);
 ////
        int[] initialArray = {89, 264, 63, 32, 1351, 68, 8, 576, 5, 3525, 3, 866, 56, 7683, 12};
        //int[] sortedArray = new int[initialArray.length];
        int temp = 0;
        for (int i = 1; i < initialArray.length; i++) {
            temp = initialArray[i];
            int j = i - 1;
            while (j >= 0 && temp < initialArray[j]) {
                initialArray[j + 1] = initialArray[j];
                j--;
            }
            initialArray[j + 1] = temp;
            System.out.println(Arrays.toString(initialArray));
        }
    }


}




