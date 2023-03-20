/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 18/03/2023
 * Fecha de Actualización: 20/03/2023
 * Descripción: Programa que implementa los métodos de ordenación de Burbuja
 *              (Sin implementar una interfaz gráfica)
 */

package metodos.de.ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodoBurbuja {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], numEelemtos, aux;
        
        numEelemtos = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de Elemntos para el arreglo: "));
        
        arreglo = new int[numEelemtos]; // le asigmanos el numero de elementos al arreglo
        
        // Solicitamos los Datos al Usuario
        for (int i = 0; i < numEelemtos; i++) {
            System.out.print(i+1 + ".-Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        // Método burbuja
        for (int i = 0; i < (numEelemtos-1); i++) {
            for (int j = 0; j < (numEelemtos-1); j++) {
                if (arreglo[j] > arreglo[j+1]) { //Si NumeroActual > NumeroSiguiente
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        
        // Mostrando el arreglo en forma creciente
        System.out.println("Arreglo Ordenado de Forma Creciente: ");
        for (int i = 0; i < numEelemtos; i++) {
            System.out.print(arreglo[i]+ " - ");
        }
        System.out.println("");
    }
}
