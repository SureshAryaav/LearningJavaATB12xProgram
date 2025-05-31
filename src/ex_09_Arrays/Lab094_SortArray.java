package ex_09_Arrays;

public class Lab094_SortArray {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println(java.util.Arrays.toString(arr));

    }
}
