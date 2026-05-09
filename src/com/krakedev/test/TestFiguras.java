package com.krakedev.test;

import com.krakedev.figuras.*;

public class TestFiguras {
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado("Cuadrado", "Rojo", 5);
        Rectangulo r = new Rectangulo("Rectángulo", "Azul", 4, 6);
        Triangulo t = new Triangulo("Triángulo", "Verde", 3, 4, 5);

        System.out.println(c);
        System.out.println(r);
        System.out.println(t);
    }
}