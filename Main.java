package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = scanner.nextInt();
        System.out.println("Proporciona el precio:");
        double precio = scanner.nextDouble();
        System.out.println("Proporciona el simbolo:");
        char simbolo = scanner.nextLine().charAt(0);
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = scanner.nextBoolean();
 
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
