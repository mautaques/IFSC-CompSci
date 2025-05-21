package av3recq1;

import java.util.Scanner;

public class Av3RecQ1 {

    public static int[] leiaNumeros(){
        Scanner input = new Scanner(System.in);
        int[] num = new int[20];
        for (int i = 0; i < 20; i++) {
            do {
                System.out.print("Digite o número da posição "+i+": ");
                num[i] = Integer.valueOf(input.nextLine());
                if (num[i]<1 || num[i]>100){
                    System.out.println("Número inválido.");
                }
            } while(num[i]<1 || num[i]>100);
        }
        return num;
    }
    
    public static void imprimaLista(int[] num, int limInf, int limSup){
        System.out.println("Lista com os números de "+limInf+" a "+limSup);
        for (int i = 0; i < 20; i++) {
            if (num[i]>=limInf && num[i] <=limSup){
                System.out.println(num[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] numeros = leiaNumeros();
        imprimaLista(numeros,1,20);
        imprimaLista(numeros,21,40);
        imprimaLista(numeros,41,60);
        imprimaLista(numeros,61,80);
        imprimaLista(numeros,81,100);
    }
    
}
