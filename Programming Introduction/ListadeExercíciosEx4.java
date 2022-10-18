
package listadeexercícios.ex4;

import java.util.Scanner;

public class ListadeExercíciosEx4 {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int x, y, z;

System.out.print("Digite um número inteiro: ");
x = Integer.valueOf(input.nextLine());
System.out.print("Digite outro número inteiro: ");
y = Integer.valueOf(input.nextLine());

z = (x + y) * (x + y);

System.out.print("O quadrado da soma de "+x+"e "+y+"é igual a: "+z);


        
        

        



    }
    
}
