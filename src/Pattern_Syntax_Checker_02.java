
import java.util.Scanner;
import java.util.regex.*;

/*
 * Usando Regex, podemos fácilmente hacer coincidir o buscar patrones en un 
texto. Antes de buscar un patrón, debemos especificar uno utilizando una sintaxis bien definida.

En este problema, se le da un patrón. Debe verificar si la sintaxis del patrón dado es válida.

Nota: En este problema, una expresión regular solo es válida si puede compilarla 
utilizando el método Pattern.compile.

Formato de entrada

La primera línea de entrada contiene un número entero N, que indica el 
número de casos de prueba. Las siguientes N líneas contienen una cadena de 
caracteres imprimibles que representan el patrón de una expresión regular.

Formato de salida

Para cada caso de prueba, imprima Válido si la sintaxis del patrón dado es 
correcta. De lo contrario, imprima Inválido. No imprima las cotizaciones.

Entrada de muestra

3
([A-Z]) (. +)
[AZ [a-z] (a-z)
batcatpat (nat

Salida de muestra

Valid
Invalid
Invalid
 */

/**
 *
 * @author jongewaard
 */
public class Pattern_Syntax_Checker_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
                String pattern = in.nextLine();
        //Write your code
        try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
        
        }
    }
    
}
