
package listadeexercíciosex5;

import java.util.Scanner;


public class ListadeExercíciosEx5 {

    public static void main(String[] args) {
Scanner input = new Scanner (System.in);

int x, y, z, t;

System.out.print("Digite a medida da base do retangulo: ");
x = Integer.valueOf(input.nextLine());
System.out.print("Digite a medida da altura do retangulo: ");
y = Integer.valueOf(input.nextLine());

z = x * y;

t = (x * 2) + (y * 2);

System.out.print("A medida da área deste retangulo é:"+z+" e a medida do perímetro deste retangulo é:2"+t);

        
        
        
      
    }
    
}
