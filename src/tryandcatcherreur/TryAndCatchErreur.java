/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tryandcatcherreur;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TryAndCatchErreur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("entrer v1");
        int a = sc.nextInt();

        System.out.println("entrer v2");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("on ne peut pas diviser par zero");
        } else {

            int z = a / b;
            
             System.out.println("resultat = " + z);
        }
      

       
    }

}
