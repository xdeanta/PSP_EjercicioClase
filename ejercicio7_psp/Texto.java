/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_psp;

/**
 *
 * @author dam2a
 */
public class Texto {
    private String texto;
    private int contador;
    private boolean mod;

    public Texto(String texto) {
        this.texto = texto;
        contador=0;
        mod=false;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public synchronized int getContador() {
        int aux=0;
        while(mod==true){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Hilo interrumpido");
            }
        }
            
        return contador;
    }

    public synchronized void setContador(int contador) {
        while(mod==true){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Hilo interrumpido");
            }
        }
        mod=true;
        this.contador=contador;
        mod=false;
        notifyAll();
    }
}
