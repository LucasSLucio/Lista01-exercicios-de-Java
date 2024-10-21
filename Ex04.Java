import java.util.Scanner;

public class NotasTurma {
    public static void main(String[] args) {
        // Enunciado:
        // Faça um programa que informe a nota de 0 a 10 para uma turma de 5 alunos e apresente:
        // ● A maior nota
        // ● A menor nota
        // ● A média da turma

        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5]; // Array para armazenar as 5 notas
        double maiorNota = 0, menorNota = 10, somaNotas = 0;

    
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + " (de 0 a 10): ");
            notas[i] = scanner.nextDouble();

            somaNotas += notas[i];

            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }

            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }
        }

        double media = somaNotas / 5;


        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A média da turma é: " + media);

        scanner.close();
    }
}
