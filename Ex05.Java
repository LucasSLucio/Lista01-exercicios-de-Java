/*Nome: Lucas da Silva Lucio
 Disciplina: Desenvolvimento de aplicações
 TURMA: TCTG241CNTDEV
 */
import java.util.Scanner;

public class ConceitoNota {
    public static void main(String[] args) {
        // Enunciado:
        // Faça um programa que informe uma nota de 0 a 100 e apresente o conceito:
        // ● Conceito A se a nota for maior do que 90;
        // ● Conceito B se a nota for maior do que 80 até 90;
        // ● Conceito C se a nota for maior do que 70 até 80;
        // ● Conceito D se a nota for maior do que 60 até 70;
        // ● Conceito E se a nota for menor do que 60;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota (de 0 a 100): ");
        int nota = scanner.nextInt();
        if (nota > 90) {
            System.out.println("Conceito A");
        } else if (nota > 80) {
            System.out.println("Conceito B");
        } else if (nota > 70) {
            System.out.println("Conceito C");
        } else if (nota > 60) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }

        scanner.close();
    }
}
