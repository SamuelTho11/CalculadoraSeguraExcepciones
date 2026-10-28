/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraseguraexcepciones;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class CalculadoraSeguraExcepciones {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        try{
            System.out.println("Ingrese el primer numero: ");
            int n1 = Integer.parseInt(s.nextLine());
            System.out.println("Ingrese el segundo numero: ");
            int n2 = Integer.parseInt(s.nextLine());
            System.out.println("Ingrese la operacion a realizar: (+, -, *, /)");
            String operacion = s.nextLine();
            switch (operacion) {
                case "+" -> {
                    System.out.println("Suma = " + (n1+n2));
                }
                case "-" -> {
                    System.out.print("Resta = "+(n1-n2));
                }
                case "*" -> {
                    System.out.print("Multiplicacion = "+(n1*n2));
                }
                case "/" -> {
                    System.out.print("Division = "+ (n1/n2));
                }
                default -> throw new OperacionInvalidaException(operacion);
            }
        } catch (NumberFormatException ex){
            System.out.println("Error: Entrada no numerica invalida. " + ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println("Error: Division por cero. " + ex.getMessage());
        } catch (OperacionInvalidaException ex) {
            System.out.println(ex.getMessage());
        } finally{
            s.close();
        }
    }
}
//prueba commit
