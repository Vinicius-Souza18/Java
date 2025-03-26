import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o salário base do funcionário: R$ ");
        double salarioBase = input.nextDouble();
    
        double gratificacao = salarioBase * 0.05;
    
        double imposto = salarioBase * 0.07;
        
 
        double salarioLiquido = salarioBase + gratificacao - imposto;
        
        System.out.printf("\nSalário base: R$ %.2f", salarioBase);
        System.out.printf("\nGratificação (+5%%): R$ %.2f", gratificacao);
        System.out.printf("\nImposto (-7%%): R$ %.2f", imposto);
        System.out.printf("\nSalário a receber: R$ %.2f", salarioLiquido);
        
        input.close();
    }
}

/*4.Faça um programa que receba o salário base de um funcionário, calcule
e mostre o salário a receber, sabendo-se que o funcionário tem
gratificação de 5% sobre o salário base (que será acrescentado ao
salário) e paga imposto de 7% sobre este salário (o que será
descontado do salário). */