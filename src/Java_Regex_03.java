
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*
 * Escriba una clase llamada MyRegex que contendrá un string pattern. Debe 
escribir una expresión regular y asignarla al patrón de manera que pueda usarse 
para validar una dirección IP. 
Use la siguiente definición de una dirección IP:

La dirección IP es una cadena en la forma "A.B.C.D", donde el valor de A, B, C 
y D puede variar de 0 a 255. Se permiten ceros a la izquierda. La longitud de 
A, B, C o D no puede ser mayor que 3.

Alguna dirección IP válida:

000.12.12.034
121.234.12.12
23.45.12.56

Alguna dirección IP no válida:

000.12.234.23.23
666.666.23.23
.213.123.23.32
23.45.22.32.
I.Am.not.an.ip

En este problema, se le proporcionarán cadenas que contienen cualquier combinación de caracteres ASCII. Debe escribir una expresión regular para encontrar las IP válidas.
Simplemente escriba la clase MyRegex que contiene un patrón de cadena. La cadena debe contener la expresión regular correcta.

(La clase MyRegex NO DEBE ser pública)

 */

/**
 *
 * @author jongewaard
 */
public class Java_Regex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

 class MyRegex{
    public String pattern = "((([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}"
                            + "([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5]))\\b";    
}

    
 


