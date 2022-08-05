package com.company.logica.operadores;

/*      Para criar uma calculadora simples você vai precisar receber três informações pelo console. São os dois números que
        participarão da operação e também a operação que será realizada.

        Você vai receber o primeiro número, depois vai receber qual é a operação e, por último, o segundo número.

        Para os números que você vai receber pelo console, pode utilizar a mesma funcionalidade que já utilizamos
        aqui no curso - o *Scanner*. Para receber a operação você pode receber também um número que vai indicar a mesma.
        Por exemplo, o número 1 será adição, o 2 subtração, o 3 multiplicação e o 4 divisão.

        Com esses três valores - os dois números e qual será a operação - você pode utilizar a estrutura de decisão if
        para só realizar a operação que o usuário escolheu. Se estiver com dúvidas
        */

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        Double primeiroNumero = scanner.nextDouble();
        System.out.println("Operação [1 = + | 2 = - | 3 = * | 4 = /]: ");
        Integer operacao = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        Double segundoNumero = scanner.nextDouble();
        Double resultado = null;

        if (operacao.equals(1)) {
            resultado = primeiroNumero + segundoNumero;
        }

        if (operacao.equals(2)) {
            resultado = primeiroNumero - segundoNumero;
        }

        if (operacao.equals(3)) {
            resultado = primeiroNumero * segundoNumero;
        }

        if (operacao.equals(4)) {
            resultado = primeiroNumero / segundoNumero;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
