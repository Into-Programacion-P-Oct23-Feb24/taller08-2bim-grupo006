/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double fahrenheit = 20;
        int incremento = 4;

        for (int i = 0; i < 20; i++) {
  
            double celsius = (5.0/9.0 * (fahrenheit - 32));

            System.out.println("Fahrenheit | Celsius");
            System.out.printf("%.2f\t\t%.2f\n", fahrenheit, celsius);

            fahrenheit += incremento;
        }
    }
}

