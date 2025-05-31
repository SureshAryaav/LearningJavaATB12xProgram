package ex_09_Arrays;

public class Lab092_LargestNumberinArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Max: " + max);

    }
}
