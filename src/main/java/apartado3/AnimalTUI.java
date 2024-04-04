package apartado3;


import apartado2.PanDulce;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalTUI {
    // Scanner
    public static Scanner sc = new Scanner(System.in);

    //main
    public static void main(String[] args) {
        // Variables
        byte uIndice = -1;

        // Programa
        do {
            try {
                indice();
                uIndice = Byte.parseByte(sc.nextLine());
                switch (uIndice) {
                    case 0 -> System.out.println("Cerrando el programa...");
                    case 1 -> addAnimal();
                    case 2 -> AnimalDAO.delete(pedirCrotal());
                    case 3 -> AnimalDAO.update(new Animal(pedirCrotal(), pedirEdad(), pedirProduccion()));
                    case 4 -> mostrarAnimalesProduccion(pedirProduccion());
                    default -> System.out.println("Indice no valido");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (uIndice != 0);
        sc.close();
    }

    // indice
    public static void indice() {
        System.out.println("""
                ----- Indice -----
                1\tAlta.
                2\tBaja.
                3\tModificación por Crotal.
                4\tConsultar todos los animales cuya producción sea mas de la indicada.
                0\tCerrar el programa.
                ----------
                """);
    }

    // pedirUsuario
    public static int pedirCrotal() {
        System.out.println("Introduce crotal:");
        return Integer.parseInt(sc.nextLine());
    }

    public static int pedirEdad() {
        System.out.println("Introduce edad:");
        return Integer.parseInt(sc.nextLine());
    }

    public static int pedirProduccion() {
        System.out.println("Introduce producción:");
        return Integer.parseInt(sc.nextLine());
    }

    // addAnimal
    public static void addAnimal() {
        int crotal = pedirCrotal();
        if (!AnimalDAO.existe(crotal)) {
            AnimalDAO.create(new Animal(crotal, pedirEdad(), pedirProduccion()));
        } else {
            System.out.println("Ya hay un animal con ese codigo");
        }
    }

    //mostrarAnimalesProduccion
    public static void mostrarAnimalesProduccion(int produccionMin) {
        for (Animal animal : AnimalDAO.arrayCompleto()) {
            if (animal.getProduccion() > produccionMin) {
                System.out.println(animal.toString());
            }
        }
    }
}
