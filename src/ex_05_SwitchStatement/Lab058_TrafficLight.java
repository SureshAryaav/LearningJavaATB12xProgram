package ex_05_SwitchStatement;

public class Lab058_TrafficLight {
    public static void main(String[] args) {
        String color = "Red";

        switch (color.toLowerCase()) {
            case "red": System.out.println("Stop"); break;
            case "yellow": System.out.println("Ready"); break;
            case "green": System.out.println("Go"); break;
            default: System.out.println("Invalid signal");
        }
    }
}
