import java.util.Scanner;

public class CalculadoraPrecoVeiculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o preço de fábrica do veículo: R$ ");
        double precoFabrica = input.nextDouble();
        
        System.out.print("Digite o percentual de lucro do distribuidor (%): ");
        double percentualLucro = input.nextDouble();
        
        System.out.print("Digite o percentual de impostos (%): ");
        double percentualImpostos = input.nextDouble();
        
        // Cálculos
        double lucroDistribuidor = precoFabrica * (percentualLucro / 100);
        double valorImpostos = precoFabrica * (percentualImpostos / 100);
        double precoFinal = precoFabrica + lucroDistribuidor + valorImpostos;
        
        // Saída formatada
        System.out.println("\nDetalhamento do preço:");
        System.out.printf("a) Lucro do distribuidor: R$ %.2f%n", lucroDistribuidor);
        System.out.printf("b) Valor dos impostos: R$ %.2f%n", valorImpostos);
        System.out.printf("c) Preço final ao consumidor: R$ %.2f%n", precoFinal);
        
        input.close();
    }
}


/*
 * 12. O custo ao consumidor de um carro novo é a soma do preço de fábrica
com o percentual de lucro do distribuidor e dos impostos aplicados ao
preço de fábrica. Faça um programa que receba o preço de fábrica de
um veículo, o percentual de lucro do distribuidor e o percentual de
impostos, calcule e mostre:
a. o valor correspondente ao lucro do distribuidor;
b. o valor correspondente aos impostos;
c. o preço final do produto.
 */