package ex_09_Arrays;

public class Lab097_MaximumMinimumNumberArray {
    public static void main(String[] args) {
        int[] array ={25,14,56,34,77,99,113,34,64,76};
        System.out.println(MaxNumberInArray());
    }

    static int MaxNumberInArray(){
        int max=0;
        //Logic

        for(int i = 0; i< array.length; i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

}
