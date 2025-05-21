
package listadeexerciciosex2;

import java.util.Scanner;


public class ListadeExerciciosEx2 {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int prova1, prova2, trabalho;
String aluno;

System.out.println("Digite o nome do aluno: ");
aluno = input.nextLine();
System.out.println("Digite a nota da primeira prova do "+aluno+": ");
prova1 = Integer.valueOf(input.nextLine());
System.out.println("Digite a nota da segunda prova do "+aluno+": ");
prova2 = Integer.valueOf(input.nextLine());
System.out.println("Digite a nota do trabalho do "+aluno+": ");
trabalho = Integer.valueOf(input.nextLine());
        
if (trabalho > 7 && (prova1 >= 6 || prova2 >= 6)) {
    System.out.println("Você está aprovado!");
}else{
     System.out.print("Você não está aprovado!");
}
          
}    
}

    
    

