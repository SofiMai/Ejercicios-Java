/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author sofimai
 * Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.

¿Qué son los números primos?
Básicamente, un número primo es un número natural que tiene solo dos
divisores o factores: 1 y el mismo número. Es decir, es primo aquel
número que se puede dividir por uno y por el mismo número.
El primer número primo es 2, y hay 25 números primos entre 1 y 100,
ellos son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
71, 73, 79, 83, 89 y 97.
3
 */


public class Ejercicio_4_Guia3 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in); 
    
        System.out.println("Ingrese un numero entero y el sistema le dira si este es primo");
        int num = leer.nextInt();
        boolean esprimo = EsPrimo(num);
        
        System.out.println("El numero ingresado es primo? " + esprimo);
        
    }
    
    public static boolean EsPrimo(int num) {
    boolean respuesta = false;
    
    int contador = 0;
    int divisor = 1;
    int resto;
    
    do {
        resto = num % divisor;
        divisor++;
        if (resto == 0) {
        contador++;
        } 
    } while (contador <= 2 && divisor <= num);
        
    if (contador == 2) {
        respuesta = true;
    } 
    
    return respuesta;    
    }
    
}