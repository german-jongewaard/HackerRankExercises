
import java.util.Scanner;
import java.util.regex.*;

/*
 * En este desafío, usamos expresiones regulares (RegEx) para eliminar instancias 
de palabras que se repiten más de una vez, pero conservan la primera aparición de 
cualquier palabra repetida que no distinga entre mayúsculas y minúsculas. Por ejemplo, 
las palabras love y to se repiten en la oración I love Love to To to code. ¿Puede 
completar el código en el editor para que convierta el código 
I love Love to To TO en I love to code?

Para resolver este desafío, complete las siguientes tres líneas:

Escriba un RegEx que coincida con cualquier palabra repetida.
Complete el segundo argumento de compilación para que el RegEx compilado 
no distinga entre mayúsculas y minúsculas.
Escriba los dos argumentos necesarios para replaceAll de modo que cada 
palabra repetida se reemplace por la primera instancia de la palabra encontrada 
en la oración. Debe ser la primera aparición exacta de la palabra, ya que la 
salida esperada distingue entre mayúsculas y minúsculas.

Para resolver este desafío, complete las siguientes tres líneas:

1) Escriba un RegEx que coincida con cualquier palabra repetida.
2) Complete el segundo argumento de compilación para que el RegEx compilado no 
distinga entre mayúsculas y minúsculas.
3) Escriba los dos argumentos necesarios para replaceAll de modo que cada 
palabra repetida se reemplace por la primera instancia de la palabra encontrada 
en la oración. Debe ser la primera aparición exacta de la palabra, ya que la 
salida esperada distingue entre mayúsculas y minúsculas.

Nota: este desafío utiliza un corrector personalizado; fracasará en el desafío 
si modifica cualquier otra cosa que no sean las tres ubicaciones que los comentarios 
le indican que complete. Para restaurar el código original del editor, cree un 
nuevo búfer haciendo clic en el icono de la rama en la parte superior izquierda 
del editor.

Formato de entrada

La siguiente entrada se maneja para usted el código de código auxiliar dado:

La primera línea contiene un número entero,
, denotando el número de oraciones.
Cada una de las líneas subsiguientes contiene una sola oración que consta de 
letras alfabéticas en inglés y caracteres de espacio en blanco.

Restricciones

- Cada oración consta de, como máximo 10(a la 4 potencia), letras alfabéticas en 
inglés y espacios en blanco.
- 1<= n <= 100

Formato de salida

El código auxiliar en el editor imprime la oración modificada por la línea 
replaceAll en stdout. La cadena modificada debe ser una versión modificada de 
la oración inicial donde se eliminan todas las repeticiones de cada palabra.

Entrada de muestra

5
Goodbye bye bye world world world
Sam went went to to to his business
Reya is is the the best player in eye eye game
in inthe
Hello hello Ab aB

Salida de muestra

Goodbye bye world
Sam went to his business
Reya is the best player in eye game
in inthe
Hello Ab

Explicación

1) Eliminamos la segunda aparición de adiós y la segunda y tercera aparición del 
mundo de Adiós adiós adiós mundo mundo para obtener Adiós adiós mundo.
2) Eliminamos la segunda aparición de go y la segunda y tercera aparición de a 
de Sam fue a su negocio para que Sam fuera a su negocio.
3) Eliminamos la segunda aparición de is, la segunda aparición de the, y la 
segunda aparición de eye de Reya es el mejor jugador en el juego eye eye para 
obtener Reya es el mejor jugador en el juego eye.
4) La oración en inthe no tiene palabras repetidas, por lo que no la modificamos.
5) Eliminamos la segunda aparición de ab de Hello hello Ab aB para obtener Hello 
Ab. Es importante tener en cuenta que nuestra coincidencia no distingue entre 
mayúsculas y minúsculas, y específicamente conservamos la primera aparición de 
la palabra coincidente en nuestra cadena final.

 */

/**
 *
 * @author jongewaard
 */
public class Java_Regex_2_Duplicate_Words_04 {

    public static void main(String[] args) {

        String regex = "/* Write a RegEx matching repeated words here. */";
        Pattern p = Pattern.compile(regex, /* Insert the correct Pattern flag here.*/);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(/* The regex to replace */, /* The replacement. */);
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
    
}
