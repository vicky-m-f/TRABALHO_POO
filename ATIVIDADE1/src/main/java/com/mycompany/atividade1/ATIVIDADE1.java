/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade1;

/**
 *
 * @author usuario
 */
public class ATIVIDADE1 {

    public static void main(String[] args) {
       int[] a = {5, 10, 3, 8, 2, 7, 1, 9, 4, 6}; 
       int[] b = new int[a.length];
       for (int i = 0; i < a.length; i++) {
          b[i] = a[i] * i;
       }
        System.out.println("--- Vetor A ---");
       for (int i = 0; i < a.length; i++) {
     System.out.println("A[" + i + "] = " + a[i]);
        }

     System.out.println("\n--- Vetor B ---");
        for (int i = 0; i < b.length; i++) {
     System.out.println("B[" + i + "] = " + b[i]);
         }
    }
}
