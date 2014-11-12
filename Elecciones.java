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
	
			
			//datos espacio publico
                        EspacioPublico espacio = new EspacioPublico();
                        String direccion, tipo;
                        
                        System.out.println("Escribe direccion del espacio publico");
                        direccion = sc.next();
                        espacio.setDireccion(direccion);
                        
                        String A = "Ayuntamiento";
                        String B = "Centro Cultural";
                        String C = "Centro Polideportivo";
                        System.out.println("Elige tipo del espacio publico: \nA - Ayuntamiento \nB - Centro cultural \nC - Centro Polideportivo");
                        tipo = sc.next();
                        
                        if(tipo.equalsIgnoreCase("A") || tipo.equalsIgnoreCase("B") || tipo.equalsIgnoreCase("C")){
                            
                            System.out.println("Tipo Espacio: " + tipo);
                        }else {
                            System.out.println("Tipo novalido");
                        }
                 
                        
                        //datos ayuntamiento
                        Ayuntamiento ayuntamiento = new Ayuntamiento();
                        String localidad, provincia, nomAlcalde, partidoAlcalde;
                        
                        System.out.println("Ingresa Nombre localidad");
                        localidad = sc.next();
                        ayuntamiento.setLocalidad(localidad);
                        
                        System.out.println("Ingresa Nombre provincia");
                        provincia = sc.next();
                        ayuntamiento.setProvincia(provincia);
                        
                        System.out.println("Ingresa Nombre del Alcalde");
                        nomAlcalde = sc.next();
                        ayuntamiento.setNomAlcalde(nomAlcalde);
                        
                                               
                        System.out.println("Ingresa Nombre del partido politico del Alcalde");
                        partidoAlcalde = sc.next();
                        ayuntamiento.setPartidoAlcalde(partidoAlcalde);
                        
                        
                        
                        System.out.println("Localidad: " + ayuntamiento.getLocalidad());
                        System.out.println("Provincia: " + ayuntamiento.getProvincia()); 
                        System.out.println("Nombre del Alcalde: " + ayuntamiento.getNomAlcalde());
                        System.out.println("Partido politico del Alcalde: " + ayuntamiento.getPartidoAlcalde());
                        
                        //datos partidos
                        Partido partido = new Partido();
                        String private String nombrePartido, alineacion, sede, presidente;

                        System.out.println("_Ingresa nombre del Partido");
                        nombrePartido = sc.next();
                        Partido.setNombrePartido(nombrePartido);

                        System.out.println("_Ingresa alineacion del Partido");
                        alineacion = sc.next();
                        Partido.setAlineacion(alineacion);

                        System.out.println("_Ingresa ciudad de la sede");
                        sede = sc.next();
                        Partido.setSede(sede);

                        System.out.println("_Ingresa nombre del Presidente");
                        presidente = sc.next();
                        presidente.setPresidente(presidente);

                        System.out.println("nombre del Partido: " + partido.getnombrePartido());
                        System.out.println("Alineacion: " + partido.getAlineacion()); 
                        System.out.println("Sede: " + partido.getSede());
                        System.out.println("Presidente: " + partido.getPresidente());
                        
    
                        
	}
}
