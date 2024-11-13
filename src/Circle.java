/*
 * Created on 2026-11-09
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public void draw() {
        System.out.println("  ****  ");
        System.out.println(" *    * ");
        System.out.println("*      *");
        System.out.println(" *    * ");
        System.out.println("  ****  ");
    }
}