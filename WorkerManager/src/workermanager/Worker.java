
package workermanager;

import java.util.Scanner;

public class Worker extends Licenses {
    private String name;
    private String id;
    private int HoursWorked;

    public void Workin_Day() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre completo: ");
        this.name = scanner.nextLine();
        System.out.print("Ingrese su cédula: ");
        this.id = scanner.nextLine();
        System.out.print("Ingrese la cantidad de horas trabajadas,(como mimino 8 horas)): ");
        this.HoursWorked= scanner.nextInt();

        if (this.HoursWorked < 8) {
            System.out.println(" Faltan " + (8 - this.HoursWorked) + " horas para cumplir con la jornada laboral.");
        } else {
            System.out.println("Resgistro exitoso.");
        }
    }
    
   public void registerNews() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de novedad:");
        System.out.println("1. Licencias");
        System.out.println("2. Incapacidades");
        System.out.println("3. Vacaciones");
        System.out.println("4. Permisos");
        System.out.print("Ingrese el número de la opción: ");
        int optionNews = scanner.nextInt();

        switch (optionNews) {
            case 1:
                // Licencias
                registerLicenses();
                break;
            case 2:
                // Incapacidades
                registerInability();
                break;
            case 3:
                // Vacaciones
                registerVacation();
                break;
            case 4:
                // Permisos
               registerPermission();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
 }

