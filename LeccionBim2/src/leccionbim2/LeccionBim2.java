/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccionbim2;

/**
 *
 * @author Anderson Aguirre
 */
public class LeccionBim2 {

    public static void main(String[] args) {

// Declaracion de todas las variables y arreglos a utilizar.
        int[] arregloA = {110, 220, 430, 140, 250, 460};
        int[] arregloB = {10, 20, 30, 40, 50, 60};
        double promedio;
        double sumat = 0;
        double[] arregloC = new double[6];

// El ciclo for siguiente recorrera el Arreglo
        for (int contador = 0; contador < arregloC.length; contador++) {

// Calcula el promedio de todos los arreglos y los almacena en arregloC:
            arregloC[contador] = (arregloA[contador] + arregloB[contador]) / 2;

// Suma y guarda los valores almacenados en el arregloC:
            sumat = sumat + arregloC[contador];
        }

// Presenta los Titulos a mostrar:
        System.out.printf("%s\t%s\t%s\t\n", "    Arreglo1(A)", "    Arreglo2(B)", "\t      Resultado:");

//El ciclo for recorre el arregloC:
        for (int contador1 = 0; contador1 < arregloC.length; contador1++) {
            System.out.printf("\t%d\t\t%d\t\t\t%.2f\n", arregloA[contador1], arregloB[contador1], arregloC[contador1]);

// Realiza el promedio y luego lo presenta:
            promedio = (sumat / 6);
            System.out.printf("El promedio de los arreglos es: %.2f\n", promedio);
            System.out.printf("%s\n", "***************************************************************");
        }
    }
}
