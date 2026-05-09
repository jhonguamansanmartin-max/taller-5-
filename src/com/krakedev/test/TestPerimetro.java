package com.krakedev.test;

import com.krakedev.figuras.*;

public class TestPerimetro {

    public static void main(String[] args) {
        
        System.out.println("=== PRUEBA DE PERÍMETROS ===\n");
        
        // Cuadrado
        Cuadrado c1 = new Cuadrado("Cuadrado", "Rojo", 5);
        System.out.println("Cuadrado lado 5  → Perímetro: " + c1.calcularPerimetro() + " (esperado: 20)");
        
        // Rectángulo
        Rectangulo r1 = new Rectangulo("Rectángulo", "Azul", 4, 6);
        System.out.println("Rectángulo 4x6   → Perímetro: " + r1.calcularPerimetro() + " (esperado: 20)");
        
        // Triángulo
        Triangulo t1 = new Triangulo("Triángulo", "Verde", 3, 4, 5);
        System.out.println("Triángulo 3-4-5  → Perímetro: " + t1.calcularPerimetro() + " (esperado: 12)");
        
        // Triángulo Rectángulo
        TrianguloRectangulo tr1 = new TrianguloRectangulo("Triángulo Rectángulo", "Amarillo", 3, 4);
        System.out.println("Triángulo Rect. 3-4 → Perímetro: " + tr1.calcularPerimetro() + " (esperado: 12)");
        
        // Hexágono
        Hexagono h1 = new Hexagono("Hexágono", "Morado", 5);
        System.out.println("Hexágono lado 5  → Perímetro: " + h1.calcularPerimetro() + " (esperado: 30)");
        
        System.out.println("\n✅ Prueba de perímetros finalizada.");
    }
}