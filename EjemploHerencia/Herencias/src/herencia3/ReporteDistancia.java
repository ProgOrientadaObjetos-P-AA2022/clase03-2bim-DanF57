/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

public class ReporteDistancia extends Reporte {

    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;

    public ReporteDistancia(String nombre, String carrera, String ciclo) {
        super(nombre, carrera, ciclo);

    }

    public void establecerLista(ArrayList<EstudianteDistancia> listado) {
        lista = listado;
    }

    public void establecerTotalMatriculasDistancia() {

        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia
                    + lista.get(i).obtenerMatriculaDistancia();
        }
    }

    public ArrayList<EstudianteDistancia> obtenerLista() {
        return lista;
    }

    public double obtenerTotalMatriculasDistancia() {
        return totalMatriculaDistancia;
    }

    @Override
    public String toString() {
        //String cadenaEstudiantes = String,format("%s\n, "Lista Estudiantes");
        /*
        for (int i = 0; i < lista.size(); i++) {
            cadenaEstudiantes = String.format("%s%s\n",
                            cadenaEstudiantes,
                            lista.get(i));
        }
        */
        String cadena = String.format("%s\nCarrera: %s \n"
                + "Ciclo: %s\n\n"
                + "Lista de Estudiantes\n",
                nombre,
                carrera,
                ciclo);

        for (int i = 0; i < lista.size(); i++) { //Obtener toString de cada objeto
            cadena = String.format("%s\n%s\n",
                    cadena,
                    lista.get(i));
        }

        cadena = String.format("%sEl total de matriculas es: %.2f\n",
                cadena,
                totalMatriculaDistancia);
        return cadena;
    }
}
