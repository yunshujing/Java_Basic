package com.yskye.work1.test1;

public class Complex {
    private double real;
    private double imag;

    public Complex() {}
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void print() {
        System.out.println(real + " + " + imag + "i");
    }
    public void add(Complex c) {
        this.real += c.real;
        this.imag += c.imag;
    }
    public void sub(Complex c) {
        this.real -= c.real;
        this.imag -= c.imag;
    }
}
