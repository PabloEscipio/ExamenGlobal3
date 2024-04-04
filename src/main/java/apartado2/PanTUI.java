package apartado2;

import apartado1.ArbolFrutal;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PanTUI {
    // Scanner
    public static Scanner sc = new Scanner(System.in);

    // Array
    public static ArrayList<PanDulce> listPanDulce = new ArrayList<>();

    //main
    public static void main(String[] args) {
        // Variables
        byte uIndice = -1;

        listPanDulce.add(new PanDulce("Bollo", 2.5f, 6));
        listPanDulce.add(new PanDulce("Panecillo", 1.5f, 4));

        // Programa
        do {
            try {
                indice();
                uIndice = Byte.parseByte(sc.nextLine());
                switch (uIndice) {
                    case 0 -> System.out.println("Cerrando el programa...");
                    case 1 -> System.out.println(mostrarAll());
                    case 2 -> listPanDulce.add(new PanDulce(pedirNombre(), pedirPrecio(), pedirCantidadAzucar()));
                    case 3 -> incrementarPrecio10();
                    case 4 -> volcarDatos();
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
                1\tMostrar todos los panes.
                2\tNuevo pan dulce.
                3\tAumentar precio del pan en un 10%.
                4\tVolcar datos sobre panes a un fichero.
                0\tCerrar el programa.
                ----------
                """);
    }

    // pedirUsuario
    public static String pedirNombre() {
        System.out.println("Introduzca nombre del pan:");
        return sc.nextLine();
    }

    public static float pedirPrecio() {
        System.out.println("Introduzca precio del pan:");
        return Float.parseFloat(sc.nextLine());
    }

    public static int pedirCantidadAzucar() {
        System.out.println("Introduzca cuantos gramos de azucar contiene el pan:");
        return Integer.parseInt(sc.nextLine());
    }

    // mostrarAll
    public static String mostrarAll() {
        StringBuilder rString = new StringBuilder();
        for (PanDulce panDulce : listPanDulce) {
            rString.append(panDulce.toString()).append('\n');
        }
        return rString.toString();
    }

    // volcarDatos
    public static void volcarDatos() {
        FileWriter fwListPanes;
        try {
            fwListPanes = new FileWriter("txt/panes.txt");
            fwListPanes.write(mostrarAll());
            fwListPanes.close();
            System.out.println("Hecho!!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // incrementarPrecio10
    public static void incrementarPrecio10() {
        for (PanDulce panDulce : listPanDulce) {
            panDulce.setPrecio(panDulce.getPrecio() * 1.10f);
        }
        System.out.println(mostrarAll());
    }
}
