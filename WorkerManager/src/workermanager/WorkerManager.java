
package workermanager;

import java.util.Scanner;

public class WorkerManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker worker1 = new Worker();

        while (true) {
            System.out.println("M E N U  D E  O P C I O N E S:");
            System.out.println("1. Ingresar jornada");
            System.out.println("2. Ingresar novedad");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Ingresar jornada
                    worker1.Workin_Day();
                case 2:
                    // Ingresar novedad
                    worker1.registerNews();
                    break;
                case 3:
                    // Salir del programa
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
    
