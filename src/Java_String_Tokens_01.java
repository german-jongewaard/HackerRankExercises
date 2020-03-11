
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Dada una cadena, 8, que coincide con la expresión regular [A-Za-z!,? ._ '@] +, 
divide la cadena en tokens. Definimos un token como una o más letras alfabéticas 
consecutivas en inglés. Luego, imprima el número de fichas, seguido de cada 
ficha en una nueva línea.

Nota: Puede encontrar útil el método String.split para completar este desafío.

Formato de entrada

Una solo string de, 8.

Restricciones

1 <= length de 8 <= 4 * 10 potencia de 5

8 se compone de cualquiera de los siguientes: letras alfabéticas en inglés, 
espacios en blanco, signos de exclamación (!), Comas (,), signos de interrogación 
(?), Puntos (.), Guiones bajos (_), apóstrofos (') y en símbolos (@).

Formato de salida

En la primera línea, imprima un número entero, n, que denota el número de tokens 
en la cadena 8 (no es necesario que sean únicos). Luego, imprima cada una de 
las n fichas en una nueva línea en el mismo orden en que aparecen en la cadena 
de entrada 8.

Entrada de muestra

He is a very very good boy, isn't he?

Salida de muestra

10
He
is
a
very
very
good
boy
isn
t
he

Explicación

Consideramos que un token es un segmento contiguo de caracteres alfabéticos. 
Hay un total de 10 tokens en cadena, y cada token se imprime en el mismo orden 
en que aparece en la cadena 8.
.
 */

/**
 *
 * @author jongewaard
 */
public class Java_String_Tokens_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        // Write your code here.
        s.trim();
        StringTokenizer st = new StringTokenizer(s,("[_\\@!?.', ]"));
        int x = st.countTokens();
        System.out.println(x);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
                
        scan.close();
    }
    
    
    String[] myArray; 
    
}
