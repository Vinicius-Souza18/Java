import java.util.Scanner;

public class ConversorMedidas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Solicita a medida em pés
        System.out.print("Digite a medida em pés: ");
        double pes = input.nextDouble();
        
        // Conversões
        double polegadas = pes * 12;          // 1 pé = 12 polegadas
        double jardas = pes / 3;              // 1 jarda = 3 pés
        double milhas = jardas / 1760;        // 1 milha = 1760 jardas
        
        // Exibe os resultados
        System.out.println("\nResultados das conversões:");
        System.out.printf("%.2f pés = %.2f polegadas%n", pes, polegadas);
        System.out.printf("%.2f pés = %.4f jardas%n", pes, jardas);
        System.out.printf("%.2f pés = %.6f milhas%n", pes, milhas);
        
        input.close();
    }
}

/*
 * 10. Sabe-se que:
1 pé = 12 polegadas
1 jarda = 3 pés
1 milha = 1.760 jardas
Faça um programa que receba uma medida em pés , faça as
conversões a seguir e mostre os resultados.
a. polegadas;
b. jardas;
c. milhas.

 */