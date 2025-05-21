package av3recq2;

import java.util.Scanner;

public class Av3RecQ2 {
    static Scanner input;
    

    public static boolean[][] vendaIngressos(){
        //Criei a matriz com uma linha e uma coluna a mais, para não precisar usar
        //a linha zero e a coluna zero para facilitar. A matriz poderia ter o tamanho
        //Exato, mas neste caso seriam necessários alguns ajustes no código porque
        //a fila 1 estaria na linha 0 e a cadeira 1 na colunba da matriz e assim sucessivamente
        boolean[][] cad = new boolean[41][26];
        int fila, cadeira;
        fila = leiaFila();
        while (fila !=99){
            cadeira = leiaCadeira();
            if (cad[fila][cadeira]==true){
                System.out.println("Esta cadeira já está ocupada. Selecione outra.");
            }
            else {
                cad[fila][cadeira] = true;
            }
            fila = leiaFila();
        }
        return cad;
    }
    
        public static int leiaFila(){
        int f;
        do {
            System.out.print("Digite o número da fila: ");
            f = Integer.valueOf(input.nextLine());
            if (f <1 || (f > 40 && f !=99)){
                System.out.println("Fila inválida.");
            }
        } while (f <1 || (f > 40 && f !=99));
        return f;
    }
    
    public static int leiaCadeira(){
        int c;
        do {
            System.out.print("Digite o número da cadeira: ");
            c = Integer.valueOf(input.nextLine());
            if (c <1 || c > 25){
                System.out.println("Cadeira inválida.");
            }
        } while (c <1 || c > 25);
        return c;
    }
    
    
    public static void cadeirasVendidas(boolean[][] cad){
        //Notem que o i inicia em 1 e vai até 40
        int cont = 0;
        for (int i = 1; i <= 40; i++) {
            for (int j = 1; j <= 25; j++) {
                if (cad[i][j]==true){
                    cont++;
                }
            }
        }
        double perc = (double) cont / 1000 * 100;
        System.out.println("");
        System.out.println("Total de cadeiras vendidas: "+cont);
        System.out.println("Percentual de cadeiras vendidas: "+perc);
    }
    
    public static void cadeira18_9(boolean[][] cad){
        if (cad[18][9]==true){
            System.out.println("A cadeira 9 da fila 18 está ocupada.");
        }
        else {
            System.out.println("A cadeira 9 da fila 18 não está ocupada.");
        }
    }
    
    public static void cadeirasFila(boolean[][] cad){
        int cont, valor=0;
        
        for (int i = 1; i <= 40; i++) {
            cont = 0;
            for (int j = 1; j <= 25; j++) { 
                if (cad[i][j]==true){
                    cont++;
                }
            }
            System.out.println("Quantidade de cadeiras vendidas na fila "+i+": "+cont);
            if (i <=10){
                valor = valor + cont*100;
            }
            else {
                if (i <=30){
                    valor = valor + cont*70;
                }
                else {
                    valor = valor + cont*50;
                }
            }
        }
        System.out.println("Total arrecadado com os ingressos: "+valor);
    }
    
    public static void main(String[] args) {
        input = new Scanner(System.in);
        boolean[][] cadeiras = vendaIngressos();
        cadeirasVendidas(cadeiras);
        cadeira18_9(cadeiras);
        cadeirasFila(cadeiras);
    }
    
}
