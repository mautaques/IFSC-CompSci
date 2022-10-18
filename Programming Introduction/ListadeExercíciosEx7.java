
package listadeexercícios.ex7;

import java.util.Scanner;


public class ListadeExercíciosEx7 {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

double Qtipo1, Qtipo2, Qtipo3, Vtipo1, Vtipo2, Vtipo3, Vtotal;

System.out.print("Determine uma quantidade de picolés para o tipo 1:");
Qtipo1 = Integer.valueOf(input.nextLine());
System.out.print("Determine uma quatidade de picolés para o tipo 2:");
Qtipo2 = Integer.valueOf(input.nextLine());
System.out.print("Determine uma quantidade de picolés para o tipo 3:");
Qtipo3 = Integer.valueOf(input.nextLine());

Vtipo1 = Qtipo1 * 1.50;

Vtipo2 = Qtipo2 * 2.00;

Vtipo3 = Qtipo3 * 0.75;

Vtotal = Vtipo1 + Vtipo2 + Vtipo3;

System.out.print("O valor dos picolés do tipo 1 é:"+Vtipo1+", dos picolés do tipo 2:"+Vtipo2+", dos picolés do tipo 3:"+Vtipo3+", e por final o valor total é:"+Vtotal);





    }
    
}
