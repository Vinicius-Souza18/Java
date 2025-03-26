import java.util.Scanner;

public class CalculoEnergia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o valor do salário mínimo: R$ ");
        double salarioMinimo = input.nextDouble();
        
        System.out.print("Digite a quantidade de quilowatts consumidos: ");
        double quilowatts = input.nextDouble();
        
        // Cálculos
        double valorKw = salarioMinimo / 5;  // Cada KW custa 1/5 do salário mínimo
        double valorTotal = valorKw * quilowatts;
        double valorComDesconto = valorTotal * 0.85;  // Desconto de 15%
        
        // Saída dos resultados
        System.out.printf("\na) Valor de cada quilowatt: R$ %.2f%n", valorKw);
        System.out.printf("b) Valor a ser pago: R$ %.2f%n", valorTotal);
        System.out.printf("c) Valor com desconto de 15%%: R$ %.2f%n", valorComDesconto);
        
        input.close();
    }
}