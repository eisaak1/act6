package com.company;


import static com.company.Alumno.*;

class AlumnoTest {
    public static  void main(String[] args) {
        double[] calificaciones = {89,75,80,89,95};
        Alumno.setNombre("Erik Isaak");
        Alumno.setCalificaciones(calificaciones);
        iimprimirResultados();
    }
}



