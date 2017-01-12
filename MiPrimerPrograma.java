/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerprograma;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class MiPrimerPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entradaEscaner = new Scanner(System.in);
        
        System.out.println("Hola Mundo");
        
        System.out.println("Nombre: ");
	String name = "";
	name = entradaEscaner.nextLine ();
	
        System.out.println("Carrera: ");
	String carrera = "";
	carrera = entradaEscaner.nextLine ();
	
        System.out.println("Edad: ");
	int age = entradaEscaner.nextInt ();
	
        System.out.println("Bienvenido a POO " + name + " de " + age + " años, perteneciente a la carrera de " + carrera);
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Peso: ");
	float pes = teclado.nextFloat();
        System.out.println("Altura: ");
	float alt = teclado.nextFloat();
        System.out.println("Su indice de masa corporal es: ");
        System.out.println(pes/alt);
        
        System.out.println("Valor de a: ");
        float a = teclado.nextFloat();
        System.out.println("Valor de b: ");
        float b = teclado.nextFloat();
        System.out.println("Valor de c: ");
        float c = teclado.nextFloat();
        if (a == 0)
            System.out.println("No se puede realizar la operacion");
        else{
            System.out.println("El valor de x1 es:");
            System.out.println((-b + Math.sqrt(b*b - 4*a*c))/2*a);
            System.out.println("El valor de x2 es:");
            System.out.println((-b - Math.sqrt(b*b - 4*a*c))/2*a);
        }
    }
    
}
