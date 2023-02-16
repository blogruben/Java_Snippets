package org.ruben.ficheros.ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class IOFichero {

    /**
	 * Leemos un fichero y devolvemos un String con el contenido.
	 * El encoding puede ser por ejemplo "ISO-8859-1" o "UTF-8"
     */
    static String leerFichero( String rutaNombreFichero, String encoding ) {
		File file = new File(rutaNombreFichero);
		try(InputStream oIs = new FileInputStream(file))  {
			byte[] abBuffer = new byte[oIs.available()];
			oIs.read( abBuffer, 0, oIs.available() );
			return new String( abBuffer, encoding );
		} catch ( IOException exp ) {
			throw new RuntimeException("Error al leer los archivo: "+rutaNombreFichero, exp);
		}
	}

	static void escribirFichero(String nombreFicheroConRuta, String contenido) {
		try(FileWriter file = new FileWriter(nombreFicheroConRuta);BufferedWriter output = new BufferedWriter(file);) {
		  	output.write(contenido);
		} catch (IOException e) {
			throw new RuntimeException("Error al escribir en el fichero "+nombreFicheroConRuta, e);
		}
	}

	static List<String> leeFicheroPorLineas(String nombrearchivo) {
        List<String> result;
        try (Stream<String> lines = Files.lines(Paths.get(nombrearchivo))) {
            result = lines.collect(Collectors.toList());
        } catch ( IOException exp ) {
			throw new RuntimeException("Error al leer el archivo: "+nombrearchivo, exp);
		}
        return result;

    }


	static List<Fichero> listarFicherosDeUnDirectorio(String directorio){
		File carpeta = new File(directorio);
		String[] listado = carpeta.list();
		List<Fichero> ficheros = new ArrayList<>();
		if (listado == null || listado.length == 0) {
			System.out.println("No hay elementos dentro de la carpeta actual");
		}
		else {
			for (int i=0; i< listado.length; i++) {
				ficheros.add(new Fichero(listado[i],directorio));
			}
		}
		return ficheros;
	}





}
