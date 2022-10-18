
package listadeexercíciosex8;

import java.util.Scanner;


public class ListadeExercíciosEx8 {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

double QuVe, VaVe, Sal;

System.out.print("Atribua um valor à um quantidade de carros vendida:");
QuVe = Integer.valueOf(input.nextLine());
System.out.print("atribua um valor às vendas:");
VaVe = Integer.valueOf(input.nextLine());

Sal = 2000 + QuVe * 150 + VaVe * 0.05;

System.out.print("O valor final do salário deste funcionário é igual a:"+Sal);




    }
    
}
