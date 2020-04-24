package main;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Seleccione que desea hacer:");
        System.out.println("1 - Dar de alta un artículo");
        System.out.println("2 - Calcular el area/perimetro de un rectángulo");
        int eleccion = scanner.nextInt();
        if (eleccion == 1) {
        	funcionArticulo();
        } else if (eleccion == 2) {
        	funcionRectangulo();
        } else {
            System.out.println("Introduzca una de las opciones indicadas anterioremente");
        }
        
        System.out.println("Fin de la aplicación");
    }
    
    public static void funcionArticulo() {
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = scanner.nextInt();
        System.out.println("Proporciona el precio:");
        double precio = scanner.nextDouble();
        System.out.println("Proporciona el simbolo:");
        char simbolo = scanner.next().charAt(0);
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = scanner.nextBoolean();
 
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
    
    public static void funcionRectangulo() {
		System.out.println("Proporciona el alto:");
        int alto = scanner.nextInt();
		System.out.println("Proporciona el ancho:");
        int ancho = scanner.nextInt();
        
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        
        System.out.println("Area:" + area);
        System.out.println("Perimetro:" + perimetro);
    }
}
