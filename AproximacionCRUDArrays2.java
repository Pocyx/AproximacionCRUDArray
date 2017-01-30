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
public class AproximacionCRUDArrays2 {
    /**
     * -array
     * -POO ArrayList
     * -JSP MySQL
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] tipo = {"Interna","Externa","","",""};
        String[] marca = {"Sodial","Toogoo","","",""};
        double[] precio = {1.40,1.62,0.0,0.0,0.0};
        String nuevaTarjeta = "";
        int cont = 0;
        boolean fin = false;
        do{
            System.out.println("Seleccione:\n1:Insertar\n2:Modificar\n3:Borrar\n4:Ver\n5:Salir");
            int valor = Integer.parseInt(s.nextLine());
            switch(valor){
                case 1:
                    System.out.println("Opcion insertar: ");
                    do{
                        System.out.print("Introduzca el tipo: ");
                        tipo[cont]=s.nextLine();
                        System.out.print("Introduzca la marca: ");
                        marca[cont]=s.nextLine();
                        System.out.print("Introduzca el precio: ");
                        precio[cont]=Integer.parseInt(s.nextLine());
                        System.out.println("Pulsa n para introducir otra tarjeta o t para terminar. ");
                        nuevaTarjeta = s.nextLine();
                        if(nuevaTarjeta.equals("n")){
                            continue;
                        } else if(nuevaTarjeta.equals("t")){
                            break;
                        }
                        cont++;
                    }while(nuevaTarjeta.equals("n"));

                case 2:
                    cont=0;
                    System.out.println("Opcion modificar: ");
                    do{
                        System.out.print("Introduzca el tipo: ");
                        String tipoI=s.nextLine();
                        if(!tipoI.equals("")){
                            tipo[cont]=tipoI;
                        }
                        System.out.print("Introduzca la marca: ");
                        String marcaI=s.nextLine();
                        if(!marcaI.equals("")){
                            marca[cont]=marcaI;
                        }
                        System.out.print("Introduzca el precio: ");
                        int precioI=Integer.parseInt(s.nextLine());
                        if(!precio.equals("")){
                            precio[cont]=precioI;
                        }
                        System.out.println("Pulsa n para introducir otra tarjeta o t para terminar. ");
                        nuevaTarjeta = s.nextLine();
                        if(nuevaTarjeta.equals("n")){
                            continue;
                        } else if(nuevaTarjeta.equals("t")){
                            break;
                        }
                        cont++;
                    }while(nuevaTarjeta.equals("n"));
                    break;
                case 3:
                    System.out.println("Opcion borrar: ");
                    cont=0;
                    do{
                        System.out.print("Introduzca el tipo: ");
                        String tipoI=s.nextLine();
                        if(tipoI.equals("")){
                            tipo[cont]=tipoI;
                        }
                        System.out.print("Introduzca la marca: ");
                        String marcaI=s.nextLine();
                        if(marcaI.equals("")){
                            marca[cont]=marcaI;
                        }
                        System.out.print("Introduzca el precio: ");
                        int precioI=Integer.parseInt(s.nextLine());
                        if(precio.equals("")){
                            precio[cont]=precioI;
                        }
                        System.out.println("Pulsa n para introducir otra tarjeta o t para terminar. ");
                        nuevaTarjeta = s.nextLine();
                        if(nuevaTarjeta.equals("n")){
                            continue;
                        } else if(nuevaTarjeta.equals("t")){
                            break;
                        }
                        cont++;
                    }while(nuevaTarjeta.equals("n"));
                    break;
                case 4:
                    System.out.println("Opcion ver: ");
                    for(int i=0;i<tipo.length;i++){
                        System.out.println("Tipo: "+tipo[i]+"\nMarca: "+marca[i]+"\nPrecio: "+precio[i]);
                    }
                    break;
                case 5:
                    fin=true;
                    break;
            }
        }while(fin!=true);
        
        
    }
}
