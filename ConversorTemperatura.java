import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Solicita a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();
        
        // Converte para Fahrenheit
        double fahrenheit = (9 * celsius / 5) + 32;
        
        // Exibe o resultado
        System.out.printf("%.1f°C equivalem a %.1f°F", celsius, fahrenheit);
        
        input.close();
    }
}