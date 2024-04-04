package apartado1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArbolTUI {
    // Scanner
    public static Scanner sc = new Scanner(System.in);

    // Array
    public static ArrayList<ArbolFrutal> listArboles = new ArrayList<>();


    //main
    public static void main(String[] args) {
        // Variables
        byte uIndice = -1;
        listArboles.add(new ArbolFrutal("Cerezo", (short) 68, "Cerezas"));
        listArboles.add(new ArbolFrutal("Manzano", (short) 19, "Manzanas"));

        // Programa
        do {
            try {
                indice();
                uIndice = Byte.parseByte(sc.nextLine());
                switch (uIndice) {
                    case 0 -> System.out.println("Cerrando el programa...");
                    case 1 -> System.out.println(mostrarAll());
                    case 2 -> listArboles.add(new ArbolFrutal(pedirEspecie(), pedirEdad(), pedirFruta()));
                    case 3 -> System.out.println("La edad media de los arboles es " + calcularEdadMedia());
                    default -> System.out.println("Indice introducido no valido");
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
                1\tMostrar todos los arboles.
                2\tAñadir nuevos arboles.
                3\tCalcular edad media de todos los arboles.
                0\tCerrar el programa.
                ----------
                """);
    }

    // pedirUsuario
    public static String pedirEspecie() {
        System.out.println("Introduce la especie del arbol:");
        return sc.nextLine();
    }

    public static Short pedirEdad() {
        System.out.println("Introduce la edad del arbol:");
        return Short.parseShort(sc.nextLine());
    }

    public static String pedirFruta() {
        System.out.println("Introduce la fruta que da el arbol:");
        return sc.nextLine();
    }

    // mostrarAll
    public static String mostrarAll() {
        StringBuilder rString = new StringBuilder();
        for (ArbolFrutal arbol : listArboles) {
            rString.append(arbol.toString()).append('\n');
        }
        return rString.toString();
    }

    //calcularEdadMedia
    public static float calcularEdadMedia() {
        float rFloat = 0;
        for (ArbolFrutal arbol : listArboles) {
            rFloat += arbol.getEdad();
        }
        return rFloat / listArboles.size();
    }
}
