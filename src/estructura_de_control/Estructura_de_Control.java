/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_de_control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Juan Carlos Reyes Barreto
 */
public class Estructura_de_Control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Hola Mundo");
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Ingresar la cantidad de su salario");
        double salario = Double.parseDouble(leer.readLine());
    }
    
}
