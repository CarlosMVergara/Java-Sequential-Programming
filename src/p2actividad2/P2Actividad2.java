package p2actividad2;

//Programa que pide nombre y edad

import java.util.Scanner;

public class P2Actividad2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.println("Escribe tu nombre");
        nombre = leer.nextLine();
        System.out.println("Escribe tu edad");
        edad = leer.nextInt();
        
        System.out.println("Hola " + nombre + ", tienes " + edad + " años");
        
    }
    
}
