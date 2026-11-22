/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade4;

/**
 *
 * @author usuario
 */
public class ATIVIDADE4 {

    public static void main(String[] args) {

        int[] A = {2, 5, 8, 11, 14, 17, 20, 23, 26, 29};

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++) {
            if (A[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        double percentualPares = (pares * 100.0) / 10;
        double percentualImpares = (impares * 100.0) / 10;

        System.out.println("---Percentual de elementos pares: "
                + percentualPares + "%");

        System.out.println("---Percentual de elementos impares: "
                + percentualImpares + "%");
    }
}


