package com.krakedev.test;

import com.krakedev.figuras.*;

public class TestGraficar {
    public static void main(String[] args) {
        Graficador g = new Graficador();

        Figura f1 = new Cuadrado("Cuadrado", "Rojo", 5);
        Figura f2 = new Rectangulo("Rectángulo", "Azul", 4, 6);
        Figura f3 = new TrianguloRectangulo("Triángulo Rectángulo", "Amarillo", 3, 4);
        Figura f4 = new Hexagono("Hexágono", "Morado", 4);

        g.graficar(f1);
        g.graficar(f2);
        g.graficar(f3);
        g.graficar(f4);
    }
}