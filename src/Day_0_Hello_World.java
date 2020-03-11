
import java.util.Scanner;

/**
 *
 * @author german
 */
public class Day_0_Hello_World {

 public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada de la entrada estándar.
		Scanner scan = new Scanner(System.in); 
		
		// Lee una línea completa de entrada desde la entrada estándar y l guarda en la variable, inputString.
		String inputString = scan.nextLine(); 

		// Cierra el objeto Scanner, porque hemos terminado de leer.
		scan.close(); 
      
		// Imprime una cadena literal que dice "Hello, World.". al stdout.
		System.out.println("Hello, World.");
      
	    // TODO: Imprime el contenido de inputString en stdout.
        System.out.println(inputString);
	}
}
