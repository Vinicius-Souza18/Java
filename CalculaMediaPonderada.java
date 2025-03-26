import java.util.Scanner;

public class CalculaMediaPonderada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Entrada de dados
        System.out.println("Digite as três notas e seus respectivos pesos:");
        
        System.out.print("Nota 1: ");
        double nota1 = input.nextDouble();
        System.out.print("Peso 1: ");
        double peso1 = input.nextDouble();
        
        System.out.print("Nota 2: ");
        double nota2 = input.nextDouble();
        System.out.print("Peso 2: ");
        double peso2 = input.nextDouble();
        
        System.out.print("Nota 3: ");
        double nota3 = input.nextDouble();
        System.out.print("Peso 3: ");
        double peso3 = input.nextDouble();
        
        // Cálculos
        double somaProdutos = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = somaProdutos / somaPesos;
        
        // Saída formatada
        System.out.println("\nResultados:");
        System.out.printf("(%.1f × %.1f) + (%.1f × %.1f) + (%.1f × %.1f) = %.1f%n",
                         nota1, peso1, nota2, peso2, nota3, peso3, somaProdutos);
        System.out.printf("Soma dos pesos: %.1f%n", somaPesos);
        System.out.printf("Média Ponderada: %.1f ÷ %.1f = %.1f%n",
                         somaProdutos, somaPesos, mediaPonderada);
        
        input.close();
    }
}

/* 7 Faça um programa que receba três notas e seus respectivos pesos,
calcule e mostre a média ponderada dessas notas. Para calcular a
média ponderada, multiplique cada nota por seus respectivos pesos,
some todos os resultados e divida pela soma dos pesos. Por exemplo,
se as notas forem 10, 5 e 6, e os pesos 1, 2 e 3, a média final do
estudante seria 10 x 1 + 5 x 2+ 3 x 6, que resulta em 10 + 10 + 18 = 38. */