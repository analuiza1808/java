import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        // Cria o objeto Scanner para leitura da entrada
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Realiza as conversões
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Exibe os resultados
        System.out.println("\nTemperatura em Celsius: " + celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");

        // Fecha o scanner
        scanner.close();
    }
}
