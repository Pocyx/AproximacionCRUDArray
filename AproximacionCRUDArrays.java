/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aproximacioncrudarrays;

import java.util.Scanner;

/**
 *
 * @author PocyxDesigner
 */
public class AproximacionCRUDArrays {

    /**
     * -array
     * -POO ArrayList
     * -JSP MySQL
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1,x2,x3,x4,x5;
        int[] variables = new int[5];
        for(int i=0;i<variables.length;i++){
            System.out.print("Introduzca el valor de la variable "+i+" : ");
            variables[i]=Integer.parseInt(s.nextLine());
        }
        for(int i=0;i<variables.length;i++){
            System.out.print("x"+i+" : "+variables[i]+", ");
        }
        
    }
    
}
