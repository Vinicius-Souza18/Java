import java.util.Scanner;

public class CalculaAreaTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Solicita a base e a altura
        System.out.print("Digite a base do triângulo: ");
        double base = input.nextDouble();
        
        System.out.print("Digite a altura do triângulo: ");
        double altura = input.nextDouble();
        
        // Calcula a área
        double area = (base * altura) / 2;
        
        // Exibe o resultado
        System.out.printf("A área do triângulo é: %.2f", area);
        
        input.close();
    }
}

/*
8. Faça um programa que calcule e mostre a área de um triângulo. Sabese que: Área = (base x altura) / 2. A base e altura devem ser informadas
pelo usuário.
 * 
*/