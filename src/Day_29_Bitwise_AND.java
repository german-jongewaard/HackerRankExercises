
/*

 * @author german


Objetivo:

¡Bienvenidos al último día! Hoy, estamos discutiendo operaciones 
operador a nivel de bits. 

Tarea:

Dado el conjunto S = {1,2,3, ..., N}. Encuentre dos enteros, A y B (donde) A <B, 
del conjunto S, de modo que el valor de A y B sea el máximo posible y también 
menor que un entero, K. En este caso, & representa el operador AND a nivel de bits.

Formato de entrada:

La primera línea contiene un número entero, T, el número de casos de prueba.
Cada una de las T líneas subsiguientes define un caso de prueba como 2 enteros 
separados por espacios, N y K, respectivamente.
 
*/
import java.util.Scanner;

/**
 *
 * @author german
 */
public class Day_29_Bitwise_AND {

   private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            if(((k-1)|k) > n && k%2==0){
                System.out.println(k-2);
            }else{
                System.out.println(k-1);               
            }
        }
    }
}

