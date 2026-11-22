/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade5;

/**
 *
 * @author usuario
 */

import java.util.Scanner;

public class ATIVIDADE5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] Nota1 = new double[10];
        double[] Nota2 = new double[10];
        double[] Result = new double[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("\nAluno " + (i + 1));

            System.out.print("Digite a primeira nota: ");
            Nota1[i] = entrada.nextDouble();

            System.out.print("Digite a segunda nota: ");
            Nota2[i] = entrada.nextDouble();

            Result[i] = (Nota1[i] + Nota2[i]) / 2;
        }

        System.out.println("\n===== RESULTADO DOS ALUNOS =====");

        for (int i = 0; i < 10; i++) {

            System.out.println("\nAluno " + (i + 1));
            System.out.println("Media: " + Result[i]);

            if (Result[i] >= 7) {
                System.out.println("Situacao: Aprovado");
            } else {
                System.out.println("Situacao: Reprovado");
            }
        }

        entrada.close();
    }
}
