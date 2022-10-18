
package listadeexerciciosex12;

import java.util.Scanner;

public class ListadeExerciciosEx12 {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

double Kg, VFinal;

System.out.print("Insira um valor em kilogramas:");
Kg = Integer.valueOf(input.nextLine());

VFinal = 0.45 + 39 * Kg;

System.out.print("O valor total a pagar é:"+VFinal);



    }
    
}
