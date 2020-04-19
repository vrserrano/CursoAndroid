package main1;
import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		System.out.println("Proporciona el alto:");
        int alto = scanner.nextInt();
		System.out.println("Proporciona el ancho:");
        int ancho = scanner.nextInt();
        
        int area = alto * ancho;
        
        System.out.println("Area:" + area);
        
        int perimetro = (alto + ancho) * 2;
        
        System.out.println("Perimetro:" + perimetro);

	}

}
