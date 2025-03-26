import java.util.Scanner;

public class CalculoSalarioComissao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o salário fixo do funcionário: R$ ");
        double salarioFixo = input.nextDouble();
        
        System.out.print("Digite o valor total das vendas: R$ ");
        double valorVendas = input.nextDouble();
        
        // Calcula a comissão de 4% sobre as vendas
        double comissao = valorVendas * 0.04;
        
        // Calcula o salário final
        double salarioFinal = salarioFixo + comissao;
        
        System.out.printf("\nSalário fixo: R$ %.2f", salarioFixo);
        System.out.printf("\nComissão (4%% sobre R$ %.2f): R$ %.2f", valorVendas, comissao);
        System.out.printf("\nSalário final: R$ %.2f", salarioFinal);
        
        input.close();
    }
}

/*6. Um funcionário recebe um salário fixo mais 4% de comissão sobre as
vendas (4% do valor das vendas efetuadas pelo funcionário). Faça um
programa que receba o salário fixo do funcionário e o valor de suas
vendas, calcule e mostre a comissão e seu salário final.
*/