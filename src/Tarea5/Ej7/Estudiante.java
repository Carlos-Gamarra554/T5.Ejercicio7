package Tarea5.Ej7;

public class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private int edad;
    private double altura;

    public Estudiante(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return this.nombre + " - Altura: " + this.altura + " - Edad: " + this.edad;
    }

    @Override
    public int compareTo(Estudiante o) {
        if (this.altura != o.altura) {
            return Integer.compare((int) o.altura, (int) this.altura);
        }
        return Integer.compare(o.edad, this.edad);
    }
}
