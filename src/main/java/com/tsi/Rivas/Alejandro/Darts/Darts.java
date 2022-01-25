package com.tsi.Rivas.Alejandro.Darts;

public class Darts {

    private int Length;
    private int Weight;
    private String Flight;

    public Darts() {
        Length = 15;
        Weight = 22;
        Flight = "kite";
    }
    public int getLength() {
        return Length;
    }
    public void setLength(int Length) {
        this.Length = Length;
    }
    public int getWeight() {
        return Weight;
    }
    public void setWeight(int Weight) {
        this.Weight = Weight;
    }
    public String getFlight() {
        return Flight;
    }

    public void Dart() {
        System.out.println("The length of the dart is " + getLength() +"mm.");
        System.out.println("The weight of the dart is " + getWeight() +"mm.");
        System.out.println("The flight style of the dart is called " + getFlight() +"mm.");
    }
}
