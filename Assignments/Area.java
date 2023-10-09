package Assignments;

public class Area {
    public static double area(int radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println(area(7));
    }
}
