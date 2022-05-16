package com.company;

public class Vector {
    double x, y, z;

    public Vector(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double gudies(double num) {
        return num / length();
    }

    public Vector addition(Vector vector) {
        return new Vector(this.x + vector.x, this.y + vector.y, this.z + vector.z);
    }

    public double scalar(Vector vector) {
        return ((this.x * vector.x) + (this.y * vector.y) + (this.z * vector.z));
    }

    public Vector multiplication(Vector vector) {
        return new Vector(this.x * vector.x, this.y * vector.y, this.z * vector.z);
    }

    public double vectorproduct(Vector vector) {
        return (this.length() * vector.length());
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}