package elecciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Elecciones {

    public static void main(String[] args) {
        
        try {
            
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
            
            System.out.println("\n\nDatos Habitante:");
            System.out.println("DNI:" + dni);
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellidos: " + apellidos);
            System.out.println("Edad: " + edad);
            
            //datos Inmueble
            
            Inmueble inmueble = new Inmueble();
            String calle, puerta;
            int numero, piso;
            
            
            System.out.println("\n\nIngresa nombre calle");
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
            
            System.out.println("\n\nDatos Inmueble:");
            System.out.println(inmueble.getCalle() + " "
                    + inmueble.getNumero() + ","
                    + inmueble.getPiso() + " "
                    + inmueble.getPuerta()+ " ");
            
            
            //datos espacio publico
            EspacioPublico espacio = new EspacioPublico();
            String direccion, tipo;
            
            System.out.println("\n\nEscribe direccion del espacio publico");
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
            
            System.out.println("\n\nIngresa Nombre localidad");
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
            
            
            System.out.println("\n\nDatos Ayuntamiento:");
            System.out.println("Localidad: " + ayuntamiento.getLocalidad());
            System.out.println("Provincia: " + ayuntamiento.getProvincia());
            System.out.println("Nombre del Alcalde: " + ayuntamiento.getNomAlcalde());
            System.out.println("Partido politico del Alcalde: " + ayuntamiento.getPartidoAlcalde());
            
            //datos partidos
            Partido partido = new Partido();
            String nombrePartido, alineacion, sede, presidente;
            
            System.out.println("\n\nIngresa nombre del partido");
            nombrePartido = sc.next();
            partido.setNombrePartido(nombrePartido);
            
            System.out.println("Ingresa alineacion del partido");
            alineacion = sc.next();
            partido.setAlineacion(alineacion);
            
            
            System.out.println("Ingresa sede del partido");
            sede = sc.next();
            partido.setSede(sede);
            
            System.out.println("Ingresa presidente del partido");
            presidente = sc.next();
            partido.setPresidente(presidente);
            
            System.out.println("\n\nDatos Partido:");
            System.out.println("Nombre del partido: " + partido.getNombrePartido());
            System.out.println("Alineacion: " + partido.getAlineacion());
            System.out.println("Sede: " + partido.getSede());
            System.out.println("Presidente: " + partido.getPresidente());
            
            System.out.println("\n\nLectura archivo listadoPartidos\n");
            
            File f = new File( "C:\\Users\\TIBURON\\Documents\\NetBeansProjects\\Elecciones\\src\\elecciones\\listadoPartidos.txt" );
            BufferedReader entrada;
            try {
                entrada = new BufferedReader( new FileReader( f ) );
                String linea;
                
                while(entrada.ready()){
                    linea = entrada.readLine();
                    System.out.println(linea);
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
            
            
            Scanner s = new Scanner(new File("C:\\Users\\TIBURON\\Documents\\NetBeansProjects\\Elecciones\\src\\elecciones\\listadoPartidos.txt"));
            ArrayList<String> list = new ArrayList<String>();
            while (s.hasNext()) {
                list.add(s.next());
            }
            s.close();                                        
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Elecciones.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}