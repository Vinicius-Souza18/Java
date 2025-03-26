import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.printf("A média das três notas é: %.2f", media);
        
        entrada.close();
    }
}
/*3. Faça um programa que receba três notas de um estudante, calcule e
mostre a média aritmética entre elas (este exercício é similar ao exemplo
mostrado a neste capítulo, mas leva em consideração três notas e não
quatro).
*/