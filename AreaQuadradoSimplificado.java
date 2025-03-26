import java.util.Scanner;

public class AreaQuadradoSimplificado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor do lado do quadrado: ");
        double lado = input.nextDouble();
        
        double area = lado * lado;  // Forma mais simples de calcular quadrado
        
        System.out.printf("A área do quadrado é: %.2f", area);
        
        input.close();
    }
}

/*
 * 
 * 9. Faça um programa que calcule e mostre a área de um quadrado. Sabese que
𝐴 = 𝑙𝑎𝑑𝑜2
 */