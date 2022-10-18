
package listadeexercíciosex9;

import java.util.Scanner;


public class ListadeExercíciosEx9 {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

double QCafé, CCafé, LLeite, CLeite, BBolacha, CBolacha, GCafé, GLeite, GBolacha, GTotal;
        
System.out.print("Atribua uma quantidade de kilos café:");
QCafé = Integer.valueOf(input.nextLine());
System.out.print("Atribua um custo ao café:");
CCafé = Integer.valueOf(input.nextLine());
System.out.print("Atribua uma quantidade de litros de leite:");
LLeite = Integer.valueOf(input.nextLine());
System.out.print("Atribua um custo ao leite:");
CLeite = Integer.valueOf(input.nextLine());
System.out.print("Atribua uma quantidade de pacotes de bolacha:");
BBolacha = Integer.valueOf(input.nextLine());
System.out.print("Atribua um custo aos pacotes de bolacha:");
CBolacha = Integer.valueOf(input.nextLine());

GCafé = QCafé * CCafé;

GLeite = LLeite * CLeite;

GBolacha = BBolacha * CBolacha;

GTotal = GCafé + GLeite + GBolacha;

System.out.print("O total de gastos com o café será de:"+GCafé+", com o leite:"+GLeite+", com a bolacha:"+GBolacha+" e o total de gastos será de:"+GTotal);






        
    }
    
}
