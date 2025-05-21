
package listadeexercíciosex10;

import java.util.Scanner;


public class ListadeExercíciosEx10 {

  
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int x;

double y, t;

System.out.print("Insira um número inteiro:");
x = Integer.valueOf(input.nextLine());

t = x / 2;

y = x % 2;

System.out.print("O resultado da divisão de "+x+" por 2 é igual a:"+t+" e o resto da divisão é:"+y);



       



    }
    
}
