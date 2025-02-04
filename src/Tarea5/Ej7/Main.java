package Tarea5.Ej7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> lista = new ArrayList<>();
        lista.add(new Estudiante("Patri", 12, 170));
        lista.add(new Estudiante("Manuel", 43, 173));
        lista.add(new Estudiante("Javier", 72, 189));
        lista.add(new Estudiante("Alicia", 52, 168));
        lista.add(new Estudiante("Alberto", 35, 189));

        System.out.println("Estudiantes sin ordenar:");
        for (Estudiante e : lista) {
            System.out.println(e);
        }

        Collections.sort(lista);

        System.out.println("\nEstudiantes ordenados(de mayor a menor):");
        for (Estudiante e : lista) {
            System.out.println(e);
        }
    }
}
