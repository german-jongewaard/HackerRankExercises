
import java.util.Scanner;

/*
 * Está actualizando la política de nombre de usuario en la plataforma de red 
interna de su empresa. De acuerdo con la política, un nombre de usuario se 
considera válido si se cumplen todas las siguientes restricciones:

- El nombre de usuario consta de 8 a 30 caracteres inclusive. Si el nombre de 
usuario consta de menos de 8 o más de 30 caracteres, entonces es un nombre 
de usuario no válido.
- El nombre de usuario solo puede contener caracteres alfanuméricos y guiones 
bajos (_). Los caracteres alfanuméricos describen el conjunto de caracteres que 
consiste en minúsculas [a - z], mayúsculas [A - Z] y dígitos [0 - 9].
- El primer carácter del nombre de usuario debe ser un carácter alfabético, 
es decir, ya sea en minúscula [a - z] o en mayúscula [A - Z].

Por ejemplo:
        Username                         Validity

        Julia                   INVALID; Username length < 8 characters
        Samantha                        VALID
        Samantha_21                     VALID
        1Samantha               INVALID; Username begins with non-alphabetic character
        Samantha?10_2A          INVALID; '?' character not allowed


Actualice el valor del campo regularExpression en la clase UsernameValidator 
para que la expresión regular solo coincida con nombres de usuario válidos.

Formato de entrada

La primera línea de entrada contiene un número entero n, que describe el número 
total de nombres de usuario. Cada una de las siguientes n líneas contiene una 
cadena que describe el nombre de usuario. El código auxiliar bloqueado lee las 
entradas y valida el nombre de usuario.

Restricciones

º 1 <= n <= 100
º El Username consta de cualquier carácter imprimible.

Formato de salida

Para cada uno de los nombres de usuario, el código auxiliar bloqueado se imprime
Válido si el nombre de usuario es válido; de lo contrario, no es válido cada
uno en una nueva línea.

Entrada de muestra 0

8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007

Salida de muestra 0

Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid

Explicación 0

Consulte el diagrama en la declaración de desafío.


 */

/**
 *
 * @author jongewaard
 */
public class Valid_Username_Regular_Expression_05 {

    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
    
}


class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = null;
}