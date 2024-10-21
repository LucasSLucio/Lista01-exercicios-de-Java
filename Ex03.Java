/*Nome: Lucas da Silva Lucio
 Disciplina: Desenvolvimento de aplicações
 TURMA: TCTG241CNTDEV
 */
import java.util.Scanner;

public class DescontoCompra {
    public static void main(String[] args) {
        // Enunciado:
        // 3) Faça um programa que informe o valor cheio de uma compra e informe o valor do desconto e apresente o resultado:
        // ● O valor cheio é:
        // ● O valor do desconto:
        // ● O novo valor é:

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor cheio da compra: ");
        double valorCheio = scanner.nextDouble();

        System.out.print("Digite o valor do desconto: ");
        double desconto = scanner.nextDouble();
        double novoValor = valorCheio - desconto;

        System.out.println("O valor cheio é: " + valorCheio);
        System.out.println("O valor do desconto é: " + desconto);
        System.out.println("O novo valor é: " + novoValor);

        scanner.close();
    }
}
