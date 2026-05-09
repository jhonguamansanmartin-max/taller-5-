package com.krakedev.figuras;

public class Triangulo extends Figura {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(String nombre, String color, int lado1, int lado2, int lado3) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public int calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularArea() {
        // Fórmula de Herón
        double s = calcularPerimetro() / 2.0;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}