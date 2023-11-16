
package workermanager;

import java.util.Scanner;

public class Licenses {
    // creacion de metodo para registrar licencia
    public void registerLicenses() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de licencia:");
        System.out.println("1. Temporal (1 a 4 días)");
        System.out.println("2. Maternidad (1 hasta maximo 180 días)");
        System.out.println("3. Paternidad (1 hasta 15 días maximo)");
        System.out.print("Ingrese el número de la opción que necesita: ");
        int optionLicenses = scanner.nextInt();

        switch (optionLicenses) {
            case 1:
                // Licencia temporal
                System.out.print("Ingrese la cantidad de días de licencia temporal: ");
                int temporaryDays = scanner.nextInt();
                if (temporaryDays >= 1 && temporaryDays <= 4) {
                    System.out.println("Licencia temporal registrada con exito.");
                } else {
                    System.out.println("Debe tomar vacaciones en lugar de una licencia temporal.");
                }
                break;
            case 2:
                // Licencia de maternidad
                System.out.print("Ingrese la cantidad de días de licencia de maternidad: ");
                int maternityDays = scanner.nextInt();
                if (maternityDays >= 1 && maternityDays <= 180) {
                    System.out.println("Días de maternidad registrados con exito.");
                } else {
                    System.out.println("No puedes sacar mas de 180 dias de licencia.");
                }
                
                break;
            case 3:
                // Licencia de paternidad
                System.out.print("Ingrese la cantidad de días de licencia de paternidad: ");
                int fatherhoodDays = scanner.nextInt();
                if (fatherhoodDays >= 1 && fatherhoodDays <= 15) {
                    System.out.println("Días de paternidad registrados con exito.");
                } else {
                    System.out.println("No puedes sacar mas de 15 dias de licencia.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    
    public void registerInability() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de días de incapacidad (1 a 20 días): ");
        int  inabilityDays = scanner.nextInt();
        if ( inabilityDays >= 1 &&  inabilityDays <= 20) {
            System.out.println("Días de incapacidad registrados con exito.");
        } else {
            System.out.println("Cantidad de días de incapacidad no válida.");
        }
    }

    public void registerVacation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de días de vacaciones (1 a 15 días): ");
        int VacationDays = scanner.nextInt();
        if (VacationDays >= 1 && VacationDays <= 15) {
            System.out.println("Días de vacaciones registrados con exito.");
        } else {
            System.out.println("La cantidad de días de vacacines no es válida.");
         }
    }
    
    public void registerPermission() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas que necesita para su permiso (1h a 5h): ");
        int permissionHours = scanner.nextInt();
        if (permissionHours >= 1 && permissionHours <= 5) {
            System.out.println("Horas de permiso registradas con exito.");
        } else {
            System.out.println("La cantidad de horas supera el limite, se le recomienda tomar 1 dia de vaciones o solicitar una licencia temporal.");
         }
    }
}
