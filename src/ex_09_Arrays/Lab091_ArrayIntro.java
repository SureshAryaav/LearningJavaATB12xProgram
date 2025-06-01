package ex_09_Arrays;

public class Lab091_ArrayIntro {
/*
Default value: int -0, Boolena-false, object - null
Array are fixed size
 */
    public static void main(String[] args) {
        int[] marks= {97,89,74,96,88,93};
        boolean[] Married_Check= {true, false,true};
        System.out.println(marks.length);

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println(numbers[2]);

        //Iteration
        for(int i=0;i< numbers.length;i++){
            //System.out.println(numbers[i]);
        }
        //Enhanced for loop
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
