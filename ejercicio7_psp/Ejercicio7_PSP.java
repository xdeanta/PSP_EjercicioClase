/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_psp;

import java.util.Scanner;

/**
 *
 * @author dam2a
 */
public class Ejercicio7_PSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Texto t;
        Scanner sc= new Scanner(System.in);
        Vocal[] vs = new Vocal[5];
        String entrada;
        char[] vocales = { 'a', 'e', 'i' , 'o', 'u'};
        entrada=sc.nextLine();
        t=new Texto(entrada);
        for(int i=0; i<5;i++){
            vs[i]=new Vocal(vocales[i],t);
        }
        for(int i=0; i<5;i++){
            vs[i].start();
        }
        try{
            for(int i=0; i<5;i++){
                vs[i].join();
            }
        }catch(Exception e){
            System.out.println("No se puede esperar por el hilo");
        }
        System.out.println("Total de vocales: " + t.getContador());
    }
    
}
