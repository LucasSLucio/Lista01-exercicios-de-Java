/*Nome: Lucas da Silva Lucio
 Disciplina: Desenvolvimento de aplicações
 TURMA: TCTG241CNTDEV
 */
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // Enunciado:
        // 2. Faça um programa que permita que seja digitada um número e que apresente como resultado:
        // ● O número é : (par ou ímpar)
        // ● O número é : (positivo ou negativo)
        // ● O número é primo: (sim ou não)
        // ● A raiz quadrada do número:
        // ● O número elevado a 3 é:

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número é: par");
        } else {
            System.out.println("O número é: ímpar");
        }
        if (numero >= 0) {
            System.out.println("O número é: positivo");
        } else {
            System.out.println("O número é: negativo");
        }
        boolean primo = true;
        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo) {
            System.out.println("O número é primo: sim");
        } else {
            System.out.println("O número é primo: não");
        }
        System.out.println("A raiz quadrada do número é: " + Math.sqrt(numero));

        System.out.println("O número elevado a 3 é: " + Math.pow(numero, 3));

        scanner.close();
    }
}

