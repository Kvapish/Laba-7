package com.company;

public class Main {

    public static void main(String[] args) {

        Vector vector1 = new Vector(3.535, 2.424, 2.567);
        Vector vector2 = new Vector(1.576, 1.245, 6.321);
        System.out.println(vector1);
        System.out.println(vector2);

        System.out.println((vector1.addition(vector2)).multiplication(vector2));
        System.out.println((vector1.addition(vector2)).multiplication(vector2).scalar(vector1));
    }
}
