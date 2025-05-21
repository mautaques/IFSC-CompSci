
package listadeexercíciosex11;

import java.util.Scanner;


public class ListadeExercíciosEx11 {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int x, h, m, rh, rm;

System.out.print("Digite um tempo em segundos:");
x = Integer.valueOf(input.nextLine());

h = x / 3600;

rh = x % 3600;

m = rh / 60;

rm = rh % 60;

System.out.print("O seu tempo em horas, minutos e segundos é:"+h+"h"+m+"m"+rm+"s");


        



    }
    
}
