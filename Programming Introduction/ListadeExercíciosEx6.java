
package listadeexercíciosex6;

import java.util.Scanner;

public class ListadeExercíciosEx6 {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

double c, f;

System.out.print("Digite uma temperatura em Graus Celsius:");
c = Integer.valueOf(input.nextLine());

f = 9/5.0 * c + 32;

System.out.print("A temperatura correspondente em Fahrenheit é:"+f);



    }
    
}
