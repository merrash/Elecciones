import java.util.Scanner;

public class Elecciones{

	public static void main(String[] args) {
		
		Habitante habitante = new Habitante();
		
		String dni, nombre, apellidos
		int edad	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa DNI del habitante");
		dni = sc.nextString();

		System.out.println("Ingresa Nombre del habitante");
		nombre = sc.nextString();

		System.out.println("Ingresa Apellidos del habitante");
		apellidos = sc.nextString();

		System.out.println("Ingresa Edad del habitante");
		edad = sc.nextInt();
		
		// habitante.SetDni(ni);		
		// ni = habitante.dni();
		// System.out.println("\nEl DNI del habitante es: " + ni);
		
	}
}