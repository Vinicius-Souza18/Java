import java.util.Scanner;

public class DescontoProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o preço do produto: R$ ");
        double precoOriginal = entrada.nextDouble();
        
        double desconto = precoOriginal * 0.10; // Calcula 10% de desconto
        double novoPreco = precoOriginal - desconto;
        
        System.out.printf("Preço original: R$ %.2f%n", precoOriginal);
        System.out.printf("Desconto (10%%): R$ %.2f%n", desconto);
        System.out.printf("Novo preço: R$ %.2f", novoPreco);
        
        entrada.close();
    }
}

/*Faça um programa que receba o preço de um produto, calcule e mostre
o novo preço, sabendo-se que este sofreu um desconto de 10%. Por
exemplo, se o produto custa R$ 100,00, o novo preço será 100 menos
10% de cem, que é 100 x 10 / 100. Essa conta é igual a 10, ficando o
novo preço R$ 90,00. */