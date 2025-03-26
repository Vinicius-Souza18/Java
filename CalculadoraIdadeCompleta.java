import java.util.Scanner;

public class CalculadoraIdadeCompleta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = input.nextInt();
        
        System.out.print("Digite o ano atual: ");
        int anoAtual = input.nextInt();
        
        // Validação simples
        if (anoAtual <= anoNascimento) {
            System.out.println("Erro: O ano atual deve ser maior que o ano de nascimento!");
            return;
        }
        
        // Cálculos
        int idadeAnos = anoAtual - anoNascimento;
        int idadeMeses = idadeAnos * 12;
        int idadeDias = idadeAnos * 365;
        int idadeSemanas = idadeAnos * 52;
        
        // Saída formatada
        System.out.println("\nResultados:");
        System.out.println("a) Idade em anos: " + idadeAnos);
        System.out.println("b) Idade em meses: " + idadeMeses);
        System.out.println("c) Idade em dias: " + idadeDias);
        System.out.println("d) Idade em semanas: " + idadeSemanas);
        
        input.close();
    }
}

/*11. Faça um programa que receba o ano de nascimento de uma pessoa e o
ano atual, calcule e mostre:
a. a idade dessa pessoa em anos;
b. a idade dessa pessoa em meses;
c. a idade dessa pessoa em dias (considerando que cada ano
possui 365 dias);
d. a idade dessa pessoa em semanas (cada ano possui 52
semanas). */