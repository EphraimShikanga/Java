package Assignments;

import javax.swing.*;
import java.awt.*;

public class javaSwing {
    public static void main(String[] args) {
        Circle circle = new Circle(50);
        circle.draw();
        System.out.println("Circle area: " + circle.calculateArea());

        Cylinder cylinder = new Cylinder(30, 70);
        cylinder.draw();
        System.out.println("Cylinder surface area: " + cylinder.calculateArea());
    }
}


abstract class Shape {
    protected double radius;

    public Shape(double radius) {
        this.radius = radius;
    }

    public abstract void draw();
    public abstract double calculateArea();
}

class Circle extends Shape {
    // private double radius;

    public Circle(double radius) {
        super(radius);
    }

    public double getRadius() {
        return super.radius;
    }

    @Override
    public void draw() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                int diameter = (int) (2 * getRadius());
                int x = getWidth() / 2 - diameter / 2;
                int y = getHeight() / 2 - diameter / 2;
                g2.setColor(Color.RED);
                g2.fillOval(x, y, diameter, diameter);
            }
        };

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return super.radius;
    }

    @Override
    public void draw() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                int diameter = (int) (2 * getRadius());
                int x = getWidth() / 2 - diameter / 2;
                int y = getHeight() / 2 - diameter / 2;
                g2.setColor(Color.RED);
                g2.fillOval(x, y, diameter, diameter);

                int height = (int) (getHeight() * 0.8);
                int startY = getHeight() / 2 - height / 2;
                g2.setColor(Color.BLUE);
                g2.fillRect(x, startY, diameter, height);
            }
        };

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    @Override
    public double calculateArea() {
        double baseArea = super.calculateArea();
        double lateralArea = 2 * Math.PI * getRadius() * height;
        double totalSurfaceArea = 2 * baseArea + lateralArea;
        return totalSurfaceArea;
    }
}

