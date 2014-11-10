import java.util.Scanner;

public class Elecciones{

	public static void main(String[] args) {
		
                //datos habitante
		Habitante habitante = new Habitante();
		
		String dni, nombre, apellidos;
		int edad;	
		
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingresa DNI del habitante");
		dni = sc.next();
                habitante.setDni(dni);
                

                
		System.out.println("Ingresa Nombre del habitante");
		nombre = sc.next();
                habitante.setNombre(nombre);

                
		System.out.println("Ingresa Apellidos del habitante");
		apellidos = sc.next();
                habitante.setApellidos(apellidos);

		System.out.println("Ingresa Edad del habitante");
		edad = sc.nextInt();
                habitante.setEdad(edad);

                System.out.println("DNI:" + dni);
                System.out.println("Nombre: " + nombre); 
                System.out.println("Apellidos: " + apellidos);
                System.out.println("Edad: " + edad);
                
                //datos Inmueble
                
                Inmueble inmueble = new Inmueble();
		String calle, puerta;
		int numero, piso;
				
				
				System.out.println("Ingresa nombre calle");
				calle = sc.next();
				inmueble.setCalle(calle);

				System.out.println("Ingresa numero portal");
				numero = sc.nextInt();
				inmueble.setNumero(numero);

				System.out.println("Ingresa numero piso");
				piso = sc.nextInt();
				inmueble.setPiso(piso);

				System.out.println("Ingresa puerta mano");
				puerta = sc.next();
				inmueble.setPuerta(puerta);

				System.out.println(inmueble.getCalle() + " "
			+ inmueble.getNumero() + ","
			+ inmueble.getPiso() + " "
			+ inmueble.getPuerta()+ " ");
	
		
	}
}
