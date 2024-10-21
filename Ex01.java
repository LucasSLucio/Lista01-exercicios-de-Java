// Faça um Programa Que permita que seja digitada uma palavra e apresente como resultado:
// A palavra digitada foi:
// A palavra tem N dígitos
// A primeira letra X
// A letra central da palavra é X
// A última letra é X
// A palavra escrita ao contrário é:
// A palavra toda em maiusculo:
// A palavra toda em minusculo:

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma palavra: ");
        String palavra = scanner.nextLine();

        int tamanho = palavra.length();

        char primeiraLetra = palavra.charAt(0);
        char ultimaLetra = palavra.charAt(tamanho - 1);
        char letraCentral = palavra.charAt(tamanho / 2); 
       
        System.out.println("Você digitou: " + palavra);
        System.out.println("A palavra tem " + tamanho + " dígitos");
        System.out.println("A primeira letra é: " + primeiraLetra);
        System.out.println("A letra central da palavra é: " + letraCentral);
        System.out.println("A última letra é: " + ultimaLetra);
        System.out.println("A palavra escrita ao contrário é: " + new StringBuilder(palavra).reverse().toString());
        System.out.println("A palavra toda em maiúsculo: " + palavra.toUpperCase());
        System.out.println("A palavra toda em minúsculo: " + palavra.toLowerCase());

        scanner.close();
    }
}

