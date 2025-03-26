import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int n1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int n2 = entrada.nextInt();
        
        int Divisao = n1 / n2;
        System.out.println("A Divisao é: " + Divisao);
        
        entrada.close(); // Fechar o Scanner
    }
}

/*2. Faça um programa que receba dois números, calcule e mostre a divisão
do primeiro pelo segundo. Sabe-se que o segundo número não pode ser
zero, portanto, não é necessário se preocupar com isso neste exercício. */