package org.ruben.ficheros.ficheros;

import java.util.List;
import java.util.ListIterator;


class ContadorFicheros {

    private static volatile int totalFicherosProcesados;
    private static volatile List<Fichero> listadoFicheros;
    private static volatile int numeroFicherosProcesados;

    static  void init(List<Fichero> ficheros) {
        totalFicherosProcesados = ficheros.size();
        numeroFicherosProcesados = 0;
        listadoFicheros = ficheros;
    }

    static synchronized Fichero getSiguienteFichero() {
        ListIterator<Fichero> iterator = listadoFicheros.listIterator();
        Fichero fichero = null;
        if (iterator.hasNext()) {
            fichero = iterator.next();
            iterator.remove();
            numeroFicherosProcesados++;
        }
        return fichero;
    }

    static boolean haTerminado() {
        return numeroFicherosProcesados == totalFicherosProcesados;
    }

    static int getTotalFicherosProcesados() {
        return totalFicherosProcesados;
    }

    static int getNumeroFicherosProcesados() {
        return numeroFicherosProcesados;
    }




    


}
