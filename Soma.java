import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int n1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int n2 = entrada.nextInt();
        
        int soma = n1 + n2;
        System.out.println("A soma é: " + soma);
        
        entrada.close(); // Fechar o Scanner
    }
}

/*1. Faça um programa que receba dois números, calcule e mostre a
subtração do primeiro número pelo segundo.*/