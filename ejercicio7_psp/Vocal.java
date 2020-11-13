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
public class Vocal extends Thread{
    private char idchar;
    private Texto texto;

    public char getIdchar() {
        return idchar;
    }

    public void setId(char idchar) {
        this.idchar = idchar;
    }

    public Texto getTexto() {
        return texto;
    }

    public void setTexto(Texto texto) {
        this.texto = texto;
    }

    public Vocal(char idchar, Texto texto) {
        this.idchar = idchar;
        this.texto = texto;
    }

    public void contVocal(){
        String aux;
        int aux_cont=0;
        int total_cont=0;
        aux=texto.getTexto();
        for(int i=0;i<aux.length();i++){
            if(aux.charAt(i) == idchar){
                aux_cont++;
                texto.setContador(texto.getContador()+1);
            }
        }
        System.out.println("Cantidad de " + idchar + ": " + aux_cont);
        /*total_cont=texto.getContador();
        texto.setContador(total_cont + aux_cont);*/
    }
    
    @Override
    public void run(){
        contVocal();
    }
    
}
