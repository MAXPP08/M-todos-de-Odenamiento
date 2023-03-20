/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 18/03/2023
 * Fecha de Actualización: 20/03/2023
 * Descripción: Programa que implementa los métodos de ordenación de Burbuja
 *              implementando una interfaz gráfica
 */

package metodos.de.ordenamiento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MetodoBurbujaSinEditor extends JFrame {
    private JPanel panel;
    private JLabel etiqueta;
    private JLabel etiquetaInstrucciones;
    private JTextField entradaDatos;
    private JButton botonOrdenar;
    private JTextField salidaDatos;
    private JLabel etiquetaResultados;
    
    public MetodoBurbujaSinEditor() {
        // Configurar la ventana
        setTitle("Método Burbuja");
        setSize(470, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Crear el panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(470, 300));
        panel.setBackground(new Color(153, 153, 255));

        // Agregar la etiqueta
        etiqueta = new JLabel("Método Burbuja");
        etiqueta.setFont(new Font("Arial", Font.PLAIN, 36));
        panel.add(etiqueta);
        
        // Agregar las instrucciones
        etiquetaInstrucciones = new JLabel("Ingresa los Números a Ordenar Separados por Espacios ' '");
        etiquetaInstrucciones.setFont(new Font("Arial", Font.PLAIN, 14));
        etiquetaInstrucciones.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(etiquetaInstrucciones);
        panel.add(Box.createRigidArea(new Dimension(0, 60)));

        // Agregar el JTextField Entrada de Datos
        entradaDatos = new JTextField(30);
        entradaDatos.setFont(new Font("Arial", Font.PLAIN, 12));
        entradaDatos.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(entradaDatos);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

         // Agregar el botón
        botonOrdenar = new JButton("Ordenar");
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(botonOrdenar);
        
        botonOrdenar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ordenar();
            }
        });
        
        // Agregar la etiqueta Resultados
        etiquetaResultados = new JLabel("Resultado");
        etiquetaResultados.setFont(new Font("Arial", Font.PLAIN, 14));
        etiquetaResultados.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        panel.add(etiquetaResultados);
        panel.add(Box.createRigidArea(new Dimension(-5,50)));       
        
        // Agregar el JTextField Salida de Datos
        salidaDatos = new JTextField(30);
        salidaDatos.setFont(new Font("Arial", Font.PLAIN, 12));
        salidaDatos.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(salidaDatos);
        panel.add(Box.createRigidArea(new Dimension(290, -120)));
        
        // Agregar el panel a la ventana
        add(panel);
    }
    
    private void ordenar() {
        // Obtener los números del JTextField
        String strNumeros = entradaDatos.getText();

        // Convertir la cadena de números a un arreglo de enteros
        String[] strArregloNumeros = strNumeros.split("\\s+");
        int[] numeros = new int[strArregloNumeros.length];
        for (int i = 0; i < strArregloNumeros.length; i++) {
            numeros[i] = Integer.parseInt(strArregloNumeros[i]);
        }

        // Ordenar el arreglo de números utilizando el algoritmo de la burbuja
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        
        // Mostrar el resultado en el JTextArea
        String strResultado = "";
        for (int i = 0; i < numeros.length; i++) {
            strResultado += numeros[i] + " ";
        }
        salidaDatos.setText(strResultado);
    }

    public static void main(String[] args) {
        MetodoBurbujaSinEditor ventana = new MetodoBurbujaSinEditor();
        ventana.setVisible(true);
    }
}


