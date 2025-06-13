import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8];
        
        // Recebendo as 8 notas do aluno
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = sc.nextDouble();
        }
        
        // Calculando médias bimestrais (são as notas mesmas, só para deixar claro)
        double b1 = notas[0];
        double b2 = notas[1];
        double b3 = notas[2];
        double b4 = notas[3];
        double b5 = notas[4];
        double b6 = notas[5];
        double b7 = notas[6];
        double b8 = notas[7];
        
        // Calculando médias semestrais
        double sem1 = (b1 + b2 + b3 + b4) / 4;
        double sem2 = (b5 + b6 + b7 + b8) / 4;
        
        // Calculando média final
        double mediaFinal = (sem1 + sem2) / 2;
        
        // Apresentando resultados
        System.out.println("\nResultados:");
        System.out.printf("1º Bimestre: %.2f\n", b1);
        System.out.printf("2º Bimestre: %.2f\n", b2);
        System.out.printf("3º Bimestre: %.2f\n", b3);
        System.out.printf("4º Bimestre: %.2f\n", b4);
        System.out.printf("1º Semestre: %.2f\n", sem1);
        System.out.printf("5º Bimestre: %.2f\n", b5);
        System.out.printf("6º Bimestre: %.2f\n", b6);
        System.out.printf("7º Bimestre: %.2f\n", b7);
        System.out.printf("8º Bimestre: %.2f\n", b8);
        System.out.printf("2º Semestre: %.2f\n", sem2);
        System.out.printf("Média Final: %.2f\n", mediaFinal);
        
        sc.close();
    }
}
