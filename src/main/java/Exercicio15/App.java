/*
 - Descri��o do Exerc�cio:
 - Fa�a um algoritmo que receba um n�mero e diga se este n�mero est� no intervalo entre 100 e 200;
*/

package Exercicio15;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
        
        int numero;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite um valor:");
        
        numero = leitorScanner.nextInt();
        
        if(numero >= 100 && numero <= 200) {
            System.out.println("O n�mero est� no intervalo!");
        } else {
            System.out.println("O n�mero n�o est� no intervalo!");
        }
    }
}
