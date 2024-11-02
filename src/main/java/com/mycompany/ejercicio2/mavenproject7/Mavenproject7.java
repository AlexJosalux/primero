/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2.mavenproject7;
import java.util.Scanner;
/**
 *
 * @author ItsqmetEstudiantes
 */
public class Mavenproject7 {

    public static void main(String[] args) {
        //Ejercicio 4
        Scanner leer=new Scanner(System.in);
        double calificacion;
        System.out.println("Ingresar calificacion:");
        calificacion=leer.nextDouble();
        if (calificacion>90 && calificacion <=100) {
            System.out.println("El alumno tiene A");
        }else if (calificacion>=80 && calificacion <89) {
            System.out.println("El Alumno tiene B");
        }else if (calificacion>=70 && calificacion <79) {
            System.out.println("El Alumno tiene C");
        }else if (calificacion>=60 && calificacion <69) {
            System.out.println("El Alumno tiene D");
        }else if (calificacion<60) {
            System.out.println("El Alumno tiene F");               
        }
       
       

        
    }
}
