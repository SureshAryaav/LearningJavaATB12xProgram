package ex_08_Functions;

public class Lab090_PowerFunction {
    public static void main(String[] args) {
        int num = 3, power = 2;
        System.out.println(num + " to the power " + power + " is " + power(num, power));
    }
    static int power(int num, int power) {
        if (power == 0)
            return 1;
        return num * power(num, power - 1);
    }
}
