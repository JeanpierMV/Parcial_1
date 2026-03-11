package biblioteca.app;

import biblioteca.model.*;
import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // libro1 usando constructor completo con nuevos atributos
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 5, 0,
                1943, "978-0156012195", 0);
        System.out.println("libro1 creado: " + libro1);

        // libro2 using default and data from console
        Libro libro2 = new Libro();
        System.out.println("Ingrese datos para libro2:");
        System.out.print("Título: ");
        libro2.setTitulo(sc.nextLine());
        System.out.print("Autor: ");
        libro2.setAutor(sc.nextLine());
        System.out.print("Número ejemplares: ");
        libro2.setNumEjemplares(Integer.parseInt(sc.nextLine()));
        System.out.print("Número prestados: ");
        libro2.setNumPrestados(Integer.parseInt(sc.nextLine()));
        System.out.println("libro2 creado: " + libro2);

        // LibroTextoUNIAC
        LibroTextoUNIAC uniac = new LibroTextoUNIAC("Cálculo I", "Gilbert Strang", 3, 1, "Cálculo", "Ingeniería");
        System.out.println("textoUNIAC: " + uniac);

        // Novela
        Novela novela = new Novela("1984", "George Orwell", 4, 2, Novela.Tipo.Ciencia_Ficcion);
        System.out.println("novela: " + novela);

        // probar préstamos y devoluciones
        System.out.println("\nProbando operaciones de préstamo/devolución:");
        System.out.println("Intentar préstamo en libro1: " + libro1.prestamo());
        System.out.println("Estado libro1: " + libro1);
        System.out.println("Intentar devolución en libro1: " + libro1.devolucion());
        System.out.println("Estado libro1: " + libro1);

        System.out.println("Intentar devolución sin existencia en libro2: " + libro2.devolucion());
        System.out.println("Reservar libro2 (cuando no hay disponibles): " + libro2.reservar());
        System.out.println("Intentar préstamo en novela: " + novela.prestamo());
        System.out.println("Estado novela: " + novela);

        sc.close();
    }
}