/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2;

/**
 *
 * @author usuario
 */
public class ATIVIDADE2 {

    public static void main(String[] args) {
       int[] a = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
       int[] b = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
       int[] c = new int[a.length];
       for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
            
        }
            System.out.println("--- Vetor A ---");
     for (int i = 0; i < a.length; i++) {
         System.out.println("A[" + i + "] = " + a[i]);
     }

     System.out.println("\n--- Vetor B ---");
     for (int i = 0; i < b.length; i++) {
         System.out.println("B[" + i + "] = " + b[i]);
     }

     System.out.println("\n--- Vetor C (A + B) ---");
     for (int i = 0; i < c.length; i++) {
         System.out.println("C[" + i + "] = " + c[i]);
     }
    }
    
}
