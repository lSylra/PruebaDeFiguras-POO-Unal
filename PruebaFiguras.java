/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebafiguras;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class PruebaFiguras {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el Radio del circulo: ");
        int A = input.nextInt();
        System.out.print("Ingrese la Base del rectangulo: ");
        int B = input.nextInt();
        System.out.print("Ingrese la Altura del rectangulo: ");
        int C = input.nextInt();
        System.out.print("Ingrese los Lados del Cuadrado: ");
        int D = input.nextInt();
        System.out.print("Ingrese la Base del triangulo: ");
        int X = input.nextInt();
        System.out.print("Ingrese la Altura del triangulo: ");
        int Y = input.nextInt();
        Circulo figura1 = new Circulo(A);
        Rectangulo figura2 = new Rectangulo(B,C);
        Cuadrado figura3 = new Cuadrado(D);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(X,Y);
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
    }    
}
