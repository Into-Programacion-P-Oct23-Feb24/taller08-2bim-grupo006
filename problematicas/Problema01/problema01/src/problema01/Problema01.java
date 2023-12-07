/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        String cadenaEdades = "";
        int sumaEs = 0;
        double sumaEd = 0;

        System.out.println("Ingrese el numero de jugadores");
        int numero = entrada.nextInt();
        entrada.nextLine();
        for (int i = 1; i <= numero; i++) {
            System.out.println("Ingrese el nombre y apellido del jugador");
            String jugador = entrada.nextLine();
            System.out.println("Ingrese la posicion en la que juega el jugador");
            String posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            int edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            double estatura = entrada.nextDouble();
            entrada.nextLine();
            cadenaFinal = String.format("%s%d. %s -%s-, edad %d, estatura "
                    + "%.2f\n", cadenaFinal, i, jugador,
                    posicion, edad, estatura);

            sumaEd = sumaEd + edad;
            sumaEs = sumaEs + edad;
            cadenaEdades = String.format("%s %d", cadenaEdades, edad);

        }
        double promedioEd = sumaEd / numero;
        double promedioEs = sumaEs / numero;

        System.out.printf("Listado de Jugadores\n\n%s\nListado de Edades%s\n\n"
                + "Promedio de edades: %.2f Promedio de estaturas: %.2f",
                cadenaFinal, cadenaEdades, promedioEd, promedioEs);
    }
}
