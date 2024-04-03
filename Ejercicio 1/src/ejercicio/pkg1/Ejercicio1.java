package ejercicio.pkg1;

import java.util.Scanner;

/*
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 */
public class Ejercicio1 {
    public static void main(String[] args) { 
        
        //Importar un scanner para el futuro
        Scanner teclado = new Scanner(System.in);
        //Operadores: aritmeticos, de asignacio, de comparacio, logicos y ternarios
        //Aritmericos:
        
        int num1 = 10;
        int num2 = 3;
        double num3;
        //Suma
        num3 = num1 + num2;
        System.out.println("Suma " + num3);
        //Resta
        num3 = num1 - num2;
        System.out.println("Resta " + num3);
        //Multiplicacion
        num3 = num2 * num3;
        System.out.println("Multiplicaion " + num3);
        //Division
        num3 = num1 / num2;
        System.out.println("División " + num3);
        //Modulo %
        num3 = num1%num2;
        System.out.println("Residuo de división " + num3);
        
        //Operador de asignacion
        int x = 10;
        System.out.println("Antes X = " + x);
        x += 5;
        System.out.println("Ahora X = " + x);
        
        //Operador de comparacion
        double a, b;
        System.out.println("---------");
        System.out.println("Operador de comparacion");
        System.out.println("Teclea el valor numérico para a");
        a = teclado.nextDouble();
        System.out.println("Teclea el valor numérico para b");
        b = teclado.nextDouble();
        
        
        
        //Comprobar si son iguales
        boolean igual = (a == b);
        System.out.println("Son iguales? " + igual);
        //Comprobar si son diferentes
        boolean noIgual = (a != b); 
        System.out.println("Son distintos? " + noIgual);
        //Comprobar si a es mayor que b
        boolean mayorQue = (a > b);
        System.out.println("a es mayor que b? " + mayorQue);
        //Comprobar si a es menor que b
        boolean menorQue = (a < b);
        System.out.println("a es menor que b? " + menorQue);
        //Comprobar si a es menor o igual que b
        boolean menorIgual = (a <= b);
        System.out.println("a <= b? " + menorIgual);
        //Comprobar si a es mayor o igual a b
        boolean mayorIgual = (a >= b);
        System.out.println("a >= b? " + mayorIgual);
        System.out.println("-----------");
        
        //Operadores lógicos
        boolean xx = true;
        boolean yy = false;
        
        boolean andLogico = (xx && yy);
        System.out.println("Es verdadeo xx y yy? " + andLogico);
        boolean orLogico = (xx || yy);
        System.out.println("Es verdadero xx Ó yy? " + orLogico);
        boolean notLogico = !xx;
        System.out.println("Valor inverso de xx " + notLogico);
        
        //Operador ternario
        double promedio;
        String mensaje;
        
        System.out.println("Teclea el promedio del estudiante: ");
        promedio = teclado.nextDouble();
        mensaje = promedio >= 6 ? "Aprobatorio" : "Reprobatorio";
        System.out.println("EL promedio es: " + mensaje);
        
        /*
        * DIFICULTAD EXTRA (opcional):
        * Crea un programa que imprima por consola todos los números comprendidos
        * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
        *
        * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
        */
        
        for(int i = 10; i < 56; i ++){
            if((i != 16) && (i % 3 != 0) && (i % 2 == 0)){
                System.out.println(i);
            }
        }
        
    }
    
}
